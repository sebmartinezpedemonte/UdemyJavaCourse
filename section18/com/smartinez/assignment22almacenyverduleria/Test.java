package section18.com.smartinez.assignment22almacenyverduleria;

import java.util.ArrayList;

/*
Para el ejemplo de la clase main se pide crear dos objetos por
 cada tipo de producto que deben ser almacenados en un arreglo
  del tipo Producto, se debe mostrar iterando el arreglo, por
   cada uno el detalle completo, el precio, nombre y los atributos adicionales.
 */
public class Test {
    public static void main(String[] args) {
        Producto[] productos = new Producto[8];
        Fruta fruta1 = new Fruta("Naranja", 100.0, 1.0, "Naranja");
        Fruta fruta2 = new Fruta("Kiwi", 600.0, 1.0, "Verde");
        Lacteo lacteo1 = new Lacteo("Leche", 150.0, 1, 100);
        Lacteo lacteo2 = new Lacteo("Yogur", 100.0, 1, 50);
        Limpieza limpieza1 = new Limpieza("Mr Musculo", 200.0, "Detergente", 1.5);
        Limpieza limpieza2 = new Limpieza("Ayudin", 150.0, "Lavandina", 2.0);
        NoPerecible noPerecible1 = new NoPerecible("Galletitas", 170.0, 10, 2000);
        NoPerecible noPerecible2 = new NoPerecible("Pan", 120.0, 5, 1000);

        productos[0] = fruta1;
        productos[1] = fruta2;
        productos[2] = lacteo1;
        productos[3] = lacteo2;
        productos[4] = limpieza1;
        productos[5] = limpieza2;
        productos[6] = noPerecible1;
        productos[7] = noPerecible2;

        for(Producto p : productos){
            System.out.println(p);
        }
        System.out.println();

        ArrayList<Producto> productosList = new ArrayList<>();
        productosList.add(fruta1);
        productosList.add(fruta2);
        productosList.add(lacteo1);
        productosList.add(lacteo2);
        productosList.add(limpieza1);
        productosList.add(limpieza2);
        productosList.add(noPerecible1);
        productosList.add(noPerecible2);

        for(Producto p : productosList){
            System.out.println(p);
        }

    }
}
