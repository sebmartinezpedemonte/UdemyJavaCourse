package Section04Operadores;/*
Obtener el nombre mas largo de tres personas, según los siguientes requerimientos
Mediante el teclado pedir el nombre completo (nombre + apellido) de tres miembros de
 la familia o amigos usando la clase JOptionPane y método showInputDialog().
Calcular e Imprimir el nombre de la persona que tenga el nombre más largo (en cantidad de caracteres)
 (Imprimir sólo uno de los tres, el de más caracteres en el nombre.)
Podría usar .split(" "); del objeto String para separar nombre y apellido en un arreglo,
 y con el indice cero accedemos al nombre de la persona.
Restricción no usar loops en el desarrollo de la tarea.
Ejemplo del resultado: "Guillermo Doe tiene el nombre más largo."
 */
import javax.swing.*;
public class Assignment6ObtenerElNombreMasLargoDeTresPersonas {
    public static void main(String[] args) {


        String primerNombre = JOptionPane.showInputDialog("Ingrese el nombre completo (nombre + apellido) de un familiar o amigo");
        String segundoNombre = JOptionPane.showInputDialog("Ingrese el nombre completo (nombre + apellido) de un segundo familiar o amigo");
        String tercerNombre = JOptionPane.showInputDialog("Ingrese el nombre completo (nombre + apellido) de un tercer familiar o amigo");

        String max = primerNombre.split(" ")[0].length() > segundoNombre.split(" ")[0].length() ? primerNombre : segundoNombre;
        max = max.split(" ")[0].length() > tercerNombre.split(" ")[0].length() ? max : tercerNombre;
        System.out.println(max + " tiene el nombre mas largo");





       /*
        String[] primerNombreArr = primerNombre.split(" ");
        String[] segundoNombreArr = segundoNombre.split(" ");
        String[] tercerNombreArr = tercerNombre.split(" ");


        if (primerNombreArr[0].length() > segundoNombreArr[0].length()){
            System.out.println(primerNombre + " tiene el nombre mas largo");
        }else if(segundoNombreArr[0].length() > tercerNombreArr[0].length() ){
            System.out.println(segundoNombre + " tiene el nombre mas largo");
        }else{
            System.out.println(tercerNombre + " tiene el nombre mas largo");
        }


        */
    }
}
