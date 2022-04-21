package Section04Operadores;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        //variable = condicion ? si es verdadero : si es falso

        String variable = 7==5 ? "si es verdadero" : "si es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 0.0;

        double matematicas = 0.0;
        double ciencia = 0.0;
        double historia = 0.0;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la nota de matematicas entre 2 y 7");
        matematicas = input.nextDouble();

        System.out.println("Ingrese la nota de ciencias entre 2 y 7");
        ciencia = input.nextDouble();

        System.out.println("Ingrese la nota de historia entre 2 y 7");
        historia = input.nextDouble();

        promedio = (matematicas + ciencia + historia) / 3 ;

        estado = promedio >= 5.49 ? "Aprobado" : "Rechazado";
        System.out.println("estado = " + estado);




        /*
        if(promedio >= 5.49){
            estado = "Aprobado";
        }else {
            estado = "Rechazado";
        }

         */
    }
}
