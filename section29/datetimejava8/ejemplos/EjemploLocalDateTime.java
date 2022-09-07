package section29.datetimejava8.ejemplos;

import java.time.LocalDateTime;
import java.time.Month;

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

        fechaTiempo = fechaTiempo.plusDays(1);
        System.out.println("fechaTiempo = " + fechaTiempo);



    }
}
