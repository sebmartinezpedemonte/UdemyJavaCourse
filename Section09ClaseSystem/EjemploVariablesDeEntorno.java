package Section09ClaseSystem;

import java.util.Map;

public class EjemploVariablesDeEntorno {
    public static void main(String[] args) {
        Map<String, String> varEnv = System.getenv();
        System.out.println("variable de ambiente de entorno del sistema = " + varEnv);

        System.out.println("-------- Listando variables de entorno del sistema -------");
        for (String key : varEnv.keySet()) {
            System.out.println(key + " => " + varEnv.get(key));
        }

        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String tempDir = System.getenv("TEMP");
        System.out.println("tempDir = " + tempDir);

        String path = System.getenv("PATH");
        System.out.println("PATH = " + path);

        String path2 = varEnv.get("Path");
        System.out.println("path2 = " + path2);
        //creamos nuestra propia variable de entorno yendo a Edit environment variables in the task bar
        String appEnv = varEnv.get("APPLICATION_ENV");
        System.out.println("appEnv = " + appEnv);
        //or we can do it in the terminal:
        //PS C:\Users\sebmartinez\IdeaProjects\UdemyCursoMasterCompletoEnJavaDeCeroAExperto> s
        //etx SALUDAR_HOLA "Hola amigos, que tal!"

        String hola = varEnv.get("SALUDAR_HOLA");
        System.out.println("hola = " + hola);


    }
}
