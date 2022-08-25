package section24.colecciones.com.smartinez.ejemplos.assignment27;

import java.util.Date;
/*
Dada la siguiente tabla de llegadas de vuelos, se pide lo siguiente:
Una lista de objetos List del tipo Vuelo que mantenga el mismo orden de registro de la tabla.
La clase Vuelo debe contener los atributos nombre (string), origen (string), destino (string),
 fecha de llegada que incluya fecha y hora (java.util.Date) y cantidad de pasajeros.
Se pide ordenar por llagada de forma ascendente,
 obtener el ultimo vuelo en llegar y
 también se pide el vuelo que tiene menor número de pasajeros.
Como recurso se adjunta la tabla en Excel.
El resultado final debería ser, similar a:
... listado ordenado por fecha llegada ascendente ...
El último vuelo en llegar es CMP 111: Panama City, aterriza el Tue Aug 31 15:15:00 2021
El vuelo con menor número de pasajeros es AVA 241: Bogota, con 25 pasajeros.
 */
public class Vuelo {

    private String nombre;
    private String origen;
    private String destino;
    private Date fechaLlegada;
    private int numPasajeros;

    public Vuelo(String nombre, String origen, String destino, Date fechaLlegada, int numPasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.fechaLlegada = fechaLlegada;
        this.numPasajeros = numPasajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }


    @Override
    public String toString() {
        return "Vuelo{" +
                "nombre='" + nombre + '\'' +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", fechaLlegada=" + fechaLlegada +
                ", numPasajeros=" + numPasajeros +
                '}';
    }
}
