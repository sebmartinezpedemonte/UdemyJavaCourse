package section12.arrays;

import java.util.Scanner;

public class Assignment13OrdenarArregloFormaUltimoPrimero2 {
    public static void main(String[] args) {
        /*
        Leer 10 números enteros desde el teclado para llenar un arreglo de 10 elementos.
        Luego debemos mostrarlos en el siguiente orden: el último, el primero, el penúltimo,
        el segundo, el antepenúltimo, el tercero, y así sucesivamente.
         */
        Scanner s = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un numero: ");
            numeros[i] = s.nextInt();
        }
        System.out.println("El resultado es:");
        for (int i = 0; i <= (numeros.length / 2) - 1; i++) {
            System.out.println(numeros[(numeros.length - 1) - i]);
            System.out.println(numeros[i]);
        }
    }
}
