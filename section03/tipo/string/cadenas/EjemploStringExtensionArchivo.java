package section03.tipo.string.cadenas;

public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        String archivo = "alguna_imagen.jpeg";
        int i = archivo.lastIndexOf(".");

        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(14) = " + archivo.substring(14));
        //mejor manera para encontrar la extension de un archivo
        System.out.println("archivo.substring((i + 1) = " + archivo.substring(i + 1));
        
    }
}
