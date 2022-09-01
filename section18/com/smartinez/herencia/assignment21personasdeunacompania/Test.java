package section18.com.smartinez.herencia.assignment21personasdeunacompania;

public class Test {
    public static void main(String[] args) {


        Gerente gerente1 = new Gerente("Carlos", "Perez", "123456", "Charcas 1111", 300000.0, 341, 5000000.00);
        System.out.println(gerente1);
        gerente1.aumentarRemuneracion(10);
        gerente1.setPresupuesto(1000000.00);
        System.out.println(gerente1);
    }
}
