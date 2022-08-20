package section24.colecciones.com.smartinez.ejemplos.set;

import java.util.*;

public class EjemploHashSetAgregar {
    public static void main(String[] args) {

        Set<String> hs = new HashSet<>();
        System.out.println(hs.add("uno"));
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");
        System.out.println(hs);
        //el set no es ordenado por orden de ingreso
        //y no se puede ordenar


        boolean b = hs.add("tres");
        System.out.println("permite elementos duplicados " + b);
        System.out.println(hs);

        //si fuese List podria usar Collections.sort(hs);
        //para ordenar la lista

        List<String> lista = new ArrayList<>(hs);
        Collections.sort(lista);
        System.out.println(lista);
        //queda ordenada en orden alfabetico
    }
}
