package section32.patronesdedisenio.factory.ejemplo;

import section32.patronesdedisenio.factory.PizzaProducto;
import section32.patronesdedisenio.factory.PizzeriaCaliforniaFactory;
import section32.patronesdedisenio.factory.PizzeriaNewYorkFactory;
import section32.patronesdedisenio.factory.PizzeriaZonaAbstractFactory;

public class EjemploFactory {
    public static void main(String[] args) {
        PizzeriaZonaAbstractFactory ny = new PizzeriaNewYorkFactory();
        PizzeriaZonaAbstractFactory california = new PizzeriaCaliforniaFactory();

        PizzaProducto pizza = california.ordenarPizza("queso");
        System.out.println("Bruce ordena la pizza " + pizza.getNombre());

        pizza = ny.ordenarPizza("pepperoni");
        System.out.println("Andres ordena una " + pizza.getNombre());

        pizza = california.ordenarPizza("vegetariana");
        System.out.println("James ordena una " + pizza.getNombre());

        pizza = ny.ordenarPizza("vegetariana");
        System.out.println("Linus ordena la pizza " + pizza.getNombre());

        pizza = california.ordenarPizza("pepperoni");
        System.out.println("John ordena una pizza " + pizza.getNombre());

        System.out.println("pizza = " + pizza); //para ver to do el detalle del toString de la pizza pepperoni de california
    }
}
