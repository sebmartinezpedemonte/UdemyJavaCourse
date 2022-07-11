package section12.arrays;

import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {


        String[] productos = new String[7];
        int total = productos.length;


        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "MacBook Air";
        productos[5] = "Chromecast 4ta generacion";
        productos[6] = "Bicileta Oxford";
        //lo ordena de la A la Z
        //ordenar antes de iterar o mostrar
        Arrays.sort(productos);
        System.out.println("=== usando for  ===");
        for (int i = 0; i < total; i++) {
            System.out.println("Para indice " + i + " : " + productos[i]);
        }
        System.out.println("=== usando for each ===");
        for(String prod:productos){
            System.out.println("prod = " + prod);
        }
        System.out.println("=== usando while ===");
        int i = 0;
        while(i<total) {
            System.out.println("Para indice " + i + " : " + productos[i]);
            i++;
        }

        System.out.println("=== usando do while ===");
        int j = 0;
         do{
            System.out.println("Para indice " + j + " : " + productos[j]);
            j++;
        }while(j<total);

        int[] numeros = new int[10];
        int totalNumeros = numeros.length;
        for(int k = 0; k < totalNumeros; k++){
            numeros[k] = k*3;
        }

        for(int k = 0; k < totalNumeros; k++){
            System.out.println("numeros = " + numeros[k]);
        }


    }
}
