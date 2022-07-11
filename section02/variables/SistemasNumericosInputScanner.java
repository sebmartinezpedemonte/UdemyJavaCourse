package section02.variables;

import java.util.Scanner;


public class SistemasNumericosInputScanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero entero = ");
        //String numeroStr = input.nextLine();
        int numeroDecimal = 0;
        try{
            numeroDecimal = input.nextInt(); //Integer.parseInt(numeroStr);
        }catch(Exception e){
            System.out.println("Error debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

        String resultadoHexadecimal = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = resultadoBinario ;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHexadecimal;

        System.out.println(mensaje);
    }
}

