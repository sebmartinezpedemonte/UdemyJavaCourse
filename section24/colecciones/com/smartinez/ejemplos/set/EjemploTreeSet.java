package section24.colecciones.com.smartinez.ejemplos.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {
        //el TreeSet ordena los objetos acorde a la tabla unicode sin tener que invocar ningun sort de forma automatica
        //no podemos colocar cualquier objeto, tienen que cumplir con que sean comparables
        //tienen que implementar el contrato de la interfaz comparable
        //y tener el metodo compareTo para que se puedan ordenar

        Set<String> ts = new TreeSet<>();
        ts.add("uno");
        ts.add("dos");
        ts.add("tres");
        ts.add("tres");
        ts.add("cuatro");
        ts.add("cinco");
        //va a ordenar de forma alfabetica(de la tabla unicode en verdad)
        //como todos los set, el treeset solo agrega los unicos, no agrega duplicados
        System.out.println("ts = " + ts);

        Set<Integer> numeros = new TreeSet<>();
        numeros.add(1);
        numeros.add(5);
        numeros.add(4);
        numeros.add(2);
        numeros.add(3);
        numeros.add(10);

        System.out.println("numeros = " + numeros);
        
        //Ordenando de una forma que elegimos nosotros
        //Implementando la interfaz Comparator al vuelo
        Set<String> ts1 = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return 0;
            }
        });
        //con expresion lambda quedaria asi: ordenamos de forma descendente
        Set<String> ts2 = new TreeSet<>((a, b) -> b.compareTo(a));
        ts2.add("uno");
        ts2.add("dos");
        ts2.add("tres");
        ts2.add("tres");
        ts2.add("cuatro");
        ts2.add("cinco");

        System.out.println("ts2 = " + ts2);

        //Cambiamos el orden
        Set<Integer> numeros2 = new TreeSet<>(Comparator.reverseOrder());
        numeros2.add(1);
        numeros2.add(5);
        numeros2.add(4);
        numeros2.add(2);
        numeros2.add(3);
        numeros2.add(10);

        System.out.println("numeros2 = " + numeros2);
    }
}
