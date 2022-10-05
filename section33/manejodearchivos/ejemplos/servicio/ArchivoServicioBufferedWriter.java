package section33.manejodearchivos.ejemplos.servicio;

import java.io.*;
import java.util.Scanner;

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

    //este nos sirve para poder usar la funcion print con todas sus
    //modalidades: println, printf, print
    public void crearArchivo2(String nombre){
        File archivo = new File(nombre);
        try (PrintWriter buffer = new PrintWriter(new FileWriter(archivo, true))) {
            buffer.println("Hola que tal amigos!");
            buffer.println("Todo bien? Yo aca escribiendo un archivo...");
            buffer.printf("Hasta luego %s!", "Lucas");
            //buffer.close();//usando este try no necesitamos usar el close
            System.out.println("El archivo se ha creado con exito");
        } catch (IOException e) {
            e.printStackTrace();
            //throw new RuntimeException(e);
        }

    }

    public String leerArchivo(String nombre){
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);
        try {
            BufferedReader reader = new BufferedReader((new FileReader(archivo)));
            String linea;
            while((linea = reader.readLine()) != null){
                sb.append(linea).append("\n");
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public String leerArchivo2(String nombre){
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);
        try (Scanner s = new Scanner(archivo)){
            s.useDelimiter("\n");
            while(s.hasNext()){
                sb.append(s.next()).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

}
