package Section09ClaseSystem;

import java.io.IOException;

public class EjemploEjecutarProgramaSO2 {
    public static void main(String[] args) throws IOException {

        Runtime rt = Runtime.getRuntime();
        Process process;
        process = rt.exec("notepad");

    }
}
