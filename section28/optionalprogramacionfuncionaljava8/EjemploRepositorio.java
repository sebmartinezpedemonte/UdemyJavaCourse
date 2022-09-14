package section28.optionalprogramacionfuncionaljava8;


import section28.optionalprogramacionfuncionaljava8.models.Computador;
import section28.optionalprogramacionfuncionaljava8.repositorio.ComputadorRepositorio;
import section28.optionalprogramacionfuncionaljava8.repositorio.Repositorio;

import java.util.Optional;

public class EjemploRepositorio {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        repositorio.filtrar("rog").ifPresentOrElse(System.out::println,
                () -> System.out.println("No se encontró"));

        //Optional<Computador> pc = repositorio.filtrar("asus rog");

        /*if(pc.isPresent()) {
            System.out.println(pc.get());
        } else {
            System.out.println("No se encontró");
        }*/
    }
}
