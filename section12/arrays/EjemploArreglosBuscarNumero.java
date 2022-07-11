package section12.arrays;

import java.util.Scanner;

public class EjemploArreglosBuscarNumero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[10];

        for(int i = 0; i< a.length;i++){
            System.out.print("Ingrese un  numero: ");
            a[i] = s.nextInt();
        }

        System.out.println("\r\nIngrese un numero a buscar");
        int num = s.nextInt();

        int i = 0;
        /*
        while(i<a.length && a[i] != num){
            i++;
        }
        */
        //o con un for
        for(; i < a.length && a[i] != num ; i++){}

        if(i == a.length){
            System.out.println("Numero no encontrado");
        }else if(a[i] == num){ //o else solo
            System.out.println("Encontrado en la posicion : " + i);
        }
    }
}
