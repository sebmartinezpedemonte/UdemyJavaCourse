package section26.java8programacionfuncionalexpresioneslambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFunction {
    public static void main(String[] args) {

        //Function<String, String> f1 = param -> { return "Hola que tal!" + param;};
        Function<String, String> f1 = param -> "Hola que tal! " + param;
        //apply recibe un parametro y devuelve un resultado
        String resultado = f1.apply("andres");

        System.out.println(resultado);
        //con referencia de metodos
        //funcion que recibe un String y devuelve un String
        //Function<String, String> f2 = param -> param.toUpperCase();
        Function<String, String> f2 = String::toUpperCase;
        System.out.println(f2.apply("andres"));

        BiFunction<String, String, String> f3 = (a,b) -> a.toUpperCase().concat(b.toUpperCase());
        String r2 = f3.apply("andres", "jose");
        System.out.println(r2);

        //BiFunction<String, String, Integer> f4 = (a, b) -> a.compareTo(b);
        BiFunction<String, String, Integer> f4 = String::compareTo;
        System.out.println(f4.apply("andres", "andres"));
        //el resultado es 0 porque son identicos

        BiFunction<String, String, String> f5 = String::concat;
        System.out.println(f5.apply("andres", "jose"));





    }
}
