package section27.StreamAPI;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BusquedaSimple {
    public static void main(String[] args) {
        System.out.println("Buscar un objeto en particular dentro de una lista es super simple.");
        System.out.println("Primero creamos una lista de tipo Usuario de forma rapida: ");
        Stream<Usuario> nombres = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1] ));

        List<Usuario> lista = nombres.collect(Collectors.toList());
        System.out.println("Luego si queremos la recorremos: ");
        lista.forEach(System.out::println);
        System.out.println("Luego buscamos un elemento:");
        Usuario usuario = lista.stream()
                .filter(u -> u.getNombre().equals("Pepe"))
                .findFirst().get();

        System.out.println("Busqueda rapida por nombre Pepe: " + usuario);

        System.out.println("Por si no existe hay que agregar try y catch");
        Usuario usuario2 = null;
        try {
            usuario2 = lista.stream()
                    .filter(u -> u.getId().equals(1))
                    .findFirst().get();
        }catch (RuntimeException e){
        }
        System.out.println("Busqueda rapida por id: " + usuario2);



    }
}
