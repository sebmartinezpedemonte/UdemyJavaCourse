package section32.patronesdedisenio.decorator.decorador;

import section32.patronesdedisenio.decorator.Formateable;

public class MayusculaDecorador extends TextoDecorador{

    public MayusculaDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return this.getTexto().darFormato().toUpperCase();
    }
}
