package section32.patronesdedisenio.factory.producto;

import section32.patronesdedisenio.factory.PizzaProducto;

public class PizzaCaliforniaQueso extends PizzaProducto {

    public PizzaCaliforniaQueso() {
        super();     //para inicializar la lista ingredientes
        setNombre("Pizza California Queso");
        setMasa("Masa a la piedra delgada");
        setSalsa("Salsa de tomate con rucula");
        agregarIngredientes("Extra queso Mozzarella");
        agregarIngredientes("Aceitunas");
        agregarIngredientes("Cebolla");
        agregarIngredientes("Queso azul");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 35 min. a 100°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en pequeños triangulos");
    }
}
