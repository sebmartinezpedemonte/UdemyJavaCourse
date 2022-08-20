package section23.com.smartinez.pooexcepciones.ejemplo.poointerfaces.repositorio;

import section23.com.smartinez.pooexcepciones.ejemplo.poointerfaces.modelo.BaseEntity;
import section23.com.smartinez.pooexcepciones.ejemplo.poointerfaces.repositorio.excepciones.EscrituraAccesoDatoException;
import section23.com.smartinez.pooexcepciones.ejemplo.poointerfaces.repositorio.excepciones.LecturaAccesoDatoException;
import section23.com.smartinez.pooexcepciones.ejemplo.poointerfaces.repositorio.excepciones.RegistroDuplicadoAccesoDatoException;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractaListRepositorio<T extends BaseEntity> implements OrdenablePaginableCrudRepositorio<T> {
    //o implements CrudRepositorio,
    //        OrdenableRepositorio, PaginableRepositorio

    protected List<T> dataSource;

    public AbstractaListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<T> listar() {

        return dataSource;
    }

    @Override
    //metodo buscar con for
    public T porId(Integer id) throws LecturaAccesoDatoException{
        if(id == null || id <= 0){
            throw new LecturaAccesoDatoException("Id invalido, debe ser > 0");
        }
        T resultado = null;
        for (T cli : dataSource) {
            if (cli.getId() != null && cli.getId().equals(id)) {
                resultado = cli;
                break;
            }
        }
        if(resultado == null){
            throw new LecturaAccesoDatoException("No existe el registro con id: " + id);
        }
        return resultado;
    }

    @Override
    public void crear(T t) throws EscrituraAccesoDatoException{
        if(t == null){
            throw new EscrituraAccesoDatoException("Error al insertar un objeto null");
        }
        if(this.dataSource.contains(t)){
            throw new RegistroDuplicadoAccesoDatoException("Error el objeto con id "
                    + t.getId() + " existe en el repositorio");
        }
        this.dataSource.add(t);
    }


    @Override
    public void eliminar(Integer id) throws LecturaAccesoDatoException{
        this.dataSource.remove(this.porId(id));
    }

    @Override
    public List<T> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }



    @Override
    public int total() {
        return this.dataSource.size();
    }
}
