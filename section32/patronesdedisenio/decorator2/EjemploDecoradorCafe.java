package section32.patronesdedisenio.decorator2;

import section32.patronesdedisenio.decorator2.decorador.ConChocolateDecorador;
import section32.patronesdedisenio.decorator2.decorador.ConCremaDecorador;
import section32.patronesdedisenio.decorator2.decorador.ConLecheDecorador;

public class EjemploDecoradorCafe {
    public static void main(String[] args) {
        Configurable cafe = new Cafe(7, "Cafe Mocha");
        ConCremaDecorador conCrema = new ConCremaDecorador(cafe);
        ConLecheDecorador conLeche = new ConLecheDecorador(conCrema);
        ConChocolateDecorador conChoco = new ConChocolateDecorador(conLeche);

        System.out.println("El precio de cafe Mocha es: "  + conChoco.getPrecioBase());
        System.out.println("Los ingredientes: " + conChoco.getIngredientes());

        Configurable capuchino = new Cafe(4, "Cafe Capuchino");
        conCrema = new ConCremaDecorador(capuchino);
        conLeche = new ConLecheDecorador(conCrema);
        System.out.println("El precio del Capuchino es: "  + conLeche.getPrecioBase());
        System.out.println("Los ingredientes: " + conLeche.getIngredientes());

        Configurable espresso = new Cafe(3, "Cafe Espresso");
        System.out.println("El precio del cafe Espresso es " + espresso.getPrecioBase());
        System.out.println("Los ingredientes del cafe Espresso es: " + espresso.getIngredientes());
    }
}
