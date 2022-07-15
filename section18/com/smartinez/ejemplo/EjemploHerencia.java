package section18.com.smartinez.ejemplo;

import section18.com.smartinez.pooherencia.Alumno;
import section18.com.smartinez.pooherencia.AlumnoInternacional;
import section18.com.smartinez.pooherencia.Persona;
import section18.com.smartinez.pooherencia.Profesor;
//o import section18.com.smartinez.pooherencia.*

public class EjemploHerencia {
    public static void main(String[] args) {

        //en los constructores se van encadenando las llamadas
        System.out.println("======== Creando la instancia de la clase Alumno =======");
        Alumno alumno = new Alumno();
        alumno.setNombre("Sebastian");
        alumno.setApellido("Martinez");
        //Persona alumno = new Alumno();
        //para poder acceder a metodos de la clase hija
        //en el caso que instanciemos al objeto con la clase padre
        //tenemos que castear la clase hija
        //((Alumno)alumno).setInstitucion("Instituto Nacional");
        alumno.setNotaCastellano(4.9);

        System.out.println("======== Creando la instancia de la clase AlumnoInternacional =======");

        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        alumnoInt.setNombre("Peter");
        alumnoInt.setApellido("Gosling");
        alumnoInt.setPais("Australia");
        alumnoInt.setEdad(15);
        alumno.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);

        System.out.println("======== Creando la instancia de la clase Profesor =======");

        Profesor profesor = new Profesor();
        profesor.setNombre("Luci");
        profesor.setApellido("Perez");
        profesor.setAsignatura("Matematicas");

        System.out.println("======== - ======== ");
        System.out.println(alumno.getNombre()
                 + " " + alumno.getApellido()
                 + " " + alumno.getInstitucion());

        System.out.println(alumnoInt.getNombre()
                + " " + alumnoInt.getApellido()
                + " " + alumnoInt.getInstitucion()
                + " " + alumnoInt.getPais());

        System.out.println("Profesor " + profesor.getAsignatura()
                + ": " + profesor.getNombre()
                + " " + profesor.getApellido());

        System.out.println("======== - ======== ");
        //recorrer toda la jerarquia de clases e imprimirla:
        Class clase = alumnoInt.getClass();
        while(clase.getSuperclass() != null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de la clase padre " + padre);
            clase = clase.getSuperclass();

        }

    }
}
