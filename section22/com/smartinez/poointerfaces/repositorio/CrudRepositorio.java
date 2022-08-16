package section22.com.smartinez.poointerfaces.repositorio;


import java.util.List;

public interface CrudRepositorio<T> {
    //metodos:
    List<T> listar();
    T porId(Integer id);
    void crear(T t);
    void editar(T t);
    void eliminar(Integer id);
}
