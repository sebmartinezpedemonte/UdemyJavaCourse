package section22.com.smartinez.poointerfaces.repositorio;


import java.util.List;

public interface OrdenableRepositorio<T> {
    //campo: nombre/apellido/id
    //dir: ordenar ascendente o descendente
    List<T> listar(String campo, Direccion dir);



}
