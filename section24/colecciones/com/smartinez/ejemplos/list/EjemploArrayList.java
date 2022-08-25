package section24.colecciones.com.smartinez.ejemplos.list;

import section24.colecciones.com.smartinez.ejemplos.modelo.Alumno;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EjemploArrayList {
    public static void main(String[] args) {
        List<Alumno> al = new ArrayList<>();
        System.out.println(al + ", size = " + al.size());
        System.out.println("esta vacia = " + al.isEmpty());
        al.add(new Alumno("Pato", 5));
        al.add(new Alumno("Cata", 6));
        al.add(new Alumno("Luci", 4));
        al.add(2, new Alumno("Jano", 7));
        al.set(3, new Alumno("Andres", 3));

        System.out.println(al + ", size = " + al.size() );
        System.out.println("esta vacia = " + al.isEmpty());

        //para remover al objeto este tiene que ser identico. Lo busca con el metodo equals
        al.remove(new Alumno("Jano", 7)); //por instancia usa el euqausl
       //al.remove(0);//remove por indice: usa el indice
        System.out.println(al + ", size = " + al.size());

        //ver si el arraylist contiene cierto objeto
        boolean b = al.contains(new Alumno("Jano", 7));
        System.out.println("La lista contiene a Jano = " + b);

        boolean b2 = al.contains(new Alumno("Pato", 5));
        System.out.println("La lista contiene a Pato = " + b2);

        Object a[] = al.toArray();
        for(int i = 0; i< a.length; i++){
            System.out.println(a[i]);
        }


    }
}
