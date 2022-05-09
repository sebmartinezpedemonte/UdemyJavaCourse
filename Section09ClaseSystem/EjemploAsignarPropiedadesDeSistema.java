package Section09ClaseSystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class EjemploAsignarPropiedadesDeSistema {
    public static void main(String[] args) {

        try {
            FileInputStream archivo = new FileInputStream("src/config.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
