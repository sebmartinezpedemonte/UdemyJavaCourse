package section24.colecciones.com.smartinez.ejemplos.list;

import section24.colecciones.com.smartinez.ejemplos.modelo.Alumno;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class EjemploLinkedList {
    public static void main(String[] args) {

        LinkedList<Alumno> enlazada = new LinkedList<>();
        System.out.println(enlazada + ", size = " + enlazada.size());
        System.out.println("esta vacia = " + enlazada.isEmpty());
        enlazada.add(new Alumno("Pato", 5));
        enlazada.add(new Alumno("Cata", 6));
        enlazada.add(new Alumno("Luci", 4));
        enlazada.add(new Alumno("Jano", 7));
        enlazada.add(new Alumno("Andres", 3));

        System.out.println(enlazada + ", size = " + enlazada.size());

        enlazada.addFirst(new Alumno("Zeus", 5));
        enlazada.addLast(new Alumno("Atenea", 6));
        System.out.println(enlazada + ", size = " + enlazada.size());

        //este lanza excepcion si la lista esta vacia
        System.out.println("Primero = " + enlazada.getFirst());
        //este lanza null si la lista esta vacia
        System.out.println("Primero = " + enlazada.peekFirst());


        System.out.println("Ultimo = " + enlazada.getLast());
        System.out.println("Indice 2 = " + enlazada.get(2));

        //remove es como extraer de la lista. lanza excepcion si esta vacia
        Alumno zeus = enlazada.removeFirst();
        //este lanza null si la lista esta vacia
        enlazada.pollFirst();
        //el pop es equivalente al removeFirst
        enlazada.pop();

        enlazada.removeLast();
        System.out.println(enlazada + ", size = " + enlazada.size());

        enlazada.remove(new Alumno("Jano", 7));
        System.out.println(enlazada + ", size = " + enlazada.size());

        Alumno a = new Alumno("Lucas" , 5);
        enlazada.addLast(a);
        System.out.println("Indice de Lucas = " + enlazada.indexOf(a));

        //reemplazamos al que esta en la posicion 2
        enlazada.set(2, new Alumno("Lalo", 7));
        System.out.println(enlazada + ", size = " + enlazada.size());

        System.out.println("ListIterator");
        ListIterator<Alumno> li = enlazada.listIterator();

        while(li.hasNext()){
            Alumno alumno = li.next();
            System.out.println(alumno);
        }
        System.out.println("======================= Previous");
        while(li.hasPrevious()){
            Alumno alumno = li.previous();
            System.out.println(alumno);
        }


    }
}
