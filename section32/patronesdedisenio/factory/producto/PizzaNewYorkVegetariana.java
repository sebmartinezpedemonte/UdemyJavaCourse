package section32.patronesdedisenio.factory.producto;

import section32.patronesdedisenio.factory.PizzaProducto;

public class PizzaNewYorkVegetariana extends PizzaProducto {

    public PizzaNewYorkVegetariana() {
        super(); //para inicializar la lista ingredientes
        setNombre("Pizza vegetariana New York");
        setMasa("Masa integral vegana");
        setSalsa("Salsa de tomate");
        agregarIngredientes("Queso vegano");
        agregarIngredientes("Tomate");
        agregarIngredientes("Aceitunas");
        agregarIngredientes("Espinacas");
        agregarIngredientes("Berenjenas");

    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 25 min. a 150°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas cuadradas");
    }
}
