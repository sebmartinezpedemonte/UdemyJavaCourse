package section32.patronesdedisenio.decorator2.decorador;

import section32.patronesdedisenio.decorator2.Configurable;

public class ConCremaDecorador extends CafeDecorador{
    public ConCremaDecorador(Configurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecioBase() {
        return getCafe().getPrecioBase() + 2.5f;
    }

    @Override
    public String getIngredientes() {
        return getCafe().getIngredientes() + ", Crema";
    }
}
