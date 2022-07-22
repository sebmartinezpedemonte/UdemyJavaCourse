package section19.com.smartinez.pooclasesabstractas.form.Assignment24Mamifero;

public class EjemploMamiferoProfesor {
    public static void main(String[] args) {


            Mamifero[] mamiferos = new Mamifero[5];

            Mamifero leon = new Leon("Sabana", 1.3, 2.4, 50, "leonis",0.4,60,20,1.8);
            Mamifero guepardo = new Guepardo("Africa", 2.5, 3.0, 90, "gupardis",0.5, 70);
            Mamifero lobo = new Lobo("Tundra", 1.0, 2.0,50, "lobis","gris",0.3, 10, "lobitus");
            Mamifero perro = new Perro("Ciudad", 0.5, 1.0, 20, "perris", "marron", 0.1, 2);
            Mamifero tigre = new Tigre("Selva", 1.5, 3.0, 90, "tigris",0.7, 90, "tigrelis");

            mamiferos[0] = leon;
            mamiferos[1] = tigre;
            mamiferos[2] = lobo;
            mamiferos[3] = perro;
            mamiferos[4] = guepardo;

            for (Mamifero animal : mamiferos) {

                System.out.println(" =============== " + animal.getClass().getSimpleName() + " =============== ");
                System.out.println("Habitat:" + animal.getHabitat());
                System.out.println("Altura:" + animal.getAltura());
                System.out.println("Largo:" + animal.getLargo());
                System.out.println("Peso:" + animal.getPeso());

                if (animal instanceof Canino) {
                    System.out.println("Clomillos:" + ((Canino) animal).getTamanoColmillos());
                    System.out.println("Color:" + ((Canino) animal).getColor());

                    if (animal instanceof Lobo) {
                        System.out.println("Especie Lobo:" + ((Lobo) animal).getEspecieLobo());
                        System.out.println("Número Integrantes:" + ((Lobo) animal).getNumCamada());
                    }
                    if (animal instanceof Perro) {
                        System.out.println("Fuerza mordida kg:" + ((Perro) animal).getFuerzaMordida());
                    }
                }

                if (animal instanceof Felino) {
                    System.out.println("Tamaño Garras:" + ((Felino) animal).getTamanoGarras());
                    System.out.println("Velocidad:" + ((Felino) animal).getVelocidad());

                    if (animal instanceof Leon) {
                        System.out.println("Potencia Rugido:" + ((Leon) animal).getPotenciaRugidoDecibel());
                        System.out.println("Número Integrantes:" + ((Leon) animal).getNumManada());
                    }
                    if (animal instanceof Tigre) {
                        System.out.println("especie Tigre:" + ((Tigre) animal).getEspecieTigre());
                    }
                }

                System.out.println(animal.comer());
                System.out.println(animal.dormir());
                System.out.println(animal.correr());
                System.out.println(animal.comunicarse());
            }
        }
    }

