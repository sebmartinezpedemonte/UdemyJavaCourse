package Section06Wrapper;

public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {

        //Son mas que numeros, son objetos que encapsulan un valor
        //forma explicita
        Integer num1 = Integer.valueOf(1000);
        //forma implicita
        Integer num2 = num1;
        //num2 contiene la instancia de num1

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        //la referencia del objeto apunta hacia el mismo objeto
        //ambas instancias son exactamente iguales
        //es un objeto que esta asignado a dos variables del tipo
        System.out.println("Son el mismo objeto? " + (num1 == num2));

        num2 = 1000;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto? " + (num1 == num2));
        //es false porque no son el mismo objeto
        //contiene el mismo valor pero no la misma instancia
        //a num 2 se le asigna otra instancia que contiene el mismo valor


        System.out.println("tienen el mismo valor? " + (num1.equals(num2)));
        System.out.println("tienen el mismo valor? " + (num1.intValue() == num2.intValue()));

        //hasta el numero 127 java compara por el valor y no por la instancia
        //num1 = 127 y num2=127


        //Autoboxing:empaquetamos un primitivo en una clase Wrapper
        //auto unboxing: desempaquetar. Pasar de referencia a un valor primitivo. Convertir de referencia a primitivo
        num2 = 500;
        //forma implicita
        boolean condicion = num1 > num2;
        System.out.println("condicion = " + condicion);

        //de forma explicita
        boolean condicion2 = num1.intValue() < num2.intValue();
        System.out.println("condicion2 = " + condicion2);

    }
}
