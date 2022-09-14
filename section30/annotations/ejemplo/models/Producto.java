package section30.annotations.ejemplo.models;

import section30.annotations.ejemplo.JsonAtributo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Producto {
    //atributos que se van a exportar o a convertir en este Json les ponemos @JSonAtributo por encima
    @JsonAtributo(capitalizar = true) //sino queda el nombre del atributo de la clase(en este caso nombre) nombre = "descripcion"
    private String nombre;
    @JsonAtributo (nombre = "costo")
    private Long precio;
    private LocalDate fecha;


    private void init(){ //init de inicializar
        this.nombre = Arrays.stream(nombre.split(" "))
                .map(palabra -> palabra.substring(0, 1).toUpperCase()
                        + palabra.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));
    }

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
