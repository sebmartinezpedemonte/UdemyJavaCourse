package section32.patronesdedisenio.factory.producto;

import section32.patronesdedisenio.factory.PizzaProducto;

public class PizzaCaliforniaPepperoni extends PizzaProducto {

    public PizzaCaliforniaPepperoni() {
        super();    //para inicializar la lista ingredientes
        setNombre("Pizza California Pepperoni");
        setMasa("Masa a la piedra gruesa");
        agregarIngredientes("Pepperoni");
        agregarIngredientes("Extra queso mozzarella");
        agregarIngredientes("Aceitunas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 50 min. a 55°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en pequeños rectangulos");
    }
}
