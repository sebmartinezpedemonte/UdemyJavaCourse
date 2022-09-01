package section25.hilos.ejemplosync;

import section25.hilos.ejemplosync.runnable.Consumidor;
import section25.hilos.ejemplosync.runnable.Panadero;

import java.util.concurrent.ThreadLocalRandom;

public class EjemploProductorConsumidorJava8Lambda {
    public static void main(String[] args) {

        Panaderia p = new Panaderia();

        new Thread( () -> {
            for (int i = 0; i < 10; i++) {
                p.hornear("Pan n°: " + i);
                try {
                    Thread.sleep(ThreadLocalRandom.current().nextInt(500, 2000));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
        new Thread(() -> {
            for(int i = 0; i < 10; i++){
                p.consumir();
            }
        }).start();

    }
}
