package section12.arrays;

import java.util.Arrays;

public class EjemploArreglosIntegerBurbuja {
    public static void sortBurbuja(Object[] arreglo){
        int total = arreglo.length;
        for(int i = 0; i < total-1; i++){
            for(int j = 0; j < total-1 -i; j++){
                if (((Comparable) arreglo[j+1]).compareTo(arreglo[j])<0){
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = auxiliar;
                }
            }
        }
    }
    public static void main(String[] args) {
        Integer[] numeros = new Integer[4];
        numeros[0] = 10;
        numeros[1] = 7;
        numeros[2] = 35;
        numeros[3] = -1;
        
        int total = numeros.length;
        sortBurbuja(numeros);

        for (int i=0; i < numeros.length;i++){
            System.out.println("i = "  + i  + ": " + numeros[i]);
        }
    }
}
