package section18.com.smartinez.herencia.assignment22almacenyverduleria;

public class Lacteo extends Producto{
    private int cantidad;
    private int proteinas;

    public Lacteo(String nombre, Double precio, int cantidad, int proteinas) {
        super(nombre, precio);
        this.cantidad = cantidad;
        this.proteinas = proteinas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getProteinas() {
        return proteinas;
    }

    @Override
    public String toString() {
        return super.toString() + "Lacteo{" +
                "cantidad=" + cantidad +
                ", proteinas=" + proteinas +
                '}';
    }
}