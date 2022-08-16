package section21.com.smartinez.poointerfaces.repositorio;

import section21.com.smartinez.poointerfaces.modelo.Cliente;

import java.util.List;

public interface CrudRepositorio {
    //metodos:
    List<Cliente> listar();
    Cliente porId(Integer id);
    void crear(Cliente cliente);
    void editar(Cliente cliente);
    void eliminar(Integer id);
}
