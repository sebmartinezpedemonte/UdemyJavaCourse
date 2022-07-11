package section13.matrices.arreglos.bidimensionales;

import java.util.Scanner;
//Imprimir una silla (o h minúscula) en el arreglo
        /*
        Escribir un programa para una matriz de n x n e imprima en ella una silla
         (o letra h minúscula) construida a base del numero 1 y utilizar el numero
          0 como espacio. El tamaño de la silla se basa en una variable n que indicará
          el tamaño de la figura a imprimir en una matriz de n x n.
Por ejemplo para n=5 se obtiene:
10000
10000
11111
10001
10001
Por ejemplo para n=6 se obtiene:
100000
100000
100000
111111
100001
100001
Por ejemplo para n=10 se obtiene:
1000000000
1000000000
1000000000
1000000000
1000000000
1111111111
1000000001
1000000001
1000000001
1000000001
Si n es igual a cero imprimir "ERROR" y finalizar la ejecución del programa.
         */
public class Assignment19ImprimirUnaSilla {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz x");
        int tamanio = input.nextInt();
        if (tamanio <= 0) {
            System.out.println("ERROR");
        } else {
            int[][] matriz = new int[tamanio][tamanio];
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if(tamanio%2 == 0) {
                        if (j == 0 || i == matriz.length - i || (i > matriz.length - j + 1 && j == (matriz.length - 1))) {
                            matriz[i][j] = 1;
                        } else {
                            matriz[i][j] = 0;
                        }
                    }else if(tamanio%2 !=0){
                        if (j == 0 || i == matriz.length - i-1 || (i > matriz.length - j + 1 && j == (matriz.length - 1))) {
                            matriz[i][j] = 1;
                        } else {
                            matriz[i][j] = 0;
                        }
                    }
                }
            }
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j]);
                }
                System.out.println();
            }
        }

    }
}
