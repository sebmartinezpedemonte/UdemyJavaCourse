package section18.com.smartinez.ejemplo;

import section18.com.smartinez.pooherencia.Alumno;
import section18.com.smartinez.pooherencia.AlumnoInternacional;
import section18.com.smartinez.pooherencia.Persona;
import section18.com.smartinez.pooherencia.Profesor;
//o import section18.com.smartinez.pooherencia.*

public class EjemploHerenciaConstructores {
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

        System.out.println("======== - ======== ");

        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);


    }

    public static void imprimir(Persona persona){
        System.out.println("Imprimiendo datos en comun del tipo Persona: ");
        System.out.println(persona.getNombre()
                + ", apellido: " + persona.getApellido()
                + ", edad: " + persona.getEdad()
                + ", email: " + persona.getEmail());

        if(persona instanceof Alumno){//si persona es de tipo Alumno
            System.out.println("Imprimiendo los datos del tipo Alumno");
            System.out.println("Institucion: " + ((Alumno) persona).getInstitucion());
            System.out.println("Nota Matematicas: " + ((Alumno) persona).getNotaMatematica());
            System.out.println("Nota Historia: " + ((Alumno) persona).getNotaHistoria());
            System.out.println("Nota Castellano: " + ((Alumno) persona).getNotaCastellano());
            //if anidado porque AlumnoInternacional es clase hija de Alumno
            if(persona instanceof AlumnoInternacional){//si persona es de tipo AlumnoInternacional
                System.out.println("Imprimiendo los datos del tipo AlumnoInternacional");
                System.out.println("Nota idiomas: " + ((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("Pais: " + ((AlumnoInternacional) persona).getPais());

            }
            System.out.println("============sobre escritura promedio=============");
            System.out.println("Promedio " + ((Alumno) persona).calcularPromedio());
            System.out.println("============sobre escritura promedio=============");

        }

        if(persona instanceof Profesor){
            System.out.println("Imprimiendo los datos del tipo Profesor");
            System.out.println("Asignatura " + ((Profesor) persona).getAsignatura());
        }
        System.out.println("============sobre escritura saludar=============");
        System.out.println(persona.saludar());
        System.out.println("=========================");
    }

}
