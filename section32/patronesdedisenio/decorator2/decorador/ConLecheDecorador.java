package section32.patronesdedisenio.decorator2.decorador;

import section32.patronesdedisenio.decorator2.Configurable;

public class ConLecheDecorador extends CafeDecorador{
    public ConLecheDecorador(Configurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecioBase() {
        return getCafe().getPrecioBase() + 3.7f;
    }

    @Override
    public String getIngredientes() {
        return getCafe().getIngredientes() + ", Leche";
    }
}
