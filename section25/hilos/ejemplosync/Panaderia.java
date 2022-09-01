package section25.hilos.ejemplosync;

public class Panaderia {
    private String pan;
    private boolean disponible;
    //fabrica 1 pan por vez. Cuando se queda sin (disponible = false) hace otro pan
    public synchronized void hornear(String masa){
        while(disponible){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.pan = masa;
        System.out.println("Panadero hornea " + this.pan);
        this.disponible = true;
        notify();
    }
    //la keyword synchronized nos permite utilizar los metodos
    //wait y notify
    public synchronized String consumir(){
        while(!disponible){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Cliente consume: " + this.pan);
        this.disponible = false; //el pan ya no esta disponible, se lo comio
        notify();
        return pan;
    }
}
