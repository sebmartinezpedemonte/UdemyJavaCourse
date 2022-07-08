package Section14POOClasesYObjetosAssignment20;

import java.lang.reflect.Array;
import java.util.Date;

/*
Se requiere crear la clase OrdenCompra con los siguientes campos privados:
identificador tipo Integer autoincremental, descripcion String, fecha tipo Date,
cliente del tipo Cliente y
finalmente un atributo de tipo arreglo de productos con 4 elementos: Producto[] productos.
En la clase OrdenCompra, crear constructor que inicialice solo la descripción.
En la clase OrdenCompra, crear métodos getter para todos los atributos.
En la clase OrdenCompra implementar sólo métodos set para cliente y fecha.
Respecto a los productos de la clase OrdenCompra, sólo se pueden agregar
 usando el método public void addProducto (Producto producto), nada más,
  es decir no se pueden agregar en el constructor ni en métodos setter.


 */
public class OrdenCompra {
    private Integer identificador;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;
    private int indiceProductos;

    private static int ultimoIdentificador = 0;

    public OrdenCompra(String descripcion) {
        this.identificador = ++ultimoIdentificador;
        this.productos = new Producto[4];
        this.descripcion = descripcion;
    }

    /*
    La clase OrdenCompra debe tener un método que devuelva el gran total,
sumando los precios de los productos.
     */

    public int granTotal(){
        int precio = 0;
        if(productos.length >0) {
            for (Producto producto : productos) {
                precio += producto.getPrecio();
            }
        }
        return precio;
    }
            /*
        Para cada una imprimir sus valores en consola usando método getter incluyendo
 los productos, donde con el método getter obtenemos el arreglo de productos y
  con un foreach recorremos e imprimimos sus atributos fabricante, nombre y precio.
   Tener en cuenta en la salida el gran total de cada orden, los clientes, todo.
         */

    public void mostrarInformacionCompra(){
        System.out.println(cliente.getNombre() + " " + cliente.getApellido() + " en el dia : " + getFecha() + " ha comprado los siguientes productos: ");

        for(Producto producto : productos){
            System.out.println("Fabricante " + producto.getFabricante());
            System.out.println("Nombre " + producto.getNombre());
            System.out.println("Precio " + producto.getPrecio());
            System.out.println("*******************************");
        }
        System.out.println("El costo total de la compra fue de: " + this.granTotal());
        System.out.println("____________________________________________________________________________________________________________");
    }


    public OrdenCompra addProducto(Producto producto){
        if(indiceProductos < this.productos.length){
            this.productos[indiceProductos++] = producto;
        }
        return this;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public static Integer getUltimoIdentificador() {
        return ultimoIdentificador;
    }
}
