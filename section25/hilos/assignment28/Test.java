package section25.hilos.assignment28;

public class Test {
    public static void main(String[] args) {


        new Thread(new AlfanumericoTarea(Tipo.LETRA)).start();
        Thread hilo1 = new Thread(new AlfanumericoTarea(Tipo.NUMERO));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        hilo1.start();

    }
}
