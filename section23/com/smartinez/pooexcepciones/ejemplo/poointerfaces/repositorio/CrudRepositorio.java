package section23.com.smartinez.pooexcepciones.ejemplo.poointerfaces.repositorio;


import section23.com.smartinez.pooexcepciones.ejemplo.poointerfaces.repositorio.excepciones.AccesoDatoException;

import java.util.List;

public interface CrudRepositorio<T> {
    //metodos:
    List<T> listar();
    T porId(Integer id) throws AccesoDatoException;
    void crear(T t) throws AccesoDatoException;
    void editar(T t) throws AccesoDatoException;
    void eliminar(Integer id) throws AccesoDatoException;
}
