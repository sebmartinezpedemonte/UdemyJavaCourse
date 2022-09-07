package section29.datetimejava8.ejemplos;

import java.time.Duration;
import java.time.LocalDateTime;

public class EjemploDuration {
    public static void main(String[] args) {
        //para calcular cuanto tiempo paso de un momento a otro

        LocalDateTime fecha1 = LocalDateTime.now();
        //fecha1 = fecha1.withMonth(12);//hay que reasignar el valor
        LocalDateTime fecha2 = LocalDateTime.now().plusHours(1).plusMinutes(20).plusDays(1);
        Duration lapsus = Duration.between(fecha1, fecha2);
        System.out.println("lapsus = " + lapsus);
        System.out.println(lapsus.getSeconds() + " seconds");
        System.out.println(lapsus.toDays() + " day/s");
        System.out.println(lapsus.toHours() + " hours");
        System.out.println(lapsus.toMinutes() + " minutes");
        System.out.println("sumamos 5 horas "+ lapsus.plusHours(5));

    }
}
