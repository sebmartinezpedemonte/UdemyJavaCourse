package section32.patronesdedisenio.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class PizzaProducto {

    private String nombre;
    private String masa;
    private String salsa;
    private List<String> ingredientes;

    public PizzaProducto() {
        ingredientes = new ArrayList<>();
    }

    public void preparar(){
        System.out.println("Preparando " + nombre);
        System.out.println("Seleccionando la masa " + masa);
        System.out.println("Agregando salsa " + salsa);
        System.out.println("Agregando ingredientes: ");
        this.ingredientes.forEach(System.out::println);
    }

    public abstract void cocinar();

    public abstract void cortar();

    public void empaquetar(){
        System.out.println("Poniendo la pizza en una caja de empaque...");
    }

    @Override
    public String toString() {
        return "PizzaProducto{" +
                "nombre='" + nombre + '\'' +
                ", masa='" + masa + '\'' +
                ", salsa='" + salsa + '\'' +
                ", ingredientes=" + ingredientes +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected void setMasa(String masa) {
        this.masa = masa;
    }

    protected void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    protected void agregarIngredientes(String ingrediente){
        ingredientes.add(ingrediente);
    }
}
