package section15.poo.paquetes.com.smartinez.app.jardin;

import section15.poo.paquetes.com.smartinez.app.hogar.*;

//import static section15.poo.paquetes.com.smartinez.app.hogar.ColorPelo.CAFE;
import static section15.poo.paquetes.com.smartinez.app.hogar.ColorPelo.*;
//import static section15.poo.paquetes.com.smartinez.app.hogar.Persona.GENERO_FEMENINO;
import static section15.poo.paquetes.com.smartinez.app.hogar.Persona.saludar;
import static section15.poo.paquetes.com.smartinez.app.hogar.Persona.*;

public class EjemploPaquetes {
    public static void main(String[] args) {
        //section15.poo.paquetes.com.smartinez.app.hogar.Persona p = new section15.poo.paquetes.com.smartinez.app.hogar.Persona();
        Persona p = new Persona();
        p.setNombre("Sebastian");
        p.setApellido("Martinez");
        p.setColorPelo(CAFE);
        System.out.println(p.getNombre());

        Perro perro = new Perro();

        perro.setNombre("tobby");
        perro.setRaza("Bulldog");

        String jugando = perro.jugar(p);
        System.out.println("jugando = " + jugando);

        String saludo = saludar();
        System.out.println("saludo = " + saludo);

        //import static : importar atributos, metodos y constantes static
        String generoMujer = GENERO_FEMENINO;
        String generoHombre = GENERO_MASCULINO;

    }
}
