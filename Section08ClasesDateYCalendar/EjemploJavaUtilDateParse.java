package Section08ClasesDateYCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Scanner input = new Scanner(System.in);


        System.out.println("Ingrese una fecha con formato: yyyy-MM-dd");
        try {
            Date fecha = format.parse(input.next());
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));

            Date fecha2 = new Date();

            System.out.println("fecha2 = " + fecha2);
            if(fecha.after(fecha2)){
                System.out.println("Fecha del usuario es despues que fecha2");
            }else if(fecha.before(fecha2)){
                System.out.println("Fecha del usuario es anterior que fecha2");
            }else if(fecha.equals(fecha2)){
                System.out.println("fecha es igual a fecha2");
            }

            if(fecha.compareTo((fecha2)) > 0){
                System.out.println("Fecha del usuario es despues que fecha2");

            }else if(fecha.compareTo((fecha2)) < 0){
                System.out.println("Fecha del usuario es anterior que fecha2");

            }else if(fecha.compareTo((fecha2)) == 0){
                System.out.println("fecha es igual a fecha2");

            }
        } catch (ParseException e) {
            e.printStackTrace();
        }



        input.close();
    }
}
