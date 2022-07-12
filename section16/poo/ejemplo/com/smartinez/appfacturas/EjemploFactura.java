package section16.poo.ejemplo.com.smartinez.appfacturas;

import section16.poo.ejemplo.com.smartinez.appfacturas.domain.*;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNif("5555-5");
        cliente.setNombre("Andres");

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese una descripcion de la factura: ");
        String desc = s.nextLine();
        Factura factura = new Factura(desc, cliente);

        Producto producto;
        //para optimizar nos ahorramos la creacion de variables
        //String nombre;
        //float precio;
        //int cantidad;

        System.out.println();

        for(int i = 0; i < 2; i++){
            producto = new Producto();
            System.out.print("Ingrese producto n° " + producto.getCodigo() + " : ");
            //nombre = s.nextLine();//nos permite registar una palabra pero sin espacios en blanco
            producto.setNombre(s.nextLine());

            System.out.print("Ingrese el precio: ");
            //precio = s.nextFloat();
            producto.setPrecio(s.nextFloat());

            System.out.print("Ingrese la cantidad: ");
            //cantidad = s.nextInt();

            factura.addItemFactura(new ItemFactura(s.nextInt(),producto));

            System.out.println();
            s.nextLine();
            }
        System.out.println(factura);
    }
}
