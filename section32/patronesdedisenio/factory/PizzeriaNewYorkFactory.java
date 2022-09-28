package section32.patronesdedisenio.factory;

import section32.patronesdedisenio.factory.producto.PizzaNewYorkItaliana;
import section32.patronesdedisenio.factory.producto.PizzaNewYorkPepperoni;
import section32.patronesdedisenio.factory.producto.PizzaNewYorkVegetariana;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory{
    @Override
    public PizzaProducto crearPizza(String tipo) {
       return switch (tipo) {
            case "vegetariana" -> new PizzaNewYorkVegetariana();
            case "pepperoni" ->  new PizzaNewYorkPepperoni();
            case "italiana" ->  new PizzaNewYorkItaliana();
            default -> null;
            };
        }

    }

