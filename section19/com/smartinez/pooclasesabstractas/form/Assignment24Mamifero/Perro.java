package section19.com.smartinez.pooclasesabstractas.form.Assignment24Mamifero;

public class Perro extends Canino{

    private int fuerzaMordida;

    public Perro(String habitat, double altura, double largo, double peso, String nombreCientifico, String color, double tamanoColmillos, int fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    public int getFuerzaMordida() {
        return fuerzaMordida;
    }

    @Override
    public String comer() {
        return "El perro africano caza en manada con una fuerte mordida de " + fuerzaMordida + " PSI, posee fuertes mandíbulas y grandes orejas redondeadas";
    }

    @Override
    public String dormir() {
        return "El perro africano duerme en la sabana africana";
    }

    @Override
    public String correr() {
        return "El perro africano corre en las llanuras aledañas a la sabana!";
    }

    @Override
    public String comunicarse() {
        return "Los perros ladran de noche durante cacerías nocturnas";
    }

    @Override
    public String toString() {
        return "Perro{" +
                "fuerzaMordida=" + fuerzaMordida +
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
