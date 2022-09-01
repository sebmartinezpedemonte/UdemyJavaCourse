package section25.hilos.ejemploexecutor;

import java.util.concurrent.*;

public class EjemploExecutorFutureCallable2 {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

        System.out.println("Tamaño del pool: " + executor.getPoolSize());
        System.out.println("Cantidad de tareas en cola: " + executor.getQueue().size());

        Callable<String> tarea = () -> {
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
            return "Algun resultado importante de la tarea";
        };

        Callable<Integer> tarea2 = () -> {
            System.out.println("Iniciando tarea 3 ... ");
          TimeUnit.SECONDS.sleep(3);
            return 10;
        };

        Future<String> resultado = executor.submit(tarea);
        Future<String> resultado2 = executor.submit(tarea);
        Future<Integer> resultado3 = executor.submit(tarea2);

        System.out.println("Tamaño del pool: " + executor.getPoolSize());
        System.out.println("Cantidad de tareas en cola: " + executor.getQueue().size());
        executor.shutdown();
        System.out.println("Continuando con la ejecucion del metodo main");

        //System.out.println(resultado.isDone());
        while(!(resultado.isDone() && resultado2.isDone() && resultado3.isDone())){
            System.out.println(String.format("resultado1: %s - resultado2: %s - resultado3 %s",
                    resultado.isDone()? "finalizo" : "en proceso",
                    resultado2.isDone()? "finalizo" : "en proceso",
                    resultado3.isDone()? "finalizo" : "en proceso"));
            TimeUnit.MILLISECONDS.sleep(1000);
        }


        System.out.println("Obtenemos resultado1 de la tarea: " + resultado.get());
        System.out.println("Finaliza la tarea: " +  resultado.isDone());
        System.out.println("Obtenemos resultado2 de la tarea: " + resultado2.get());
        System.out.println("Finaliza la tarea: " +  resultado2.isDone());
        System.out.println("Obtenemos resultado3 de la tarea: " + resultado3.get());
        System.out.println("Finaliza la tarea: " +  resultado3.isDone());

    }
}
