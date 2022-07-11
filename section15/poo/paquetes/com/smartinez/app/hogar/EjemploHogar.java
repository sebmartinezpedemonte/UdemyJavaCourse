package section15.poo.paquetes.com.smartinez.app.hogar;

import section15.poo.paquetes.com.smartinez.app.jardin.Perro;

import static section15.poo.paquetes.com.smartinez.app.hogar.Persona.saludar;

public class EjemploHogar {
    public static void main(String[] args) {
        Persona p = new Persona();

        Perro perro = new Perro();
        //no puede jugar dentro del hogar
        //ya que el metodo es default
        //perro.jugar();

        String saludo = saludar();

    }
}
