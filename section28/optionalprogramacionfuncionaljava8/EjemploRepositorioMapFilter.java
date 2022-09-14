package section28.optionalprogramacionfuncionaljava8;


import section28.optionalprogramacionfuncionaljava8.models.Computador;
import section28.optionalprogramacionfuncionaljava8.models.Fabricante;
import section28.optionalprogramacionfuncionaljava8.models.Procesador;
import section28.optionalprogramacionfuncionaljava8.repositorio.ComputadorRepositorio;
import section28.optionalprogramacionfuncionaljava8.repositorio.Repositorio;

public class EjemploRepositorioMapFilter {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        String f = repositorio.filtrar("asus")
                .flatMap(Computador::getProcesador)
                .flatMap(Procesador::getFabricante)
                .filter(fab -> "intel".equalsIgnoreCase(fab.getNombre()))
                .map(Fabricante::getNombre)
                .orElse("Desconocido");

        System.out.println(f);


    }

}
