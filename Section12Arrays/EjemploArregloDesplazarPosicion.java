package Section12Arrays;

import java.util.Scanner;

public class EjemploArregloDesplazarPosicion {
    public static void main(String[] args) {
        //Solo funciona para el caso del 1 al 10
        int[] num = new int[10];

        for(int i = 0; i < num.length ; i++){
            num[i] = i+1;
        }
        /*
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < num.length; i++){
            System.out.print("Ingrese el numero: ");
            num[i] = s.nextInt();
        }
        */


        for(int i = 0; i < num.length ; i++){
            System.out.println("indice: " + i + " valor = " + num[i]);
        }

        System.out.println("=========DESPLAZANDO UNA POSICION==========");

        for(int i = 0; i < num.length ; i++){
            if(i == 0){
            num[i] = num.length;}
            else {
                num[i] = i;
            }
        }

        for(int i = 0; i < num.length ; i++){
            System.out.println("indice: " + i + " valor = " + num[i]);
        }
    }
}
