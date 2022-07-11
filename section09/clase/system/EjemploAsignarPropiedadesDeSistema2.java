package section09.clase.system;

import java.io.FileInputStream;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema2 {
    public static void main(String[] args) {

        try {
            FileInputStream archivo = new FileInputStream("src/config2.properties");

            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada","Mi valor guardado en el objeto properties");
            System.setProperties(p);

            Properties ps = System.getProperties();

            System.out.println("ps.getProperty(\"mi.propiedad.personalizada\") = " + ps.getProperty("mi.propiedad.personalizada"));

            System.out.println(System.getProperty("config.puerto.servidor"));
            System.out.println(System.getProperty("config.autor.email"));

            ps.list(System.out);

        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.err.println("No existe el archivo = " + e);
            System.exit(1);
        }
        System.out.println("This code won't run");
    }
}
