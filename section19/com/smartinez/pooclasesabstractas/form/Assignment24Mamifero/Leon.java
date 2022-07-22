package section19.com.smartinez.pooclasesabstractas.form.Assignment24Mamifero;

public class Leon extends Felino{

    private int numManada;
    private double potenciaRugidoDecibel;

    public Leon(String habitat, double altura, double largo, double peso, String nombreCientifico, double tamanoGarras, int velocidad, int numManada, double potenciaRugidoDecibel) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public int getNumManada() {
        return numManada;
    }

    public double getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
    }

    @Override
    public String comer() {
        return "El León caza junto a su grupo de " + numManada + " individuos en las llanuras africanas";
    }

    @Override
    public String dormir() {
        return "El Leon duerme en las estepas africanas";
    }

    @Override
    public String correr() {
        return "El Leon corre a " + velocidad + " km/hr";
    }

    @Override
    public String comunicarse() {
        return "El Leon ruge fuerte a " + potenciaRugidoDecibel + " decibeles";
    }

    @Override
    public String toString() {
        return "Leon{" +
                "numManada=" + numManada +
                ", potenciaRugidoDecibel=" + potenciaRugidoDecibel +
                ", tamanoGarras=" + tamanoGarras +
                ", velocidad=" + velocidad +
                ", habitat='" + habitat + '\'' +
                ", altura=" + altura +
                ", largo=" + largo +
                ", peso=" + peso +
                ", nombreCientifico='" + nombreCientifico + '\'' +
                '}';
    }
}
