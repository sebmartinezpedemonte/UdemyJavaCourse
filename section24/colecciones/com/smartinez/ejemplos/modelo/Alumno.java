package section24.colecciones.com.smartinez.ejemplos.modelo;

import java.util.Objects;

public class Alumno implements Comparable<Alumno> {
    private String nombre;
    private Integer nota;

    public Alumno() {
    }

    public Alumno(String nombre, Integer nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return nombre + ", nota= " + nota;
    }

    //ordenar por nombre
    //tambien detecta un valor compartido mediante el compareTo
    //y bajo que atributo compara: nombre o nota
    //regla de unicidad ahora es mediante la nota
    //los elementos con la misma nota no se repiten
    @Override
    public int compareTo(Alumno a) {
        //ordenando por nombre
        /* if (this.nombre == null){
            return 0;
        }
        return this.nombre.compareTo(a.nombre);

        //ordenando por nota en int
        if(this.nota == a.nota) {
            return 0;
        } else if (this.nota > a.nota) {
            return 1;
            //cuando la nota es mayor a la otra es 1
        } else {
            return -1;
            //if(this.nota < a.nota)
            //cuando la nota es menor a la otra es -1
        }

         */
        //ordenando por nota en Integer en vez de int
        if(this.nota == null){
            return 0;
        }
        return this.nota.compareTo(a.nota);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(nombre, alumno.nombre) &&
                Objects.equals(nota, alumno.nota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, nota);
    }
}
