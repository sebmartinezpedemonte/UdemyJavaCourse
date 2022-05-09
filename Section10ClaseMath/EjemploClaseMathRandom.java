package Section10ClaseMath;

import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {

        String[] colores = {"azul", "amarillo", "rojo", "verde", "blanco", "negro"};
        double random = Math.random();
        System.out.println("random = " + random);
        //will go from 0 to 6 (not included)
        random *= colores.length;

        System.out.println("random = " + random);

        random = Math.floor(random);
        System.out.println("random = " + random);

        System.out.println("colores = " + colores[(int) random]);

        /*
        do {
            random = Math.random();
            random *= 100;
            random = Math.round(random);
            System.out.println("random = " + random);

        } while (random != 0);
        */

        Random randomObj = new Random();
        int randomInt = randomObj.nextInt();
        //returns a number between 2^32 and 2^-32
        System.out.println("randomInt = " + randomInt);
        //randomInt =min + randomObj.nextInt((max - min) +1 );
        //between 15 and 25 included

        randomInt = 15 + randomObj.nextInt((25 - 15) + 1);
        System.out.println("randomInt = " + randomInt);

        randomInt = randomObj.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colores = " + colores[randomInt]);
    }
}
