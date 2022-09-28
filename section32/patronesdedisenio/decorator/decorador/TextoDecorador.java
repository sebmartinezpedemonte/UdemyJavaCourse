package section32.patronesdedisenio.decorator.decorador;

import section32.patronesdedisenio.decorator.Formateable;

public abstract class TextoDecorador implements Formateable {

    private Formateable texto;

    public TextoDecorador(Formateable texto) {
        this.texto = texto;
    }

    protected Formateable getTexto(){
        return texto;
    }
}
