package section12.arrays;

import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {


        String[] productos = new String[7];
        //Tambien se puede declara asi:
        /*
        String[] productos = {"Kingston Pendrive 64GB","Samsung Galaxy",
                "Disco Duro SSD Samsung Externo","Asus Notebook", "MacBook Air",
                "Chromecast 4ta generacion", "Bicileta Oxford" };
        */
        int total = productos.length;


        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "MacBook Air";
        productos[5] = "Chromecast 4ta generacion";
        productos[6] = "Bicileta Oxford";


        //ordenar antes de iterar o mostrar
        Arrays.sort(productos); //lo ordena de la A la Z
        System.out.println("=== usando for  ===");
        for (int i = 0; i < total; i++) {
            System.out.println("Para indice " + i + " : " + productos[i]);
        }
        System.out.println("=== Usando for inverso===");
        for(int i = 0; i < total; i++){
            System.out.println("i = " + (total -1 - i) + " valor: " +productos[total-1 - i]);
        }
        System.out.println("=== Usando for inverso 2 ===");
        for(int i = total -1; i >=0; i--){
            System.out.println("para i = " + i + " valor " + productos[i]);
        }

    }
}
