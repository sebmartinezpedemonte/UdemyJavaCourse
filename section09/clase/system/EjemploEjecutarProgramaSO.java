package section09.clase.system;

import java.io.IOException;

public class EjemploEjecutarProgramaSO {
    public static void main(String[] args) {

        Runtime rt = Runtime.getRuntime();
        Process process;

        try {
            if (System.getProperty("os.name").startsWith("Windows")) {
                process = rt.exec("notepad");
            }else if (System.getProperty("os.name").startsWith("Mac")) {
                process = rt.exec("textedit");
            } else if (System.getProperty("os.name").toLowerCase().contains("nux") ||
                    System.getProperty("os.name").toLowerCase().contains("nix")) {
                process = rt.exec("gedit");
            }
            else {
                process = rt.exec("gedit");
            }
            process.waitFor();//the process will be in pause until the application is closed.

        }catch(Exception e){
            System.err.println("The command is unknown :" + e.getMessage());
            System.exit(1);
        }
        System.out.println("Se ha cerrado el editor");
        System.exit(0); //optional

    }
}
