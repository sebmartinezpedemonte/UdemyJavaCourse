package section20.com.smartinez.poointerfaces.imprenta.Assignment25;

abstract public class Producto implements IProducto{
    private int precio;

    public Producto(int precio){
        this.precio = precio;
    }

    @Override
    public int getPrecio(){
        return this.precio;
    }


    @Override
    public String toString() {
        return "Producto{" +
                "precio=" + precio +
                '}';
    }
}
