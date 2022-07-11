package section04.operadores;

public class OperadoresIncrementales {
    public static void main(String[] args) {

        int i = 1;
        //Preincrement
        int j = ++i; // i = i +1

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Post increment
        i= 2;
        System.out.println("inicial de i = " + i);
        j = i++;

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Pre decremento

        i = 3;
        j = --i; // i = i - 1 = 2

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Post decrement

        i =4;
        j = i--;

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("j = " + (++j));


        System.out.println("j = " + (j++));
        //Primero se imprime y luego se asigna
        System.out.println("j = " + j);
    }
}
