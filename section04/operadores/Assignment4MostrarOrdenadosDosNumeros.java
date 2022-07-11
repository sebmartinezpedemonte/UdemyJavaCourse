package section04.operadores;

import java.util.Scanner;

public class Assignment4MostrarOrdenadosDosNumeros {
    public static void main(String[] args) {
        /*  El desafío es un programa que pida dos números y
            los muestre ordenados de mayor a menor.
            Podría ser utilizando operador ternario. */
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un numero entero");
        int num1 = input.nextInt();

        System.out.println("Ingrese otro numero entero");
        int num2 = input.nextInt();

        String numeroMax = "";
        numeroMax = num1 > num2 ? num1 + "," + num2 : num2 + "," + num1;
        System.out.println("Los numeros ordenados de mayor a menor son  = " + numeroMax);
    }
}