package Section14POOClasesYObjetosAssignment20;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
Escribir un programa, clase con método main, la cual llamaremos EjemploOrdenes:
Crear tres órdenes, con sus respectivos valores, el cliente, agregar los cuatro
 productos a cada una, cada orden con distintos productos, que no se repitan.


 */
public class EjemploOrdenes {
    public static void main(String[] args) throws ParseException {
        OrdenCompra orden1 = new OrdenCompra("Super");
        OrdenCompra orden2 = new OrdenCompra("Verduleria");
        OrdenCompra orden3 = new OrdenCompra("Carniceria");

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = format.parse("2022-07-05");
        Date date2 = format.parse("2022-07-06");
        Date date3 = format.parse("2022-07-07");

        Cliente cliente1 = new Cliente("Carlos" , "Perez");
        Cliente cliente2 = new Cliente("Miguel" , "Sanchez");
        Cliente cliente3 = new Cliente("Maria" , "Velez");

        orden1.setCliente(cliente1);
        orden2.setCliente(cliente2);
        orden3.setCliente(cliente3);

        orden1.setFecha(date1);
        orden2.setFecha(date2);
        orden3.setFecha(date3);

        Producto producto1 = new Producto("Samsung", "Galaxy A60", 72000);
        Producto producto2 = new Producto("Dell" , "PL", 180000);
        Producto producto3 = new Producto("Dell" , "A2", 150000);
        Producto producto4 = new Producto("Apple" , "M6", 200000);
        Producto producto5 = new Producto("Microsoft" , "I7", 120000);
        Producto producto6 = new Producto("Intel" , "I6", 30000);
        Producto producto7 = new Producto("Huawei" , "CX", 60000);
        Producto producto8 = new Producto("Motorola" , "E6", 10000);
        Producto producto9 = new Producto("Lenovo" , "I7", 100000);
        Producto producto10 = new Producto("Nevex" , "G6", 300000);
        Producto producto11= new Producto("Prex" , "FX", 600000);
        Producto producto12= new Producto("Supp" , "R6", 100000);
        orden1.addProducto(producto1).
                addProducto(producto2).
                addProducto(producto3).
                addProducto(producto4);
        orden2.addProducto(producto5).
                addProducto(producto6).
                addProducto(producto7).
                addProducto(producto8);
        orden3.addProducto(producto9).
                addProducto(producto10).
                addProducto(producto11).
                addProducto(producto12);

        orden1.mostrarInformacionCompra();
        orden2.mostrarInformacionCompra();
        orden3.mostrarInformacionCompra();


    }

}
