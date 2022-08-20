package section23.com.smartinez.pooexcepciones.ejemplo.poointerfaces.repositorio;


import java.util.List;

public interface PaginableRepositorio<T> {

    List<T> listar(int desde, int hasta);
}
