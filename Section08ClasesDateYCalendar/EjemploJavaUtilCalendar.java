package Section08ClasesDateYCalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        System.out.println("date = " + date);



        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(2019, Calendar.JANUARY, 25, 18,20,10);
        Date date2 = calendar2.getTime();
        System.out.println("date2 = " + date2);

        Calendar calendario = Calendar.getInstance();

        //calendario.set(2019, Calendar.JANUARY, 25, 18,20,10);

        calendario.set(Calendar.YEAR, 2020);
        calendario.set(Calendar.MONTH, Calendar.JULY);
        calendario.set(Calendar.DAY_OF_MONTH, 25);
        //calendario.set(Calendar.HOUR_OF_DAY, 21);
        calendario.set(Calendar.HOUR, 7);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        calendario.set(Calendar.MINUTE, 20);
        calendario.set(Calendar.SECOND, 10);
        calendario.set(Calendar.MILLISECOND, 125);

        Date fecha = calendario.getTime();
        System.out.println("fecha sin formato = " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS a");
        String fechaConFormato = formato.format(fecha);
        System.out.println("fechaConFormato = " + fechaConFormato);

        Calendar calendarioActual = Calendar.getInstance();
        Date fecha2 = calendarioActual.getTime();

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

    }
}
