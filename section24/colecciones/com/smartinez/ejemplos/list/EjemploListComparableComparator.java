package section24.colecciones.com.smartinez.ejemplos.list;

import section24.colecciones.com.smartinez.ejemplos.modelo.Alumno;

import java.util.*;

public class EjemploListComparableComparator {
    public static void main(String[] args) {
        List<Alumno> sa = new ArrayList<>();
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andres", 3));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Zeus", 2));
        Alumno c = new Alumno("Beto", 8);
        sa.add(c);
        sa.add(c);
        //en esta si se pueden agregar objetos repetidos tanto como objeto o por mismos valores

        //Collections.sort(sa);por defecto se aplica el ordenamiento que tenemos en el compareTo de la clase Alumno

        //para elegir al vuelo como ordenar. En este caso por nota descendente
        //Collections.sort(sa, (a, b) -> b.getNota().compareTo(a.getNota()));

        //Sino podemos usar .sort
        //sa.sort((a,b) -> a.getNota().compareTo(b.getNota()));

        //Sino usando metodo de referencia
        System.out.println("Ordenando por nombre de la z a la a");
        sa.sort(Comparator.comparing(Alumno::getNombre).reversed());

        System.out.println(sa);
        System.out.println("Iterando usando API Stream forEach, expresiones lambda");
        sa.forEach(System.out::println);


    }
}
