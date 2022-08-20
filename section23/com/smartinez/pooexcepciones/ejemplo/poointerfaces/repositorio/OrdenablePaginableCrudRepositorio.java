package section23.com.smartinez.pooexcepciones.ejemplo.poointerfaces.repositorio;

public interface OrdenablePaginableCrudRepositorio<T> extends OrdenableRepositorio<T>,
        PaginableRepositorio<T>, CrudRepositorio<T>, ContableRepositorio {
}
