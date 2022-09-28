package section32.patronesdedisenio.decorator2.decorador;

import section32.patronesdedisenio.decorator2.Configurable;

public abstract class CafeDecorador implements Configurable {

    private Configurable cafe;

    public CafeDecorador(Configurable cafe) {
        this.cafe = cafe;
    }

    protected Configurable getCafe(){
        return this.cafe;
    }
}
