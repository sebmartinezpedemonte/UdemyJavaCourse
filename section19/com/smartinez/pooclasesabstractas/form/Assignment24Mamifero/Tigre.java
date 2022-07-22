package section19.com.smartinez.pooclasesabstractas.form.Assignment24Mamifero;

public class Tigre extends Felino{

    private String especieTigre;

    public Tigre(String habitat, double altura, double largo, double peso, String nombreCientifico, double tamanoGarras, int velocidad, String especie) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() {
        return especieTigre;
    }

    @Override
    public String comer() {
        return"El Tigre " + especieTigre + " caza solitario en los manglares y bosques monzónicos de " + habitat;
    }

    @Override
    public String dormir() {
        return "El Tigre " + especieTigre + " duerme en la selvas de " + habitat;
    }

    @Override
    public String correr() {
        return "El Tigre " + especieTigre + " corre a " + velocidad + " km/hr";
    }

    @Override
    public String comunicarse() {
        return "El tigre ruge y agacha sus orejas";
    }

    @Override
    public String toString() {
        return "Tigre{" +
                "especieTigre='" + especieTigre + '\'' +
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
