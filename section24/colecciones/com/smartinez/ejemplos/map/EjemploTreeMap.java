package section24.colecciones.com.smartinez.ejemplos.map;


import java.util.*;

public class EjemploTreeMap {
    public static void main(String[] args) {

        //key and value. Los TreeMap ordenan de forma natural las llaves(orden alfabetico y menor a mayor(unicode))
        Map<String, Object> persona = new TreeMap<>();
        //persona.put( "12345", null);
        //persona.put(null, "12345");
        //si guardamos un null como llave lanza error
        //porque los null no son ordenables



        persona.put("nombre", "John");
        persona.put("apellido", "Doe");
        persona.put("apellidoPaterno", "Doe");
        persona.put("email", "john.doe@email.com");
        persona.put("edad", "30");


        Map<String, String> direccion = new TreeMap<>();
        direccion.put("pais", "USA");
        direccion.put("estado" , "California");
        direccion.put("ciudad", "Santa Barbara");
        direccion.put("calle", "one street");
        direccion.put("numero", "120");
        //anidamos un HashMap dentro de otro
        persona.put("direccion", direccion);

        System.out.println("persona = " + persona);

        System.out.println("============ ordenado de forma descendente usando compareTo =========");
        Map<String, Object> persona2 = new TreeMap<>((a , b) -> b.compareTo(a));

        persona2.put("nombre", "John");
        persona2.put("apellido", "Doe");
        persona2.put("apellidoPaterno", "Doe");
        persona2.put("email", "john.doe@email.com");
        persona2.put("edad", "30");


        persona2.put("direccion", direccion);

        System.out.println("persona2 = " + persona2);

        System.out.println("============ ordenado de forma descendente  usando Comparator.reverseOrder() con java 8=========");
        Map<String, Object> persona3 = new TreeMap<>(Comparator.reverseOrder());

        persona3.put("nombre", "John");
        persona3.put("apellido", "Doe");
        persona3.put("apellidoPaterno", "Doe");
        persona3.put("email", "john.doe@email.com");
        persona3.put("edad", "30");

        persona3.put("direccion", direccion);

        System.out.println("persona3 = " + persona3);

        System.out.println("============ ordenado por el largo de los nombres de llave =========");
        Map<String, Object> persona4 = new TreeMap<>(Comparator.comparing(String::length));

        persona4.put("nombre", "John");
        persona4.put("apellido", "Doe");
        persona4.put("apellidoPaterno", "Doe");
        persona4.put("email", "john.doe@email.com");
        persona4.put("edad", "30");

        persona4.put("direccion", direccion);

        System.out.println("persona4 = " + persona4);

        System.out.println("============ ordenado por el largo de los nombres de llave en orden inverso=========");
        Map<String, Object> persona5 = new TreeMap<>(Comparator.comparing(String::length).reversed());

        persona5.put("nombre", "John");
        persona5.put("apellido", "Doe");
        persona5.put("apellidoPaterno", "Doe");
        persona5.put("email", "john.doe@email.com");
        persona5.put("edad", "30");

        persona5.put("direccion", direccion);

        System.out.println("persona5 = " + persona5);
    }
}
