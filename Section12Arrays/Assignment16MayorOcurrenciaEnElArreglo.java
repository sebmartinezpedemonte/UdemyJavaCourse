package Section12Arrays;

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
        int[] numeros = {1,2 , 3, 3, 4, 5, 5, 5, 6, 7};
        int mayorOcurrencia = 0;
        int auxMayorOcurrencia = 0;
        int numeroMayorRepeticion = 0;
        int auxNumeroMayorRepeticion = 0;
        int ocurrencia0 = 0;
        int[] numerosAux = new int[9];


        for (int i = 0; i<numeros.length-1; i++) {
            for (int j = 0; j < 9 ; j++) {
                if (numeros[i] == numeros[i+1] && numeros[i+1] == numeros[i]) {
                   // auxMayorOcurrencia = numeros[j];
                    //numerosAux [i] = numeros[j];
                    mayorOcurrencia++;
                    if (mayorOcurrencia >= auxMayorOcurrencia) {
                        auxMayorOcurrencia = mayorOcurrencia;
                        auxNumeroMayorRepeticion = numeros[i];
                    }
                }else{
                    System.out.println(mayorOcurrencia);
                   // mayorOcurrencia = 0;
                }

            }
        }



        /*
        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] == numeros[i + 1] || numeros[i + 1] == numeros[i] || numeros[i + 2] == numeros[i] ||) {
                mayorOcurrencia++;
                numeroMayorRepeticion = numeros[i];
                if (mayorOcurrencia > auxMayorOcurrencia) {
                    auxMayorOcurrencia = mayorOcurrencia;
                    auxNumeroMayorRepeticion = numeroMayorRepeticion;
                }
            }
        }
        */





        //if(numeros[i]== numeros[i+1] || numeros[i]== numeros[i+1] || numeros[i]== numeros[i+1] || numeros[i]== numeros[i+1] || numeros[i]== numeros[i+1] ||){
        //  auxMayorOcurrencia++;
        //if(auxMayorOcurrencia >= mayorOcurrencia){

        // }
        //}
        for(int i = 0; i < numerosAux.length; i++){
            System.out.print(numerosAux[i]);
        }


        System.out.println("\nLa mayor ocurrencias es: " + auxMayorOcurrencia);
        System.out.println("El elemento que mas se repite es: " + auxNumeroMayorRepeticion);

    }
}
