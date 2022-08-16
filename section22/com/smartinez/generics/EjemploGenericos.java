package section22.com.smartinez.generics;


import section22.com.smartinez.poointerfaces.modelo.Cliente;
import section22.com.smartinez.poointerfaces.modelo.ClientePremium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenericos {
    public static void main(String[] args) {
        //tipos de datos genericos
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Andres", "Guzman"));

        Cliente andres = clientes.iterator().next();

        Cliente[] clientesArreglo = {new Cliente("Andres", "Guzman"),
                new Cliente("Sebastian", "Martinez")};

        Integer[] enterosArreglo ={1,2,3};

        List<Cliente> clientesLista = fromArrayToList(clientesArreglo);
        List<Integer> enterosLista = fromArrayToList(enterosArreglo);

        clientesLista.forEach(System.out::println);
        enterosLista.forEach(System.out::println);

        List<String> nombres = fromArrayToList(new String[]{"Andres", "Pepe",
        "Luci", "Bea", "John"}, enterosArreglo);
        nombres.forEach(System.out::println);

        List<ClientePremium> clientesPremiumList = fromArrayToList(
          new ClientePremium[]{new ClientePremium("Paco", "Fernandez")});
        System.out.println("===================");
        imprimirClientes(clientes);
        imprimirClientes(clientesLista);
        imprimirClientes(clientesPremiumList);

        System.out.println("Maximo de 1, 9 y 4 es: " + maximo(1,9,4));
        System.out.println("Maximo de 3.9, 11.6, 7.78 es: " + maximo(3.9,11.6,7.78));
        System.out.println("Maximo de zanahoria, arandanos, manzana es: "
            + maximo("zanahoria", "arandano", "manzana"));
        //es zanahoria por la z segun el orden de la tabla unicode
    }

    //metodo generico: sirve para todos los tipos de objetos
    public static <T> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    public static <T extends Number> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    public static <T extends Cliente & Comparable<T>> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }
    //Se pueden poner mas parametros genericos
    public static <T,G> List<T> fromArrayToList(T[] c, G[] g) {
        for (G elemento : g){
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }

    //para poder trabajar tambien con las subclases usamos List<? extends Cliente>
    public static void imprimirClientes(List<? extends Cliente> clientes){

        clientes.forEach(System.out::println);
    }
    //extends tmb para interfaces
    public static <T extends Comparable<T>> T maximo(T a, T b, T c){
        T max = a;
        if(b.compareTo(max) > 0){
            max = b;
        }
        if (c.compareTo(max) > 0){
            max = c;
        }
        return max;
    }
}
