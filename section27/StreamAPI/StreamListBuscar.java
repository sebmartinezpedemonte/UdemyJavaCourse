package section27.StreamAPI;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamListBuscar {
    public static void main(String[] args) {
        //Convertir un String al tipo Usuario y haciendo una lista de usuarios y luego buscar en esa lista
        Stream<Usuario> nombres = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1] ));

        List<Usuario> lista = nombres.collect(Collectors.toList());
        lista.forEach(System.out::println);

        Usuario usuario = lista.stream()
                .filter(u -> u.getNombre().equals("Pepe"))
                .findFirst().get();

        System.out.println("Busqueda rapida Pepe: " + usuario);




        System.out.println("Buscar un objeto en particular dentro de una lista es super simple.");

        System.out.println("Encontrando: ");
        Stream<Usuario> nombres2 = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1] ))
                .filter(u -> u.getNombre().equals("Pepe"));



        Optional<Usuario> usuario2 = nombres2.findFirst();
        System.out.println(usuario2.get());


    }
}
