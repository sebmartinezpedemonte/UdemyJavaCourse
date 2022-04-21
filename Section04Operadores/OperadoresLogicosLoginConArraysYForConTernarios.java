package Section04Operadores;

import java.util.Scanner;

public class OperadoresLogicosLoginConArraysYForConTernarios {
    public static void main(String[] args) {

        /*String[] usernames = new String[3];
        String[] passwords = new String[3];
        usernames[0] = "andres";
        passwords[0] = "123";

        usernames[1] = "admin";
        passwords[1] = "1234";

        usernames[2] = "pepe";
        passwords[2] = "12345";
        */
        //aca no es necesario poner la cantidad de datos a poner en el array
        String[] usernames = {"andres", "admin", "pepe"};
        String[] passwords = {"123", "1234", "12345"};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");

        String u = scanner.next();

        System.out.println("Ingrese el password");
        String p = scanner.next();

        boolean esAutenticado = false;

        for(int i = 0; i < usernames.length; i++){
           esAutenticado = usernames[i].equals(u) && passwords[i].equals(p) ? true : esAutenticado;
            /*
            if (usernames[i].equals(u) && passwords[i].equals(p)) {
                esAutenticado = true;
                break;
            }
            */
        }


        String respuesta = esAutenticado ? "Bienvenido usuario ".concat(u).concat("!") :
                "Username o contraseña incorrecta:\nLo sentimos, requiere autenticacion";
        System.out.println(respuesta);
        /*
        if (esAutenticado) {
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        } else {
            System.out.println("Lo siento, requiere autenticacion");
        }
        */

        //El orden de los .equals no cambia el resultado
        //if(u.equals(username) && p.equals(password)){
        System.out.println("hola");
        //}

    }
}
