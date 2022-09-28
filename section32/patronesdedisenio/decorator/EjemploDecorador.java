package section32.patronesdedisenio.decorator;

import section32.patronesdedisenio.decorator.decorador.MayusculaDecorador;
import section32.patronesdedisenio.decorator.decorador.ReemplazarEspaciosDecorador;
import section32.patronesdedisenio.decorator.decorador.ReversaDecorador;
import section32.patronesdedisenio.decorator.decorador.SubrayadoDecorador;

public class EjemploDecorador {
    public static void main(String[] args) {
        Formateable texto = new Texto("Hola que tal Andres!");

        MayusculaDecorador mayuscula = new MayusculaDecorador(texto);
        ReversaDecorador reversa = new ReversaDecorador(mayuscula);
        SubrayadoDecorador subrayar = new SubrayadoDecorador(reversa);
        ReemplazarEspaciosDecorador reemplazar = new ReemplazarEspaciosDecorador(subrayar);
        //Esta recursividad es la que aprovechamos del decorator pattern
        //Solo usando herencia hubiesemos tenido que hacer 16 clases y aca solo tenemos 4 decoradores mas el padre
        System.out.println(reemplazar.darFormato());
    }
}
