package Section07ValorVsReferencia;

public class PasarPorValor {
    public static void main(String[] args) {
        //como es por valor, no cambia
        //los int, Integer, double, Double, String, etc. son inmutables, no cambian por referencia
        int i = 10;

        System.out.println("Iniciamos el metodo main con i  = " + i);
        test(i);
        System.out.println("Finaliza el metodo main con el valor de i (se mantiene igual) = " + i);
    }

    public static void test(int i){
        System.out.println("Iniciamos el metodo test con i = " + i);
        i = 35;
        System.out.println("Finaliza el metodo test con i = " + i);
    }

}
