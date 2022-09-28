package section32.patronesdedisenio.factory;

import section32.patronesdedisenio.factory.producto.PizzaCaliforniaPepperoni;
import section32.patronesdedisenio.factory.producto.PizzaCaliforniaQueso;
import section32.patronesdedisenio.factory.producto.PizzaCaliforniaVegetariana;

public class PizzeriaCaliforniaFactory extends PizzeriaZonaAbstractFactory{


    @Override
    public PizzaProducto crearPizza(String tipo) {
        return switch(tipo) {
            case "pepperoni" -> new PizzaCaliforniaPepperoni();
            case "vegetariana" -> new PizzaCaliforniaVegetariana();
            case "queso" -> new PizzaCaliforniaQueso();
            default -> null;
        };

    }
}
