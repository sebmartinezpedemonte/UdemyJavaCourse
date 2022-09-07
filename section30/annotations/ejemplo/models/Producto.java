package section30.annotations.ejemplo.models;

import section30.annotations.ejemplo.JsonAtributo;

import java.time.LocalDate;

public class Producto {
    @JsonAtributo(nombre = "descripcion")
    private String nombre;
    @JsonAtributo
    private Long precio;
    private LocalDate fecha;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
