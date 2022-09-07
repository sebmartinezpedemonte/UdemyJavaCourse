package section29.datetimejava8.ejemplos;


import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class EjemploLocalTime {
    public static void main(String[] args) {

        LocalTime ahora = LocalTime.now();
        System.out.println(ahora);
        System.out.println("Hora " + ahora.getHour());
        System.out.println("Minutos: " + ahora.getMinute());
        System.out.println("Segundos: " + ahora.getSecond());
        System.out.println("Nanosegundos: " + ahora.getNano());

        //podemos sobrecargar el metodo para que incluya segundos
        LocalTime seisConTreinta = LocalTime.of(18, 30);
        LocalTime seisConTreinta2 = LocalTime.of(6, 30, 59);
        System.out.println("seisConTreinta " + seisConTreinta);
        System.out.println("seisConTreinta2 = " + seisConTreinta2);

        LocalTime seisConTreintaString = LocalTime.parse("06:30"); //de la mañana, para la tarde 18:30
        System.out.println("seisConTreintaString = " + seisConTreintaString);

        LocalTime sieteConTreinta = LocalTime.of(6, 30).plus(1, ChronoUnit.HOURS);

        //para sumar horas
        System.out.println("sieteConTreinta = " + sieteConTreinta);

        //para chequear si es anterior
        boolean esAnterior = LocalTime.of(6, 30).isBefore(LocalTime.parse("07:30"));

        System.out.println("esAnterior = " + esAnterior);

        //HH para hora 24 hs, hh para hora AM, PM y agregamos la a
        DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String seisConTreintaFormateado = seisConTreinta.format(df);
        System.out.println("seisConTreintaFormateado = " + seisConTreintaFormateado);

        String seisConTreintaFormateado2 = seisConTreinta2.format(df);
        System.out.println("seisConTreintaFormateado2 = " + seisConTreintaFormateado2);

        String ahoraFormateado = ahora.format(df);
        System.out.println("ahoraFormateado = " + ahoraFormateado);

        //otra forma de formatear
        String ahoraFormateado2 = df.format(ahora);
        System.out.println("ahoraFormateado2 = " + ahoraFormateado2);

        //para ver cual es la hora maxima del dia y la hora minima del dia
        LocalTime max =LocalTime.MAX;
        LocalTime min = LocalTime.MIN;

        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }
}
