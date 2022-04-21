package Section08ClasesDateYCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
Para esta tarea se pide ingresar una fecha de nacimiento en formato string,
 convertirla a una fecha del tipo java.util.Date y calcular la edad de la persona de
 acuerdo a la fecha actual.
 Intentar usar solo lo visto hasta el momento, no el api de java 8 que lo veremos más
 adelante, también se pueden apoyar de google que hay varios ejemplos.
 */
public class Assignment11CalcularEdad {
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Ingrese una fecha con formato: yyyy-MM-dd");

        Date fechaNacimiento = format.parse(input.next());
        Date fechaActual = new Date();

        format = new SimpleDateFormat("yyyyMMdd");

        int desde = Integer.parseInt(format.format(fechaNacimiento));
        int hasta = Integer.parseInt(format.format(fechaActual));


        if(fechaNacimiento.before(fechaActual)){
            int edad = (hasta - desde) / 10000;
            System.out.println("La edad es: " + edad);
        }else{
            System.out.println("Fecha ingresada incorrecta");
        }

        input.close();
    }
}
