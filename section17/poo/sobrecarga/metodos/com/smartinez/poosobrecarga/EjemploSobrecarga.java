package section17.poo.sobrecarga.metodos.com.smartinez.poosobrecarga;

import static section17.poo.sobrecarga.metodos.com.smartinez.poosobrecarga.Calculadora.sumar;

public class EjemploSobrecarga {
    public static void main(String[] args) {
        //no se puede instanciar porque el constructor es private
        //Calculadora cal = new Calculadora();

        System.out.println("sumar int : " + sumar(10, 5));
        System.out.println("sumar float : " + sumar(10.0f, 5.0f));
        System.out.println("sumar float-int: " + sumar(10f, 5));
        System.out.println("sumar int-float: " + sumar(10, 5.0f));
        System.out.println("sumar double: " + sumar(10.0, 5.0));
        System.out.println("sumar String: " + sumar("10", "5"));
        System.out.println("sumar tres int: " + sumar(10,5,3));
        System.out.println("sumar cuatro int: " + sumar(10,5,3, 5));
        System.out.println("sumar cinco int: " + sumar(10,5,3, 5, 6));
        System.out.println("sumar long " + sumar(10L, 5L));
        System.out.println("sumar int: " + sumar(10, '@'));
        System.out.println("sumar float-int: " + sumar(10F, '@'));
        System.out.println("sumar float + n int: " + sumar(10.5f, 3,4,2,5));
        System.out.println("sumar cuatro double: " + sumar(10.5, 4.5, 3.5,4.7));

    }
}
