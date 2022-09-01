package section25.hilos.ejemploexecutor;

import java.util.concurrent.*;

public class EjemploExecutorFuture {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Runnable tarea = () -> {
            System.out.println("Inicio de la tarea...");

            try {
                System.out.println("Nombre del thread " + Thread.currentThread().getName());
                //alternativa al Thread.sleep()
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
            System.out.println("Finaliza la tarea...");
        };
        Future<?> resultado = executor.submit(tarea);
        //.shutdown() apaga una vez que finaliza la ejecucion de todas las tareas que se estan ejecutando en este momento pero tambien las que estan en colas, espera hasta que tambien se ejecuten y luego realiza el shutdown
        executor.shutdown();
        System.out.println("Continuando con la ejecucion del metodo main");

        //System.out.println(resultado.isDone());
        while(!resultado.isDone()){
            System.out.println("ejecutando tarea ....");
            TimeUnit.MILLISECONDS.sleep(1500);
        }


        System.out.println("Obtenemos resultado de la tarea: " + resultado.get(2, TimeUnit.SECONDS));
        System.out.println("Finaliza la tarea: " +  resultado.isDone());
    }
}
