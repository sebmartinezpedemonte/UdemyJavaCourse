package section24.colecciones.com.smartinez.ejemplos.set;

import section24.colecciones.com.smartinez.ejemplos.modelo.Alumno;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {
        //necesitamos que la clase implemente la interface Comparable
        Set<Alumno> sa = new TreeSet<>();
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andres", 3));
        sa.add(new Alumno("Zeus", 2));
        System.out.println("Ordenado por nota a traves de la implementacion de Comparator en la clase Alumno");
        System.out.println(sa);

        //si quiero cambiar la forma que ordena
        Set<Alumno> sa2 = new TreeSet<>((a,b) -> a.getNombre().compareTo(b.getNombre()));
        sa2.add(new Alumno("Pato", 5));
        sa2.add(new Alumno("Cata", 6));
        sa2.add(new Alumno("Luci", 4));
        sa2.add(new Alumno("Jano", 7));
        sa2.add(new Alumno("Andres", 3));
        sa2.add(new Alumno("Zeus", 2));
        System.out.println("Ordenando al vuelo por nombre en orden alfabetico");
        System.out.println(sa2);

        Set<Alumno> sa3 = new TreeSet<>((a,b) -> b.getNombre().compareTo(a.getNombre()));
        sa3.add(new Alumno("Pato", 5));
        sa3.add(new Alumno("Cata", 6));
        sa3.add(new Alumno("Luci", 4));
        sa3.add(new Alumno("Jano", 7));
        sa3.add(new Alumno("Andres", 3));
        sa3.add(new Alumno("Zeus", 2));
        sa3.add(new Alumno("Zeus", 3));
        System.out.println("Ordenando al vuelo por nombre en orden alfabetico");
        //Zeus no aparece porque la regla de unicidad se aplica para el nombre
        System.out.println(sa3);

        Set<Alumno> sa4 = new TreeSet<>((a,b) -> b.getNota().compareTo(a.getNota()));
        sa4.add(new Alumno("Pato", 5));
        sa4.add(new Alumno("Cata", 6));
        sa4.add(new Alumno("Luci", 4));
        sa4.add(new Alumno("Jano", 7));
        sa4.add(new Alumno("Andres", 3));
        sa4.add(new Alumno("Zeus", 2));
        sa4.add(new Alumno("Lucas", 2));
        System.out.println("Ordenando al vuelo por nota en orden descendente");
        System.out.println(sa4);
        //Lucas no aparece porque la regla de unicidad se aplica para la nota

        Set<Alumno> sa5 = new TreeSet<>(Comparator.comparing(Alumno::getNota).reversed());
        sa5.add(new Alumno("Pato", 5));
        sa5.add(new Alumno("Cata", 6));
        sa5.add(new Alumno("Luci", 4));
        sa5.add(new Alumno("Jano", 7));
        sa5.add(new Alumno("Andres", 3));
        sa5.add(new Alumno("Zeus", 2));
        sa5.add(new Alumno("Lucas", 2));
        System.out.println("Ordenando com Comparator con nota descedente");
        System.out.println(sa4);
    }
}
