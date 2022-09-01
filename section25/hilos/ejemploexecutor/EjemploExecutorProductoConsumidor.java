package section25.hilos.ejemploexecutor;

import section25.hilos.ejemplosync.Panaderia;
import section25.hilos.ejemplosync.runnable.Consumidor;
import section25.hilos.ejemplosync.runnable.Panadero;

import java.util.concurrent.*;

public class EjemploExecutorProductoConsumidor {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        //en este caso del panadero y consumidor el pool minimo debe ser de 2
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

        System.out.println("Tamaño del pool: " + executor.getPoolSize());
        System.out.println("Cantidad de tareas en cola: " + executor.getQueue().size());

        Panaderia p = new Panaderia();
        Runnable productor = new Panadero(p);
        Runnable consumidor = new Consumidor(p);

        Future<?> futuro1 = executor.submit(productor);
        Future<?> futuro2 = executor.submit(consumidor);

        System.out.println("Tamaño del pool: " + executor.getPoolSize());
        System.out.println("Cantidad de tareas en cola: " + executor.getQueue().size());

        executor.shutdown();
        System.out.println("Continuando con la ejecucion del metodo main");

    }
}
