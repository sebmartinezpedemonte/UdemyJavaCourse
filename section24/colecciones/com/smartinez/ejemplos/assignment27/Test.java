package section24.colecciones.com.smartinez.ejemplos.assignment27;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test {
    public static void main(String[] args)  {
        List<Vuelo> llegadas = new ArrayList<>();

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        try {
            llegadas.add(new Vuelo("AAL 933", "New York", "Santiago", df.parse("2021-08-29 05:39"), 62));
            llegadas.add(new Vuelo("LAT 755", "Sao Paulo", "Santiago", df.parse("2021-08-31 04:45"), 47));
            llegadas.add(new Vuelo("SKU 621", "Rio De Janeiro", "Santiago", df.parse("2021-08-30 16:00"), 52));
            llegadas.add(new Vuelo("DAL 147", "Atlanta", "Santiago", df.parse("2021-08-29 13:22"), 59));
            llegadas.add(new Vuelo("AVA 241", "Bogota", "Santiago", df.parse("2021-08-31 14:05"), 25));
            llegadas.add(new Vuelo("AMX 10", "Mexico City", "Santiago", df.parse("2021-08-31 05:20"), 29));
            llegadas.add(new Vuelo("IBE 6833", "Londres", "Santiago", df.parse("2021-08-30 08:45"), 55));
            llegadas.add(new Vuelo("LAT 2479", "Frankfurt", "Santiago", df.parse("2021-08-29 07:41"), 51));
            llegadas.add(new Vuelo("SKU 803", "Lima", "Santiago", df.parse("2021-08-30 10:35"), 48));
            llegadas.add(new Vuelo("LAT 533", "Los Ángeles", "Santiago", df.parse("2021-08-29 09:14"), 59));
            llegadas.add(new Vuelo("LAT 1447", "Guayaquil", "Santiago", df.parse("2021-08-31 08:33"), 31));
            llegadas.add(new Vuelo("CMP 111", "Panama City", "Santiago", df.parse("2021-08-31 15:15"), 29));
            llegadas.add(new Vuelo("LAT 705", "Madrid", "Santiago", df.parse("2021-08-30 08:14"), 47));
            llegadas.add(new Vuelo("AAL 957", "Miami", "Santiago", df.parse("2021-08-29 22:53"), 60));
            llegadas.add(new Vuelo("ARG 5091", "Buenos Aires", "Santiago", df.parse("2021-08-31 09:57"), 32));
            llegadas.add(new Vuelo("LAT 1283", "Cancún", "Santiago", df.parse("2021-08-31 04:00"), 35));
            llegadas.add(new Vuelo("LAT 579", "Barcelona", "Santiago", df.parse("2021-08-29 07:45"), 61));
            llegadas.add(new Vuelo("AAL 945", "Dallas-Fort Worth", "Santiago", df.parse("2021-08-30 07:12"), 58));
            llegadas.add(new Vuelo("LAT 501", "París", "Santiago", df.parse("2021-08-29 18:29"), 49));
            llegadas.add(new Vuelo("LAT 405", "Montevideo", "Santiago", df.parse("2021-08-30 15:45"), 39));
        }catch(ParseException e){
            System.out.println(e.getMessage());
        }
        //solucion profesor
        //llegadas.sort((v1, v2) -> v2.getFechaLlegada().compareTo(v1.getFechaLlegada()));

        llegadas.sort(Comparator.comparing(Vuelo::getFechaLlegada));
        System.out.println("... listado ordenado por fecha llegada ascendente ...");
        llegadas.forEach(System.out::println);
        String nombreUltimo = llegadas.get(llegadas.size() - 1).getNombre();
        String origenUltimo =llegadas.get(llegadas.size() - 1).getOrigen();
        Date fechaLlegadaUltimo = llegadas.get(llegadas.size() - 1).getFechaLlegada();
        System.out.println("El último vuelo en llegar es " +  nombreUltimo +": " +  origenUltimo + ", aterriza el " + fechaLlegadaUltimo);

        //solucion profesor
        //llegadas.sort((v1, v2) -> Integer.valueOf(v2.getNumPasajeros()).compareTo(v1.getNumPasajeros()));
        llegadas.sort(Comparator.comparing(Vuelo::getNumPasajeros).reversed());
        String nombreMin = llegadas.get(llegadas.size() - 1).getNombre();
        String origenMin =llegadas.get(llegadas.size() - 1).getOrigen();
        int numPasajerosMin = llegadas.get(llegadas.size() - 1).getNumPasajeros();
        System.out.println("El vuelo con menor número de pasajeros es " + nombreMin + ": " + origenMin + ", con " + numPasajerosMin + " pasajeros.");

        //solucion profesor
        //Vuelo vueloMenorNumero = new LinkedList<>(llegadas).peekLast();
        //System.out.println("El vuelo con menor número de pasajeros es " + vueloMenorNumero.getNombre() + ": " + vueloMenorNumero.getOrigen()+ ", con " + vueloMenorNumero.getNumPasajeros() + " pasajeros.");

    }
}
