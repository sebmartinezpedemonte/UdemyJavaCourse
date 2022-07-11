package section12.arrays;

import java.util.ArrayList;

public class Assignment16MayorOcurrenciaEnElArreglo {
    public static void main(String[] args) {
        /*
        Para la tarea se debe crear un arreglo con 10 elementos
         (enteros en el rango de 1 a 9). Escriba un programa
         que imprima el número que tiene más ocurrencias en
          el arreglo y también imprimir la cantidad de veces
           que aparece en el arreglo.

Por ejemplo, para el arreglo: {1, 2, 3, 3, 4, 5, 5, 5, 6, 7}

Como resultado debería imprimir lo siguiente:

La mayor ocurrencias es: 3
El elemento que mas se repite es: 5
En el ejemplo, el elemento que más se repite en el
 arreglo es el número 5 con una ocurrencia de 3 veces.
         */
        int[] numeros = {1, 2, 3, 3, 4, 5, 5, 5, 6, 7};
        int mayorOcurrencia = 0;
        int auxMayorOcurrencia = 0;
        int numeroMayorRepeticion = 0;
        int auxNumeroMayorRepeticion = 0;
        int[] numerosAuxBis = new int[9];


        for (int i = 0; i<numeros.length; i++) {
            for (int j = 0; j < 9 ; j++) {
                if (numeros[i] == numeros[j]) {
                    auxNumeroMayorRepeticion =numeros[i];
                    auxMayorOcurrencia++;
                    if (auxMayorOcurrencia >= mayorOcurrencia) {
                        mayorOcurrencia = auxMayorOcurrencia;
                        numeroMayorRepeticion = auxNumeroMayorRepeticion;
                    }
                }else{
                    auxMayorOcurrencia = 0;
                }
            }
        }
        //Esto tmb funciona pero estoy usando ArrayList
        //ArrayList<Integer> numerosAux = new ArrayList<>();
        /*
        for (int i = 0; i<numeros.length; i++) {
            for (int j = 0; j < 9 ; j++) {

                if (numeros[i] == numeros[j]) {
                    numerosAux.add(numeros[j]);
                    if (numerosAux.size() > mayorOcurrencia) {
                        mayorOcurrencia = numerosAux.size();
                        numeroMayorRepeticion = numeros[i];
                    }
                }else{
                    numerosAux.clear();
                }
            }
        }
        */


        System.out.println("\nLa mayor ocurrencias es: " + mayorOcurrencia);
        System.out.println("El elemento que mas se repite es: " + numeroMayorRepeticion);

    }
}
