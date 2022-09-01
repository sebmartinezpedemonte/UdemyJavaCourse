package section18.com.smartinez.herencia.ejemplo;

import section18.com.smartinez.herencia.pooherencia.Alumno;
import section18.com.smartinez.herencia.pooherencia.AlumnoInternacional;
import section18.com.smartinez.herencia.pooherencia.Persona;
import section18.com.smartinez.herencia.pooherencia.Profesor;
//o import section18.com.smartinez.pooherencia.*

public class EjemploHerenciaToString {
    public static void main(String[] args) {

        //en los constructores se van encadenando las llamadas
        System.out.println("======== Creando la instancia de la clase Alumno =======");
        //polimorfismo: diferentes formas de implementar un mismo tipo de clase
        Alumno alumno = new Alumno("Sebastian", "Andres", 13, "Instituto Nacional");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);
        alumno.setEmail("sebastian@correo.com");

        System.out.println("======== Creando la instancia de la clase AlumnoInternacional =======");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter", "Gosling" , "Australia");

        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);
        alumnoInt.setEmail("peter@correo.com");

        System.out.println("======== Creando la instancia de la clase Profesor =======");
        Profesor profesor = new Profesor("Luci", "Perez","Matematicas" );
        profesor.setEdad(37);
        profesor.setEmail("profesor.luci@colegio.com");



        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);


    }

    public static void imprimir(Persona persona){
        System.out.println("======== - ======== ");
        System.out.println(persona);
    }

}
