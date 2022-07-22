package section19.com.smartinez.pooclasesabstractas.form.Assignment24Mamifero;

import java.util.ArrayList;
import java.util.List;

public class EjemploMamiferos {
    public static void main(String[] args) {
        List<Mamifero> mamiferos = new ArrayList<>();


        Mamifero leon = new Leon("Sabana", 1.3, 2.4, 50, "leonis",0.4,60,20,1.8);
        Mamifero guepardo = new Guepardo("Africa", 2.5, 3.0, 90, "gupardis",0.5, 70);
        Mamifero lobo = new Lobo("Tundra", 1.0, 2.0,50, "lobis","gris",0.3, 10, "lobitus");
        Mamifero perro = new Perro("Ciudad", 0.5, 1.0, 20, "perris", "marron", 0.1, 2);
        Mamifero tigre = new Tigre("Selva", 1.5, 3.0, 90, "tigris",0.7, 90, "tigrelis");

        mamiferos.add(leon);
        mamiferos.add(guepardo);
        mamiferos.add(lobo);
        mamiferos.add(perro);
        mamiferos.add(tigre);

        for(Mamifero m : mamiferos){
            System.out.println(m.toString());
            System.out.println(m.comer());
            System.out.println(m.dormir());
            System.out.println(m.correr());
            System.out.println(m.comunicarse());
        }





    }
}
