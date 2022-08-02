package section20.com.smartinez.poointerfaces.imprenta;

import jdk.swing.interop.SwingInterOpUtils;
import section20.com.smartinez.poointerfaces.imprenta.modelo.*;

import static section20.com.smartinez.poointerfaces.imprenta.modelo.Genero.PROGRAMACION;
import static section20.com.smartinez.poointerfaces.imprenta.modelo.Imprimible.*;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculo cv = new Curriculo(new Persona("John", "Doe"), "Ingeniero de Sistemas", "Resumen laboral...");
        cv.addExperiencia("Java")
                .addExperiencia("Oracle DBA")
                .addExperiencia("Spring Framework")
                .addExperiencia("Desarrollador fullstack")
                .addExperiencia("Angular");

        Libro libro = new Libro(new Persona("Erich", "Gamma"), "Patrones de diseños: Elem. Reusables POO", PROGRAMACION);

        libro.addPagina(new Pagina("Patron Singleton"))
                .addPagina(new Pagina("Patron Conservador"))
                .addPagina(new Pagina("Patron Factory"))
                .addPagina(new Pagina("Patron Composite"))
                .addPagina(new Pagina("Patron Facade"));


        Informe informe = new Informe("Estudio sobre microservicios", new Persona("Martin", "Fowler"), new Persona("James", "Gosling"));
        imprimir(cv);
        imprimir(informe);
        imprimir(libro);

        //clase anonima al vuelo
        imprimir(new Imprimible() {
            @Override
            public String imprimir() {
                return "imprimiendo un objeto generico de una clase anonima al vuelo";

            }
        });

        //o sino
        Imprimible objImp = new Imprimible() {
            @Override
            public String imprimir() {
                return "Hola que tal, imprimiendo un objeto generico de una clase anonima!";
            }
        };
        imprimir(objImp);

        System.out.println(TEXTO_DEFECTO);
    }

}
