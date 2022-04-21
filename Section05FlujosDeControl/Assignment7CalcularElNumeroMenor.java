package Section05FlujosDeControl;/*
Crear una clase con el método main donde el desafío es buscar el número menor de mínimo 10
valores enteros, usando la clase Scanner ingresar la cantidad de números a comparar,
luego utilizando una sentencia for iterar el numero de veces (ingresado) para pedir
 el numero entero, entonces se requiere:

Calcular el menor número e imprimir el valor.

Si el menor número es menor que 10, imprimir "El número menor es menor que 10!".
si no, imprimir " el numero menor es igual o mayor que 10!".
 */

import java.util.Scanner;

public class Assignment7CalcularElNumeroMenor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        int numMin = Integer.MAX_VALUE;
        int cant_numeros;

        System.out.println("Ingrese la cantidad de numeros a comparar, deben ser 10");
        cant_numeros = input.nextInt();
        while (cant_numeros != 10) {
            System.out.println("Error. Ingrese la cantidad de numeros a comparar, deben ser 10");
            cant_numeros = input.nextInt();
        }

        for (int i = 0; i < cant_numeros; i++) {
            System.out.println("Ingrese el numero " + (i + 1) + ": ");
            num = input.nextInt();
            if (num < numMin) {
                numMin = num;
            }
        }
        System.out.println("El numero menor es " + numMin);

        if (numMin < 10) {
            System.out.println("El número menor es menor que 10!");
        } else {
            System.out.println("El numero menor es igual o mayor que 10!");
        }
        input.close();
    }
}
