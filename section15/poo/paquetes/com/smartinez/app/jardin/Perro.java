package section15.poo.paquetes.com.smartinez.app.jardin;

import section15.poo.paquetes.com.smartinez.app.hogar.Persona;

public class Perro {
    private String nombre;
    private String raza;


    //como es default (no public)
    // solamente se puede usar en el package jardin
    String jugar(Persona persona){
        return persona.lanzarPelota();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }



}
