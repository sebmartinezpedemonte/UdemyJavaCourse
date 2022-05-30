package Section12Arrays;

import java.util.Scanner;

public class EjemploArreglosBuscarString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] a = new String[4];

        for(int i = 0; i< a.length;i++){
            System.out.print("Ingrese un  nombre: ");
            a[i] = s.next();
        }

        System.out.println("\r\nIngrese un nombre a buscar");
        String nombre = s.next();

        int i = 0;
        /*
        while(i<a.length && !a[i].equalsIgnoreCase(nombre)){
            i++;
        }
        */
        //o con un for
        for(; i < a.length && !a[i].equalsIgnoreCase(nombre) ; i++){}

        if(i == a.length){
            System.out.println("Nombre no encontrado");
        }else if(a[i].toLowerCase().compareTo(nombre.toLowerCase()) == 0){ //o else solo
            System.out.println("Nombre encontrado en la posicion : " + i);
        }
    }
}
