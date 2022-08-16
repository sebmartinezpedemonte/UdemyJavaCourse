package section21.com.smartinez.poointerfaces.repositorio;

import section21.com.smartinez.poointerfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {
    //campo: nombre/apellido/id
    //dir: ordenar ascendente o descendente
    List<Cliente> listar(String campo, Direccion dir);



}
