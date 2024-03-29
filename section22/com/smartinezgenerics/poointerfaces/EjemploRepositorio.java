package section22.com.smartinezgenerics.poointerfaces;

import section22.com.smartinezgenerics.poointerfaces.modelo.Cliente;
import section22.com.smartinezgenerics.poointerfaces.repositorio.*;
import section22.com.smartinezgenerics.poointerfaces.repositorio.lista.ClienteListRepositorio;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {

        OrdenablePaginableCrudRepositorio<Cliente> repo = new ClienteListRepositorio();
        repo.crear(new Cliente("Jano", "Perez"));
        repo.crear(new Cliente("Bea", "Gonzalez"));
        repo.crear(new Cliente("Luci", "Martinez"));
        repo.crear(new Cliente("Andres", "Guzman"));

        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);
        System.out.println("===== paginable =====");
        List<Cliente> paginable = repo.listar(1,4);
        paginable.forEach(System.out::println);

        System.out.println("===== ordenar =====");
        List<Cliente> clientesOrdenAsc = repo
                                                .listar("apellido", Direccion.ASC);
        for(Cliente c: clientesOrdenAsc){
            System.out.println(c);
        }

        System.out.println("===== editar =====");
        Cliente beaActualizar  = new Cliente("Bea", "Mena");
        beaActualizar.setId(2);
        repo.editar(beaActualizar);
        Cliente bea = repo.porId(2);
        System.out.println(bea);

        ((OrdenableRepositorio)repo)
                .listar("apellido", Direccion.ASC).forEach(System.out::println);

        System.out.println("===== eliminar =====");
        repo.eliminar(2);
        repo.listar().forEach(System.out::println);
        System.out.println("===== total =====");
        System.out.println("Total registros " + repo.total());
    }
}
