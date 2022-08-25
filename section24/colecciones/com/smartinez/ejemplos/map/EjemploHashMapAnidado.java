package section24.colecciones.com.smartinez.ejemplos.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashMapAnidado {
    public static void main(String[] args) {

        //key and value. Los HashMap no ordenan
        Map<String, Object> persona = new HashMap<>();
        System.out.println("contiene elementos= " + !persona.isEmpty());
        persona.put(null, "12345");
        //solo se acepta un null porque las llaves son unicas
        persona.put(null, "12345"); //este no se suma
        persona.put("nombre", "John");
        persona.put("apellido", "Doe");
        persona.put("apellidoPaterno", "Doe");
        persona.put("email", "john.doe@email.com");
        persona.put("edad", "30");


        Map<String, String> direccion = new HashMap<>();
        direccion.put("pais", "USA");
        direccion.put("estado" , "California");
        direccion.put("ciudad", "Santa Barbara");
        direccion.put("calle", "one street");
        direccion.put("numero", "120");
        //anidamos un HashMap dentro de otro
        persona.put("direccion", direccion);



        System.out.println("persona = " + persona);

        String nombre = (String) persona.get("nombre");
        System.out.println("nombre = " + nombre);
        String apellido = (String) persona.get("apellido");
        System.out.println("apellido = " + apellido);

        Map<String, String> direccionPersona = (Map<String, String>) persona.get("direccion");
        String pais = direccionPersona.get("pais");
        String ciudad = direccionPersona.get("ciudad");
        String barrio = direccionPersona.getOrDefault("barrio", "La playa");
        System.out.println("El pais de " + nombre + " es: " + pais);
        System.out.println("La ciudad de " + nombre + " es: " + ciudad);
        System.out.println("El barrio de " + nombre + " es: " + barrio);

        //String valorApellido = persona.remove("apellidoPaterno");
        //System.out.println("eliminado: " + valorApellido);
        boolean b = persona.remove("apellidoPaterno", "Doe");
        System.out.println("eliminado: " + b);
        System.out.println("persona = " + persona);

        boolean b2 = persona.containsKey("apellidoPaterno");
        System.out.println("b2 = " + b2);

        b2 = persona.containsValue("john.doe@email.com");
        System.out.println("b2 = " + b2);

        System.out.println("========== solo valores con .values() ============");
        //Iterar solo valores
        Collection<Object> valores = persona.values();
        for(Object v : valores){
            System.out.println("v = " + v);
        }
        System.out.println("========== solo llaves con .keySet() ============");
        //Iterar solo llaves
        Set<String> llaves = persona.keySet();
        for(String k : llaves){
            System.out.println("k = " + k);
        }

        System.out.println("========= valores y llaves con entrySet.() =============");
        //Iterar valores y llaves juntos con entrySet
        for(Map.Entry<String, Object> par : persona.entrySet()){
            Object valor = par.getValue();
            if(valor instanceof Map){
                String nom = (String) persona.get("nombre");
                Map<String, String> direccionMap =(Map<String,String>) valor;
                for(Map.Entry<String, String> parDir : direccionMap.entrySet()){
                    System.out.println(parDir.getKey() + " => " + parDir.getValue());
                }
            }else{
                System.out.println(par.getKey() + " => " + valor);
            }
        }

        System.out.println("========== valores y llaves con .keySet() ============");
        //Otra forma
        //Iterar valores y llaves juntos con keySet
        for(String llave : persona.keySet()){
            Object valor =  persona.get(llave);
            if(valor instanceof Map){
                String nom = (String) persona.get("nombre");
                Map<String, String> direccionMap =(Map<String,String>) valor;
                System.out.println("El pais de "+ nom +": "
                        + direccionMap.get("pais"));
                System.out.println("El estado de "+ nom +": "
                        + direccionMap.get("estado"));
                System.out.println("La ciudad de "+ nom +": "
                        + direccionMap.get("ciudad"));
            }else{
                System.out.println(llave + " => " + valor);
            }

        }

        System.out.println("========== valores y llaves con .forEach(), expresiones lambda usando Java 8============");
        persona.forEach((llave, valor) ->{
            System.out.println(llave + " => " + valor);
        });

        System.out.println("cantidad total de elementos: " + persona.size());
        System.out.println("contiene elementos= " + !persona.isEmpty());
        persona.replace("nombre", "Andres");
        System.out.println("persona = " + persona);
        //sobrecarga de replace con antiguo valor
        boolean b3 = persona.replace("nombre", "Andres" , "Miguel");
        System.out.println("b3 = " + b3);
        System.out.println("persona = " + persona);



    }
}
