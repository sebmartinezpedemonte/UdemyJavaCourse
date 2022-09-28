package section32.patronesdedisenio.decorator.decorador;

import section32.patronesdedisenio.decorator.Formateable;

public class ReversaDecorador extends TextoDecorador{


    public ReversaDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        StringBuilder sb = new StringBuilder((getTexto().darFormato()));
        return sb.reverse().toString();
    }
}
