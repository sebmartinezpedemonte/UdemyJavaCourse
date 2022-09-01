package section26.java8programacionfuncionalexpresioneslambda.models;

import section26.java8programacionfuncionalexpresioneslambda.aritmetica.Aritmetica;
import section26.java8programacionfuncionalexpresioneslambda.aritmetica.Calculadora;

public class EjemploInterfaceFunctional {
    public static void main(String[] args) {
        //creando nuestras propias expresiones lambda
        Aritmetica suma = (a, b) -> a + b;
        //Aritmetica suma = Double::sum;
        Aritmetica resta = (a, b) -> a-b;

        Calculadora cal = new Calculadora();
        System.out.println(cal.computar(10,5, suma));
        System.out.println(cal.computar(10, 5, resta));
        System.out.println(cal.computar(10,5, (a,b) -> a*b));

        System.out.println(cal.computarConBiFunction(10,5, (a, b) -> a + b));
    }


}
