package section23.com.smartinez.pooexcepciones.ejemplo.poointerfaces;

import section23.com.smartinez.pooexcepciones.ejemplo.poointerfaces.modelo.Cliente;
import section23.com.smartinez.pooexcepciones.ejemplo.poointerfaces.repositorio.Direccion;
import section23.com.smartinez.pooexcepciones.ejemplo.poointerfaces.repositorio.OrdenablePaginableCrudRepositorio;
import section23.com.smartinez.pooexcepciones.ejemplo.poointerfaces.repositorio.OrdenableRepositorio;
import section23.com.smartinez.pooexcepciones.ejemplo.poointerfaces.repositorio.excepciones.AccesoDatoException;
import section23.com.smartinez.pooexcepciones.ejemplo.poointerfaces.repositorio.excepciones.EscrituraAccesoDatoException;
import section23.com.smartinez.pooexcepciones.ejemplo.poointerfaces.repositorio.excepciones.LecturaAccesoDatoException;
import section23.com.smartinez.pooexcepciones.ejemplo.poointerfaces.repositorio.excepciones.RegistroDuplicadoAccesoDatoException;
import section23.com.smartinez.pooexcepciones.ejemplo.poointerfaces.repositorio.lista.ClienteListRepositorio;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {
        try {
            OrdenablePaginableCrudRepositorio<Cliente> repo = new ClienteListRepositorio();
            repo.crear(new Cliente("Jano", "Perez"));
            repo.crear(new Cliente("Bea", "Gonzalez"));
            repo.crear(new Cliente("Luci", "Martinez"));
            Cliente andres = new Cliente("Andres", "Guzman");
            repo.crear(andres);
            repo.crear(andres);

            //repo.crear(null);


            List<Cliente> clientes = repo.listar();
            clientes.forEach(System.out::println);
            System.out.println("===== paginable =====");
            List<Cliente> paginable = repo.listar(1, 4);
            paginable.forEach(System.out::println);

            System.out.println("===== ordenar =====");
            List<Cliente> clientesOrdenAsc = repo
                    .listar("apellido", Direccion.ASC);
            for (Cliente c : clientesOrdenAsc) {
                System.out.println(c);
            }

            System.out.println("===== editar =====");
            Cliente beaActualizar = new Cliente("Bea", "Mena");
            beaActualizar.setId(2);
            repo.editar(beaActualizar);
            Cliente bea = repo.porId(2);
            System.out.println(bea);

            ((OrdenableRepositorio) repo)
                    .listar("apellido", Direccion.ASC).forEach(System.out::println);

            System.out.println("===== eliminar =====");
            repo.eliminar(2);
            repo.listar().forEach(System.out::println);
            System.out.println("===== total =====");
            System.out.println("Total registros " + repo.total());
        }catch(RegistroDuplicadoAccesoDatoException e){
            System.out.println("Registro Duplicado: " + e.getMessage());
            e.printStackTrace();

        }
        catch(LecturaAccesoDatoException e){
            System.out.println("Lectura: " + e.getMessage());
            e.printStackTrace();
        }catch(EscrituraAccesoDatoException e){
            System.out.println("Escritura: " + e.getMessage());
            e.printStackTrace();
        }
        catch(AccesoDatoException e){
            System.out.println("Generica: " + e.getMessage());
            e.printStackTrace();
        }

    }
}
