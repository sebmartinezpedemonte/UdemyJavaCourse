package section30.annotations.ejemplo.procesador;

import section30.annotations.ejemplo.Init;
import section30.annotations.ejemplo.JsonAtributo;
import section30.annotations.ejemplo.procesador.exception.JsonSerializadorException;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

//creamos esta clase para poder reutilizar este codigo
    // (en vez de que sea pueda utilizar solo una vez en el main
public class JsonSerializador {
    //serializar es el proceso de convertir
    //un objeto en un Json o en un xml, en bytes



        //tiene que ser estatico para que se puede invocar aca
        public static void inicializarObjeto(Object object){
            if(Objects.isNull(object)){
                throw new JsonSerializadorException("El objeto a serializar no puede ser null!"
                );
            }
            Method[] metodos = object.getClass().getDeclaredMethods();
            Arrays.stream(metodos).filter(m -> m.isAnnotationPresent(Init.class))
                    .forEach(m -> {
                        m.setAccessible(true);
                        try {
                            m.invoke(object);
                        } catch (IllegalAccessException | InvocationTargetException e) {
                            throw new JsonSerializadorException("Error al serializar, no se puede inicializar el objeto"
                            +e.getMessage());
                        }
                    });
        }


    //creamos un metodo que devuelve un String

    //lo hacemos Object porque queremos que sea generico
    //estatico porque recibe un objeto y devuelve otro objeto
    //de tipo String. No tenemos atributos ni nada adentro del contexto del objeto
    public static String convertirJson(Object object){
        if(Objects.isNull(object)){
            throw new JsonSerializadorException("El objeto a serializar no puede ser null!");
        }
        inicializarObjeto(object);
        Field[] atributos = object.getClass().getDeclaredFields();

        return Arrays.stream(atributos)
                .filter(f -> f.isAnnotationPresent(JsonAtributo.class))
                .map(f -> {
                    f.setAccessible(true); //el campo a pesar de que sea private lo podemos acceder mediante reflexion con este metodo
                    String nombre = f.getAnnotation(JsonAtributo.class).nombre().equals("")
                            ? f.getName()
                            : f.getAnnotation(JsonAtributo.class).nombre();
                    try {
                        Object valor = f.get(object);
                        if(f.getAnnotation(JsonAtributo.class).capitalizar() &&
                        valor instanceof String){
                            String nuevoValor = (String)valor;
                            //Para poner la primera letra capitalizada
                            //nuevoValor = String.valueOf( nuevoValor.charAt(0)).toUpperCase() +//otra forma de capitalizar: nuevo Valor = nuevoValor.substring(0,1). toUpperCase() + (lo que sigue debajo)
                            //nuevoValor.substring(1).toLowerCase();
                            //para capitalizar cada palabra con API stream
                            nuevoValor = Arrays.stream(nuevoValor.split(" "))
                                    .map(palabra -> palabra.substring(0, 1).toUpperCase()
                                    + palabra.substring(1).toLowerCase())
                                    .collect(Collectors.joining(" ")); //asi vuelve como estaba antes pero con cada palabra capitalizada

                            f.set(object, nuevoValor);
                        }
                        return "\"" + nombre + "\":\"" + f.get(object) + "\"";
                    } catch (IllegalAccessException e) {
                        throw new JsonSerializadorException("Error al serializar a json: " + e.getMessage());
                    }

                })
                .reduce("{" , (a,b) ->{
                    if("{".equals(a) ){
                        return a + b;
                    }
                    return a + ", " + b;
                }).concat("}");
    }

}
