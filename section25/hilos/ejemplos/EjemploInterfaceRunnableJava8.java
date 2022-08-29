package section25.hilos.ejemplos;

import section25.hilos.ejemplos.runnable.ViajeTarea;

public class EjemploInterfaceRunnableJava8 {
    public static void main(String[] args) throws InterruptedException {


        Thread main = Thread.currentThread();
        //usando clase anonima:implementacion al vuelo de una interfaz
       /*Runnable viaje = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i + " - " + Thread.currentThread().getName());
                    try {
                        Thread.sleep((long) (Math.random() * 1000));
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("Finalmente me voy de viaje a: " + Thread.currentThread().getName());
                System.out.println(main.getState());
            }
        };
        //usamos la instancia al vuelo del Runnable viaje
        new Thread(viaje, "Isla de Pascua").start();
        new Thread(viaje,"Robinson Crusoe").start();
        new Thread(viaje,"Juan Fernandez").start();
        new Thread(viaje,"Isla de Chiloe").start();
*/


        //Tambien se puede hacer asi con expresiones lambda:
        Runnable viaje2 = () -> {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i + " - " + Thread.currentThread().getName());
                    try {
                        Thread.sleep((long) (Math.random() * 1000));
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("Finalmente me voy de viaje a: " + Thread.currentThread().getName());
            System.out.println(main.getState());

        };
        //ambas implementaciones son concurrentes
        Thread v1 = new Thread(viaje2, "Alemania");
        Thread v2 = new Thread(viaje2,"Francia");
        Thread v3 = new Thread(viaje2,"Finlandia");
        Thread v4 = new Thread(viaje2,"Belgica");

        v1.start();
        v2.start();
        v3.start();
        v4.start();
        v1.join();
        v2.join();
        v3.join();
        v4.join();

        //Join vs Sleep
        //Sleep: Pausa en el main, no en los threads. Metodo estatico: se ejecuta en el hilo en cuestion, el actual, en donde se este ejecutando y es estatico
        //Join: Espera a que finalice los demas threads. No es un metodo estatico, se ejecuta en la instancia
        //Thread.sleep(10000);
        System.out.println("Continuando con la ejecucion del metodo main: " + main.getName());

    }
}
