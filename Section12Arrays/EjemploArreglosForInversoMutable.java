package Section12Arrays;

import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {
    public static void arregloInverso(String[] arreglo) {
        int total = arreglo.length;
        int total2 = arreglo.length;
        for (int i = 0; i < total2; i++) {
            String actual = arreglo[i];
            String inverso = arreglo[total - 1 - i];
            arreglo[i] = inverso;
            arreglo[total - 1 - i] = actual;
            total2--;
        }
    }

    public static void main(String[] args) {

        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy",
                "Disco Duro SSD Samsung Externo", "Asus Notebook", "MacBook Air",
                "Chromecast 4ta generacion", "Bicileta Oxford"};

        int total = productos.length;




        //ordenar antes de iterar o mostrar
        //Arrays.sort(productos); //lo ordena de la A la Z
        //arregloInverso(productos);  //lo ordena de la forma inversa de la Z a la A

        //otra forma es usando la Java Collections API
        //Collections.reverse(Arrays.asList(productos));
        System.out.println("=== usando for  ===");
        for (int i = 0; i < total; i++) {
            System.out.println("Para indice " + i + " : " + productos[i]);
        }


    }
}
