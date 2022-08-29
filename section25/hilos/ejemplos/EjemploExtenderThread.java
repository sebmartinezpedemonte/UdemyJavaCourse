package section25.hilos.ejemplos;

import section25.hilos.ejemplos.threads.NombreThread;

public class EjemploExtenderThread {
    public static void main(String[] args) throws InterruptedException {
        //Procesos paralelos. Concurrentes. Corren al mismo tiempo
        Thread hilo = new NombreThread("John Doe");
        hilo.start();
        //Thread.sleep(100);
        Thread hilo2 = new NombreThread("Maria");
        hilo2.start();

        NombreThread hilo3 = new NombreThread("Pepe");
        hilo3.start();
        System.out.println(hilo.getState());
    }
}

