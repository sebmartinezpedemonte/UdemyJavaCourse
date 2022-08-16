package section22.com.smartinez.poointerfaces.repositorio.lista;

import section22.com.smartinez.poointerfaces.modelo.Cliente;
import section22.com.smartinez.poointerfaces.repositorio.AbstractaListRepositorio;
import section22.com.smartinez.poointerfaces.repositorio.Direccion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class ClienteListRepositorio extends AbstractaListRepositorio<Cliente> {
    //o implements CrudRepositorio,
    //        OrdenableRepositorio, PaginableRepositorio


    @Override
    public void editar(Cliente cliente) {
        Cliente c = this.porId(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApellido(cliente.getApellido());
    }

    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);
        listaOrdenada.sort((a, b) -> {
            int resultado = 0;
            if(dir == Direccion.ASC){
                resultado = ordenar(campo, a, b);
            } else if(dir == Direccion.DESC){
                resultado = ordenar(campo, b, a);
            }
            return resultado;
        });
        return listaOrdenada;
    }
    /*
    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }


     */
    public static int ordenar(String campo, Cliente a, Cliente b){
        int resultado = 0;
        switch (campo){
            case "id" ->
                    resultado = a.getId().compareTo(b.getId());
            case "nombre" ->
                    resultado = a.getNombre().compareTo(b.getNombre());
            case "apellido" ->
                    resultado = a.getApellido().compareTo(b.getApellido());
        }
        return resultado;
    }




    /*
    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);
        listaOrdenada.sort(new Comparator<Cliente>() {
            @Override
            public int compare(Cliente a, Cliente b) {
                int resultado = 0;
                if (dir == Direccion.ASC) {
                   resultado = this.ordenar(a,b);
                } else if (dir == Direccion.DESC) {
                   resultado = this.ordenar(b,a);
                }
                return resultado;
            }
            private int ordenar(Cliente a, Cliente b) {
                int resultado = 0;
                switch (campo) {
                    case "id" -> resultado = b.getId().compareTo(a.getId());
                    case "nombre" -> resultado = b.getNombre().compareTo(a.getNombre());
                    case "apellido" -> resultado = b.getApellido().compareTo(a.getApellido());
                }

                return resultado;
            }

        });
        return listaOrdenada;
    }

     */

}
