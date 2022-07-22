package section19.com.smartinez.pooclasesabstractas.form.Assignment24Mamifero;

public class Lobo extends Canino{

    private int numCamada;
    private String especieLobo;

    public Lobo(String habitat, double altura, double largo, double peso, String nombreCientifico, String color, double tamanoColmillos, int numCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public int getNumCamada() {
        return numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    @Override
    public String comer() {
        return "El Lobo " + especieLobo + " caza junto a su grupo de " + numCamada + " individuos en los bosques de " + habitat;
    }

    @Override
    public String dormir() {
        return "El Lobo " + color + " duerme en las cabernas de " + habitat;
    }

    @Override
    public String correr() {
        return "El Lobo " + especieLobo + " corre en las llanuras aledañas a los bosques de " + habitat;
    }

    @Override
    public String comunicarse() {
        return "El Lobo " + especieLobo + " " + color + " aulla en luna llena";
    }

    @Override
    public String toString() {
        return "Lobo{" +
                "numCamada=" + numCamada +
                ", especieLobo='" + especieLobo + '\'' +
                ", color='" + color + '\'' +
                ", tamanoColmillos=" + tamanoColmillos +
                ", habitat='" + habitat + '\'' +
                ", altura=" + altura +
                ", largo=" + largo +
                ", peso=" + peso +
                ", nombreCientifico='" + nombreCientifico + '\'' +
                '}';
    }


}
