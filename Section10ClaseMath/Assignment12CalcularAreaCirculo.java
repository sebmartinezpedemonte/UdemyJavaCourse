package Section10ClaseMath;

import java.util.Scanner;

public class Assignment12CalcularAreaCirculo {
    public static void main(String[] args) {
        double radio, area;
        //area = PI*r² (Constante PI multiplicado por el radio al cuadrado).
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el radio de un circulo en cm");
        radio = input.nextDouble();
        area = Math.pow(radio, 2) * Math.PI;

        System.out.println("El area del circulo es de " + area + " cm2s");

        //System.out.println("El área de una circunferencia de radio " + radio + " es: " + area + " cm2s");

    }
}
