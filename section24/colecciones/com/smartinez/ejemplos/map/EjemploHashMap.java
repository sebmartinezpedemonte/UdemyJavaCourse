package section24.colecciones.com.smartinez.ejemplos.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashMap {
    public static void main(String[] args) {

        //key and value. Los HashMap no ordenan
        Map<String, String> persona = new HashMap<>();
        System.out.println("contiene elementos= " + !persona.isEmpty());
        persona.put(null, "12345");
        //solo se acepta un null porque las llaves son unicas
        persona.put(null, "12345"); //este no se suma
        persona.put("nombre", "John");
        persona.put("apellido", "Doe");
        persona.put("apellidoPaterno", "Doe");
        persona.put("email", "john.doe@email.com");
        persona.put("edad", "30");

        System.out.println("persona = " + persona);

        String nombre = persona.get("nombre");
        System.out.println("nombre = " + nombre);
        String apellido = persona.get("apellido");
        System.out.println("apellido = " + apellido);

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
        Collection<String> valores = persona.values();
        for(String v : valores){
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
        for(Map.Entry<String, String> par : persona.entrySet()){
            System.out.println(par.getKey() + " => " + par.getValue());
        }

        System.out.println("========== valores y llaves con .keySet() ============");
        //Otra forma
        //Iterar valores y llaves juntos con keySet
        for(String llave : persona.keySet()){
            String valor = persona.get(llave);
            System.out.println(llave + " => " + valor);
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
