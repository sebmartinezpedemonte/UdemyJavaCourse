package section02.variables;

import java.util.Scanner;

public class Assignment2DetalleDeFactura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la factura");
        String nombreFactura = input.nextLine();
        System.out.println("Ingrese el precio del primer producto");
        double precioProducto1 = input.nextDouble();
        System.out.println("Ingrese el precio del segundo producto");
        double precioProducto2 = input.nextDouble();

        double totalSinImpuesto = precioProducto1 + precioProducto2;
        double impuesto = totalSinImpuesto * .19;
        double totalConImpuesto = totalSinImpuesto + impuesto;

        System.out.println("La factura " + nombreFactura + " tiene un total bruto de " +
                totalSinImpuesto + ", con un impuesto de " + impuesto +
                " y el monto despues de impuesto es de " + totalConImpuesto);
    }
}
