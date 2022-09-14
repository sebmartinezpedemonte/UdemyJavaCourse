package section26.expresioneslambdaprogramacionfuncionaljava8.assignment30;
/*
Para la tarea se pide como requerimiento escribir una expresión lambda que cuenta la cantidad de veces que
se repiten las palabras de una frase y devuelva la mas repetida, según lo siguiente:
La expresión lambda debe recibir por argumento una frase u oración y devolver un objeto Map que contenga
la palabra mas repetida de la frase como llave y la cantidad de veces que se repite como valor.
Tiene que devolver un objeto Map de java, por ejemplo usando la forma clásica:
Map<String, Integer> resultado = new HashMap();
resultado.put(palabra, max);
return resultado;
o bien usar el helpers abreviado y equivalente:
return Collections.singletonMap(palabra, max)
Mostrar el resultado en consola iterando el map o bien obteniendo el primer elemento con get().

 */

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Test2 {
    public static void main(String[] args) {


        String frase1 = "palo piedra piedra palo palo piedra piedra palo palo";
        String frase2 = "...el gato al rato, el rato a la cuerda, la cuerda al palo, daba el arriero a Sancho, Sancho a la moza, la moza a él, el ventero a la moza...";

        Function<String, Map<String, Integer>> f1 = (a) -> {
            String palabra = "";
            int max = 0;
            String[] b = a.split(" ");
            for (int i = 0; i < b.length - 1; i++) {
                for (int j = 0; j < b.length - i; j++) {
                    if (b[j].equals(b[i + j])) {
                        palabra = (b[j]);
                        max = j;
                    }
                }
            }
            Map<String, Integer> resultado = new HashMap();
            resultado.put(palabra, max);
            return resultado;
            //return Collections.singletonMap(palabra, max);
        };
        f1.apply(frase2).forEach(System.out::printf);
        System.out.println();
        Map<String, Integer> resultado = new HashMap();
        resultado = f1.apply(frase1);
        String firstKey = resultado.keySet().stream().findFirst().get();
        System.out.println(firstKey);
    }
}
