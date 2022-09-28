package section32.patronesdedisenio.factory.producto;

import section32.patronesdedisenio.factory.PizzaProducto;

public class PizzaNewYorkPepperoni extends PizzaProducto {

    public PizzaNewYorkPepperoni() {
        super();    //para inicializar la lista ingredientes
        setNombre("Pizza Pepperoni New York");
        setMasa("Masa delgada a la piedra");
        setSalsa("Salsa de tomate");
        agregarIngredientes("Queso mozzarella");
        agregarIngredientes("Extra pepperoni");
        agregarIngredientes("Aceitunas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 40 min. a 90°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en triangulos");
    }
}
