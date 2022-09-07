package section29.datetimejava8.ejemplos;

import jdk.swing.interop.SwingInterOpUtils;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class EjemploLocalDate {
    public static void main(String[] args) {

        //crear una fecha actual (la de hoy)
        LocalDate fechaActual= LocalDate.now();
        System.out.println("fechaActual = " + fechaActual);
        //formato estandar para ingresar en String año, mes, dia ("2022-09-05")

        //mostrar dia, mes año actual:
        System.out.println("Dia de hoy: " + fechaActual.getDayOfWeek());
        //mostrar mes por numero
        Month mes = fechaActual.getMonth();
        System.out.println("Numero del mes: " + mes.getValue());
        System.out.println("Mes español: " + mes.getDisplayName(TextStyle.FULL, new Locale("es", "ES")));
        System.out.println("Mes actual: " + fechaActual.getMonth());

        DayOfWeek diaSemana =fechaActual.getDayOfWeek();
        System.out.println("Numero del dia: " + diaSemana.getValue());
        System.out.println("Nombre del dia en español: " + diaSemana.getDisplayName(TextStyle.FULL, new Locale ("es", "ES")));

        System.out.println("Año actual: " + fechaActual.getYear());
        System.out.println("Dia del año: " + fechaActual.getDayOfYear());
        System.out.println("Era: " + fechaActual.getEra());


        //fecha seteada
        LocalDate fechaSeteada = LocalDate.of(2020, 1, 25);
        System.out.println("fechaSeteada = " + fechaSeteada);

        LocalDate fechaSeteada2 = LocalDate.of(2020, Month.NOVEMBER, 11);
        System.out.println("fechaSeteada2 = " + fechaSeteada2);

        LocalDate fechaSeteada3ConString = LocalDate.parse("2020-02-01");
        System.out.println("fechaSeteada3ConString = " + fechaSeteada3ConString);

        LocalDate diaDeManiana = LocalDate.now().plusDays(1);
        System.out.println("diaDeManiana = " + diaDeManiana);

        LocalDate mesAnterior = LocalDate.now().minusMonths(1);
        System.out.println("mesAnterior = " + mesAnterior);

        //otra forma es con el metodos minus
        LocalDate mesAnterior2 = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println("mesAnterior2 = " + mesAnterior2);

        //para obtener el dia de la semana de un dia especifico
        DayOfWeek diaEspecifico = LocalDate.parse("1988-10-12").getDayOfWeek();
        System.out.println("diaEspecifico = " + diaEspecifico);

        //numero dia del mes
        int numDia = LocalDate.of(2020, 11, 11).getDayOfMonth();
        System.out.println("numDia = " + numDia);

        boolean esBisiesto = LocalDate.now().isLeapYear();
        System.out.println("esBisiesto = " + esBisiesto);

        boolean esAntesFechaActual = LocalDate.now().isBefore(LocalDate.parse("2022-09-04"));
        System.out.println("esAntesFechaActual = " + esAntesFechaActual);

        boolean esAntesFechaElegida = LocalDate.of(2022, 9, 6).isBefore((LocalDate.parse("2022-09-07")));
        System.out.println("esAntesFechaElegida = " + esAntesFechaElegida);

        boolean esDespuesFechaElegida = LocalDate.parse("2022-09-06").isAfter(LocalDate.parse("2022-09-05"));
        System.out.println("esDespuesFechaElegida = " + esDespuesFechaElegida);

        boolean esDespuesFechaActual = LocalDate.now().isAfter(LocalDate.now().minusDays(1));
        System.out.println("esDespuesFechaActual = " + esDespuesFechaActual);

    }
}
