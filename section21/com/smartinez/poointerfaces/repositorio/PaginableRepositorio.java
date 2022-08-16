package section21.com.smartinez.poointerfaces.repositorio;

import section21.com.smartinez.poointerfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {

    List<Cliente> listar(int desde, int hasta);
}
