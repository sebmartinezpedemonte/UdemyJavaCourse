package section32.patronesdedisenio.decorator2.decorador;

import section32.patronesdedisenio.decorator2.Configurable;

public class ConChocolateDecorador extends CafeDecorador{


    public ConChocolateDecorador(Configurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecioBase() {
        return getCafe().getPrecioBase() + 5f;
    }

    @Override
    public String getIngredientes() {
        return getCafe().getIngredientes() + ", Chocolate";
    }
}
