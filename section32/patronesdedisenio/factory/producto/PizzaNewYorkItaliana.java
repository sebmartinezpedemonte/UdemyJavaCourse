package section32.patronesdedisenio.factory.producto;

import section32.patronesdedisenio.factory.PizzaProducto;

public class PizzaNewYorkItaliana extends PizzaProducto {

    public PizzaNewYorkItaliana() {
        super();     //para inicializar la lista ingredientes
        setNombre("Pizza Italiana New York");
        setMasa("Masa gruesa");
        setSalsa("Salsa de tomate italiana con carne");
        agregarIngredientes("Queso mozzarella");
        agregarIngredientes("Aceitunas");
        agregarIngredientes("Jamon");
        agregarIngredientes("Choricillo");
        agregarIngredientes("Champiñones");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 30 min. a 120°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en triangulos grandes");
    }
}
