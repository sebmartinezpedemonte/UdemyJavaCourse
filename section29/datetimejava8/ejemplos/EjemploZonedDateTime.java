package section29.datetimejava8.ejemplos;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class EjemploZonedDateTime {
    public static void main(String[] args) {
        //podemos calcular la hora de llegada en un viaje (si partimos ahora)

        LocalDateTime fechaLocal = LocalDateTime.now();
        ZoneId newYork = ZoneId.of("America/New_York");
        ZonedDateTime zonaNy = ZonedDateTime.of(fechaLocal, newYork);
        System.out.println("Horario de partida en New York: " + zonaNy);

        ZoneId madrid = ZoneId.of("Europe/Madrid");
        ZonedDateTime zonaMadrid = zonaNy.withZoneSameInstant(madrid).plusHours(8);
        //.plusHours(8) sumando 8 hs de viaje en avion
        System.out.println("Hora de llegada en Madrid: " + zonaMadrid);

    }
}
