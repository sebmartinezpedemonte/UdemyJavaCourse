package section28.optionalprogramacionfuncionaljava8.repositorio;


import section28.optionalprogramacionfuncionaljava8.models.Computador;

import java.util.Optional;

public interface Repositorio<T> {

    Optional<Computador> filtrar(String nombre);

}
