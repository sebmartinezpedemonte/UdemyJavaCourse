package section24.colecciones.com.smartinez.ejemplos.set;

import section24.colecciones.com.smartinez.ejemplos.modelo.Alumno;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploHashSetUnicidad {
    public static void main(String[] args) {
        //necesitamos que la clase implemente la interface Comparable
        Set<Alumno> sa = new HashSet<>();
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andres", 3));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Zeus", 2));
        //los dos ultimos son instancias distintas con los mismos valores, no son el mismo objeto
        //por eso ambos son agregados al Set
        //para no repetir el ingreso de un objeto con mismos valores usamos el equals y el hashcode
        Alumno b = new Alumno("Alberto", 8);
        sa.add(b);
        sa.add(b);
        //En este caso no se agrega a 2 veces ya que son el mismo objeto
        System.out.println(sa);
        //Tambien se puede hacer para que no se repita uno con
        //el mismo nombre o misma nota cambiando hashcode e equals


        //Formas de iterar en un Set
        System.out.println("Iterando usando un foreach");
        for(Alumno a : sa){
            System.out.println(a.getNombre());
        }

        System.out.println("Iterando usando while e iterator");
        Iterator<Alumno> it = sa.iterator();
        while(it.hasNext()){
            Alumno a = it.next();
            System.out.println(a.getNombre());
        }

        System.out.println("Iterando usando API Stream forEach, expreseiones lambda");
        sa.forEach(a -> System.out.println(a.getNombre()));
        sa.forEach(System.out::println);

    }
}
