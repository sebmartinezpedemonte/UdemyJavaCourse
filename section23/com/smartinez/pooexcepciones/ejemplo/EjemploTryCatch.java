package section23.com.smartinez.pooexcepciones.ejemplo;

import javax.swing.*;

public class EjemploTryCatch {
    public static void main(String[] args) {

        Calculadora cal = new Calculadora();
        String numerador = JOptionPane.showInputDialog("Ingrese un entero numerador: ");

        String denominador = JOptionPane.showInputDialog("Ingrese un entero denominador: ");

        int divisor;
        double division;

        try {
            //divisor = Integer.parseInt(valor);
            //division = cal.dividir(10, divisor);
            //System.out.println("division = " + division);

            double division2 = cal.dividir(numerador, denominador);
            System.out.println("division2 = " + division2);
        }// catch (NumberFormatException nfe){
         //   System.out.println("Se detecto una excepcion: ingrese un valor numerico: " + nfe.getMessage());
         //   main(args);
        //}
        catch(FormatoNumeroException e){
            System.out.println("se detecto una excepcion, ingrese un numero valido. " + e.getMessage());
            e.printStackTrace(System.out);
            main(args);
        }
        catch(DivisionPorZeroException ae){
            System.out.println("Capturamos la excepcion en tiempo de ejecucion: " + ae.getMessage());
            main(args);
        } finally {
            System.out.println("Es opcional pero ejecuta siempre, con o sin excepcion");
        }
        System.out.println("Continuamos con el flujo de nuestra aplicacion");

    }
}
