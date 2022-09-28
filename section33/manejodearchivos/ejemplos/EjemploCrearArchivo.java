package section33.manejodearchivos.ejemplos;

import section33.manejodearchivos.ejemplos.servicio.ArchivoServicio;

public class EjemploCrearArchivo {
    public static void main(String[] args) {

        String nombreArchivo = "C:\\Cursos\\Java\\archivo\\java.txt";

        ArchivoServicio service = new ArchivoServicio();
        service.crearArchivo(nombreArchivo);

    }
}
