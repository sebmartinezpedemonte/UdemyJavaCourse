package section25.hilos.ejemplotimer;

import java.awt.*;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class EjemploAgendarTareaTimerPeriodo {
    public static void main(String[] args) {
        //para hacer el famoso beep
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        //usando AtomicInteger
        AtomicInteger contadorAtomic = new AtomicInteger(3);

        Timer timer = new Timer();
        //implementar al vuelo
        timer.schedule(new TimerTask(){

            @Override
            public void run() {
                int i = contadorAtomic.getAndDecrement();
                if(i > 0) {
                    toolkit.beep();
                    System.out.println("Tarea " + i + " periodica en: " + new Date() + " nombre del Thread: "
                            + Thread.currentThread().getName());

                }else{
                    System.out.println("Finaliza el tiempo");
                    timer.cancel();
                }

            }
        }, 0, 10000);
        //si queremos que empiece inmediatamente ponemos el delay en 0
        System.out.println("Agendamos una tarea inmediatea que se repite cada 10 segundos");
    }
}
