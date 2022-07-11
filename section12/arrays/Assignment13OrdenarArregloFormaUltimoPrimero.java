package section12.arrays;

import java.util.Scanner;

public class Assignment13OrdenarArregloFormaUltimoPrimero {
    public static void main(String[] args) {
        /*
        Leer 10 números enteros desde el teclado para llenar un arreglo de 10 elementos.
        Luego debemos mostrarlos en el siguiente orden: el último, el primero, el penúltimo,
        el segundo, el antepenúltimo, el tercero, y así sucesivamente.
         */
        Scanner s = new Scanner(System.in);
        int[] numeros = new int[10];
        int[] numerosAux = new int[10];
        int ultimo;
        for(int i = 0; i<numeros.length ; i++){
            System.out.print("Ingrese un numero: ");
            numeros[i]= s.nextInt();
            //numeros[i]= i;
        }

        System.arraycopy(numeros,0,numerosAux,0,10);
        ultimo = numerosAux[numeros.length-1];
        //10, 1, 9, 2, 8, 3, 7, 4, 6, 5
        //10, 1, 9, 3, 8, 5, 7, 7, 6, 9
        //    0     1     2     3     4
        //    1     3     5     7     9
        //10, 1, 8, 3, 6, 5, 4, 7, 2, 9

        //0,  2,  4, 6, 8, 10, 12, 14, 16, 18
        //18, 0, 16, 2, 14, 4, 12, 6, 10, 8
                                                 //18, 2, 16, 4, 14, 6, 12, 8, 10, 10
        //    2     2      2      2      2
        //i:  1     3      5      7      9
        for(int i = 0; i < numerosAux.length; i++){
            if(i%2 ==0){
            numerosAux[i] = ultimo - i;
            }else{
                numerosAux[i] = numeros[i] - (i+1);
            }
        }

        for(int i = 0; i < numerosAux.length; i++){
            if(i%2 ==0){
                numerosAux[i] = ultimo - i/2;
            }else{
                numerosAux[i] = i - i/2;
            }
        }


        numeros = numerosAux;

        for(int i = 0; i < numeros.length ; i++){
            System.out.println(numeros[i]);
        }

    }
}
