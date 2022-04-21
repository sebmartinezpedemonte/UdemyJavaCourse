package Section03TipoStringCadenas;/*
La tarea consiste en crear una clase llamada ProgramaManejoDeNombres de la siguiente manera:
Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o amigos como
argumentos de línea de comandos.
Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter, pero
convertido en mayúscula y se le concatena un punto y los dos últimos caracteres de la persona. Por ejemplo
para Andres debe quedar como N.es
Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable).
Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe podría ser: N.es_A.ia_E.pe
 */
import java.util.Scanner;
public class Assignment3NombresDeFamiliares {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el nombre de un familiar o amigo");
        String integrante1 = input.nextLine();
        System.out.println("Ingrese el nombre de otro familiar o amigo");
        String integrante2 = input.nextLine();
        System.out.println("Ingrese el nombre de otro familiar o amigo");
        String integrante3 = input.nextLine();

        int largo1 = integrante1.length();
        int largo2 = integrante2.length();
        int largo3 = integrante3.length();
        if (integrante1.length() > 2 && integrante2.length() > 2 && integrante3.length() > 2) {
            System.out.println(integrante1.substring(1, 2).toUpperCase() + "." + integrante1.substring(largo1 - 2) + "_" +
                    integrante2.substring(1, 2).toUpperCase() + "." + integrante2.substring(largo2 - 2) + "_" +
                    integrante3.substring(1, 2).toUpperCase() + "." + integrante3.substring(largo3 - 2));
        } else{
            System.out.println("Nombre no valido");
        }
        input.close();
    }
}

/*
public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un nombre de un familiar:");
        String nombreA = scanner.nextLine();
        String nombreA2 = nombreA.toUpperCase().charAt(1) + "." + nombreA.substring(nombreA.length()-2);

        System.out.println("Ingrese otro nombre de un familiar:");
        String nombreB = scanner.nextLine();
        String nombreB2 = nombreB.toUpperCase().charAt(1) + "." + nombreB.substring(nombreB.length()-2);

        System.out.println("Ingrese otro nombre de un familiar:");
        String nombreC = scanner.nextLine();
        String nombreC2 = nombreC.toUpperCase().charAt(1) + "." + nombreC.substring(nombreC.length()-2);

        String resultado = nombreA2 + "_" + nombreB2 + "_" + nombreC2;

        System.out.println(resultado);
    }
}

 */