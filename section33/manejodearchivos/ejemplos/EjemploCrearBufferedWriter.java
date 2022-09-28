package section33.manejodearchivos.ejemplos;

import section33.manejodearchivos.ejemplos.servicio.ArchivoServicio;
import section33.manejodearchivos.ejemplos.servicio.ArchivoServicioBufferedWriter;

public class EjemploCrearBufferedWriter {
    public static void main(String[] args) {

        String nombreArchivo = "C:\\Cursos\\Java\\archivo\\java.txt";

        ArchivoServicioBufferedWriter service = new ArchivoServicioBufferedWriter();
        service.crearArchivo(nombreArchivo);

    }
}
