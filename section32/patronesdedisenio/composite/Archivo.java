package section32.patronesdedisenio.composite;

public class Archivo extends Componente{


    public Archivo(String nombre) {
        super(nombre);
    }

    @Override
    public String mostrar(int nivel) {
        return "\t".repeat(nivel) + this.getNombre();
    }

    @Override
    public boolean buscar(String nombre) {
        return this.getNombre().equalsIgnoreCase(nombre);
    }
}
