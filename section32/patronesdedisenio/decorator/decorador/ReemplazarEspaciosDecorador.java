package section32.patronesdedisenio.decorator.decorador;

import section32.patronesdedisenio.decorator.Formateable;

public class ReemplazarEspaciosDecorador extends TextoDecorador{
    public ReemplazarEspaciosDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return getTexto().darFormato().replace(" ", "_");
    }
}
