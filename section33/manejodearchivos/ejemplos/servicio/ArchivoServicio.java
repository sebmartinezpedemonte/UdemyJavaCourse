package section33.manejodearchivos.ejemplos.servicio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//io:input output
public class ArchivoServicio {

    public void crearArchivo(String nombre){
        File archivo = new File(nombre);
        try {
            //por argumento se recibe el archivo de tipo File
            FileWriter escritor = new FileWriter(archivo, true);
            //para escribir en el txt usamos append o write
            escritor.append("Hola que tal amigos!\n")
                    .append("Todo bien? Yo aca escribiendo un archivo...\n")
                    .append("Hasta luego Lucas!\n");
            escritor.close();//es importante cerrarlo, como el Scanner
            System.out.println("El archivo se ha creado con exito");
        } catch (IOException e) {
            e.printStackTrace();
            //throw new RuntimeException(e);
        }

    }
}
