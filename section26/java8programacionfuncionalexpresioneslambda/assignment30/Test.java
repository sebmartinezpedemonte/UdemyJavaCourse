package section26.java8programacionfuncionalexpresioneslambda.assignment30;

import java.util.function.Function;

//Expresión Lambda que cuenta la cantidad de veces que se repiten las palabras de una frase y devuelva la mas repetida

public class Test {
    public static void main(String[] args) {
        String frase1 = "palo piedra piedra palo palo piedra piedra palo palo";
        String frase2 ="...el gato al rato, el rato a la cuerda, la cuerda al palo, daba el arriero a Sancho, Sancho a la moza, la moza a él, el ventero a la moza...";

        Function<String, String> f1 = (a) -> {
            String[] b=  a.split(" ");
            String palabra = "";
            for(int i = 0; i < b.length -1; i++){
                for(int j = 0 ; j < b.length -i ; j++){
                    if(b[j].equals(b[i+j])) {
                        palabra = (b[j]);
                    }
                }
            }
            return palabra;
        };
        String resultado = f1.apply(frase2);
        System.out.println(resultado);
        System.out.println(f1.apply(frase1));
    }
}
