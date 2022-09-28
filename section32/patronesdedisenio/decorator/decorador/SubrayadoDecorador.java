package section32.patronesdedisenio.decorator.decorador;

import section32.patronesdedisenio.decorator.Formateable;

public class SubrayadoDecorador extends TextoDecorador{
    public SubrayadoDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        int largo = getTexto().darFormato().length();
        StringBuilder sb = new StringBuilder(getTexto().darFormato());
        sb.append("\n");
        for(int i = 0; i < largo ; i++){
            sb.append("_");
        }
        return sb.toString();
    }
}
