package section33.manejodearchivos.ejemplos.servicio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//io:input output
public class ArchivoServicioBufferedWriter {

    public void crearArchivo(String nombre){
        File archivo = new File(nombre);
        try (BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo, true))) {
           buffer.append("Hola que tal amigos!\n")
                    .append("Todo bien? Yo aca escribiendo un archivo...\n")
                    .append("Hasta luego Lucas!\n");
            //buffer.close();//usando este try no necesitamos usar el close
            System.out.println("El archivo se ha creado con exito");
        } catch (IOException e) {
            e.printStackTrace();
            //throw new RuntimeException(e);
        }

    }
}
