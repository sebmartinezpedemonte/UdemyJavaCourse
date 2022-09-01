package section25.hilos.ejemploexecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class EjemploExecutor {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Runnable tarea = () -> {
            System.out.println("Inicio de la tarea...");

            try {
                System.out.println("Nombre del thread " + Thread.currentThread().getName());
                //alternativa al Thread.sleep()
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
            System.out.println("Finaliza la tarea...");
        };
        executor.submit(tarea);
        //cierra de forma abrupta el executor y todas las tareas que se estan ejecutando o que estan pendientes quedan interrumpidas, a medio camino. Podria ser un problema. Podria quedar ambiguo la ejecucion de estos procesos, inconsistente con la informacion y los datos que esta procesando
        //executor.shutdownNow();
        //este es mejor ya que apaga una vez que finaliza la ejecucion de todas las tareas que se estan ejecutando en este momento pero tambien las que estan en colas, espera hasta que tambien se ejecuten y luego realiza el shutdown
        executor.shutdown();
        System.out.println("Continuando con la ejecucion del metodo main 1");
        //este espera a que finalicen todas las tareas y luego que se detenga el executor para continuar con la ejecucion del metodo main o del hilo principal
        executor.awaitTermination(2, TimeUnit.SECONDS);
        //o finaliza todas las tareas sin problema y se cierra el executor o bien que ocurra el timeout
        System.out.println("Continuando con la ejecucion del metodo main 2");
    }
}
