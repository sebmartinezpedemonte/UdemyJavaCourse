package section29.datetimejava8.ejemplos;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class EjemploZonedDateTimeFechaSeteada {
    public static void main(String[] args) {


        //podemos calcular la hora de llegada en un viaje eligiendo el momento de partida

        LocalDateTime fechaLocal = LocalDateTime.parse("2023/02/12 12:45"
        , DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm"));
        ZoneId newYork = ZoneId.of("America/New_York");
        //ZonedDateTime zonaNy = ZonedDateTime.of(fechaLocal, ZoneOffset.of("-05:00"));
        ZonedDateTime zonaNy = fechaLocal.atZone(newYork);
        //System.out.println("Horario de partida en New York: " + zonaNy);

        //ZoneId madrid = ZoneId.of("Europe/Madrid");
        ZonedDateTime zonaMadrid = zonaNy.withZoneSameInstant(ZoneOffset.of("+01:00")).plusHours(8);
        //.plusHours(8) sumando 8 hs de viaje en avion
        //System.out.println("Hora de llegada en Madrid: " + zonaMadrid);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm, dd MMM yyy");
        System.out.println("Detalles del viaje a españa:");
        System.out.println("Partida NY: " + f.format(zonaNy));
        System.out.println("Llegada Madrid: " + f.format(zonaMadrid));

        //Para imprimir todas las zonas horarias
        //ZoneId.getAvailableZoneIds().forEach(System.out::println);

        //Set<String> zonas = ZoneId.getAvailableZoneIds();
        //zonas.forEach(System.out::println);

    }
}
