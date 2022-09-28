package section32.patronesdedisenio.factory.producto;

import section32.patronesdedisenio.factory.PizzaProducto;

public class PizzaCaliforniaVegetariana extends PizzaProducto {

    public PizzaCaliforniaVegetariana() {
        super();     //para inicializar la lista ingredientes
        setNombre("Pizza California Vegetariana");
        setMasa("Masa delgada light");
        setSalsa("Salsa BBQ Light");
        agregarIngredientes("Queso Mozzarella");
        agregarIngredientes("Aceitunas");
        agregarIngredientes("Espinacas");
        agregarIngredientes("Cebolla");
        agregarIngredientes("Berenjena");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 20 min. a 180°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas rectangulares");
    }
}
