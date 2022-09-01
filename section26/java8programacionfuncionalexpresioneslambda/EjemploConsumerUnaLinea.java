package section26.java8programacionfuncionalexpresioneslambda;

import section26.java8programacionfuncionalexpresioneslambda.models.Usuario;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EjemploConsumerUnaLinea {
    public static void main(String[] args) {

        Consumer<Date> consumidor = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(fecha));
        };
        consumidor.accept(new Date());
        //en una sola linea
        BiConsumer<String, Integer> consumidorBi = (nombre, edad) -> System.out.println(nombre + " tiene " + edad + " años");


        consumidorBi.accept("pepe", 28);

        //Consumer<String> consumidor2 = mensaje -> System.out.println(mensaje);
        //Reemplazando lambda con metodo de referencia
        Consumer<String> consumidor2 = System.out::println;
        consumidor2.accept("Hola mundo lambda");

        List<String> nombres = Arrays.asList("andres", "pepe", "luz", "paco");
        nombres.forEach(consumidor2);
        System.out.println(nombres.contains("andres"));

        //Supplier<Usuario> creaUsuario = () -> new Usuario();
         Supplier<Usuario> creaUsuario = Usuario::new;
        Usuario usuario = creaUsuario.get();
        //Usuario usuario = new Usuario();

        //BiConsumer<Usuario, String> asignarNombre = (persona , nombre) ->{
        //    persona.setNombre(nombre);
        //};
        //de forma simplificada: (al ser una instruccion)
        BiConsumer<Usuario, String> asignarNombre = Usuario::setNombre;
        asignarNombre.accept(usuario, "Andres");
        System.out.println("Nombre usuario: " + usuario.getNombre());

        //otra expresion lambda
        Supplier<String> proveedor = () -> "Hola mundo lambda supplier";


        System.out.println(proveedor.get());
    }
}
