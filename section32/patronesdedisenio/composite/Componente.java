package section32.patronesdedisenio.composite;

import java.util.Objects;

public abstract class Componente {

    private String nombre;

    public Componente(String nombre) {
        this.nombre = nombre;
    }

    protected String getNombre(){
        return this.nombre;
    }

    abstract public String mostrar(int nivel);

    abstract public boolean buscar(String nombre);


    //implementamos esto para que el remove busque al que se quiera eliminar por el nombre
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Componente that = (Componente) o;
        return Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
