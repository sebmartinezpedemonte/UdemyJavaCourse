package section29.datetimejava8.ejemplos;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class EjemploViajeFrancia {
    public static void main(String[] args) {


        //podemos calcular la hora de llegada en un viaje eligiendo el momento de partida

        LocalDateTime fechaLocal = LocalDateTime.parse("2023/02/12 16:35"
        , DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm"));
        ZoneId buenosAires = ZoneId.of("America/Buenos_Aires");
        //ZonedDateTime zonaNy = ZonedDateTime.of(fechaLocal, ZoneOffset.of("-05:00"));
        ZonedDateTime zonaNy = fechaLocal.atZone(buenosAires);
        //System.out.println("Horario de partida en New York: " + zonaNy);

        ZoneId paris = ZoneId.of("Europe/Paris");
        ZonedDateTime zonaMadrid = zonaNy.withZoneSameInstant(paris).plusHours(17);
        //.plusHours(8) sumando 8 hs de viaje en avion
        //System.out.println("Hora de llegada en Madrid: " + zonaMadrid);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm, dd MMM yyy");
        System.out.println("Detalles del viaje a Francia:");
        System.out.println("Partida NY: " + f.format(zonaNy));
        System.out.println("Llegada Paris: " + f.format(zonaMadrid));

        //Para imprimir todas las zonas horarias
        //ZoneId.getAvailableZoneIds().forEach(System.out::println);

        //Set<String> zonas = ZoneId.getAvailableZoneIds();
        //zonas.forEach(System.out::println);

    }
}
