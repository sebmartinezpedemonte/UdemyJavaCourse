package section28.optionalprogramacionfuncionaljava8;


import section28.optionalprogramacionfuncionaljava8.models.Computador;
import section28.optionalprogramacionfuncionaljava8.repositorio.ComputadorRepositorio;
import section28.optionalprogramacionfuncionaljava8.repositorio.Repositorio;

import java.util.Optional;

public class EjemploRepositorioMetodosOrElseThrow {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        Computador pc = repositorio.filtrar("rog").orElseThrow(IllegalStateException::new);
        System.out.println(pc);
        String archivo = "documento.pdf";
        String extension = Optional.ofNullable(archivo)
                .filter(a -> a.contains("."))
                .map(a -> a.substring(archivo.lastIndexOf(".") + 1))
                .orElseThrow();
        System.out.println(extension);


    }
}
