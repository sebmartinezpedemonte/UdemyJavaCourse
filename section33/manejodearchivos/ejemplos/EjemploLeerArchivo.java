package section33.manejodearchivos.ejemplos;

import section33.manejodearchivos.ejemplos.servicio.ArchivoServicio;
import section33.manejodearchivos.ejemplos.servicio.ArchivoServicioBufferedWriter;

public class EjemploLeerArchivo {
    public static void main(String[] args) {

        ArchivoServicioBufferedWriter servicio = new ArchivoServicioBufferedWriter();
        String nombreArchivo = "C:\\Cursos\\Java\\archivo\\java.txt";
        System.out.println(servicio.leerArchivo(nombreArchivo));
        System.out.println("-".repeat(80));
        System.out.println(servicio.leerArchivo2(nombreArchivo));
    }
}
