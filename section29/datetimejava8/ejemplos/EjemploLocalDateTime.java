package section29.datetimejava8.ejemplos;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class EjemploLocalDateTime {
    public static void main(String[] args) {
        //fecha completa
        LocalDateTime fechaTiempo = LocalDateTime.now();
        System.out.println("fechaTiempo = " + fechaTiempo);

        fechaTiempo = LocalDateTime.of(2020, Month.DECEMBER, 24, 20, 45, 59);
        System.out.println("fechaTiempo = " + fechaTiempo);

        //año-mes-diaTHH:mm:ss.ns
        fechaTiempo = LocalDateTime.parse("2022-09-16T20:45:59.90987909");
        System.out.println("fechaTiempo = " + fechaTiempo);

        LocalDateTime fechaTiempo2 = fechaTiempo.plusDays(1).plusHours(2);
        System.out.println("fechaTiempo = " + fechaTiempo);//inmutable
        System.out.println("fechaTiempo2 = " + fechaTiempo2);
        System.out.println("fechaTiempo3 = " + fechaTiempo.minusHours(5));

        Month mes = fechaTiempo.getMonth();
        System.out.println("mes = " + mes);

        int dia = fechaTiempo.getDayOfMonth();
        System.out.println("dia = " + dia);

        int anio = fechaTiempo.getYear();
        System.out.println("anio = " + anio);

        //formato predeterminado
        String formato1 = fechaTiempo.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println("formato1 = " + formato1);

        //formato creado por uno
        String formato2 = fechaTiempo.format(DateTimeFormatter.ofPattern("yyyy/MM//dd HH:mm:ss"));
        System.out.println("formato2 = " + formato2);

        //antes lo haciamos asi
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/MM//dd HH:mm:ss");
        String formato3 = fechaTiempo.format(df);
        System.out.println("formato3 = " + formato3);

        //o asi
        String formato4 = df.format(fechaTiempo);
        System.out.println("formato4 = " + formato4);
    }
}
