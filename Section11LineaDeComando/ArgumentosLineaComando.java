package Section11LineaDeComando;

public class ArgumentosLineaComando {
    public static void main(String[] args) {

        for(int i = 0; i <args.length; i++){
            System.out.println("Argumentos n° " + i + ": " + args[i]);
        }
    }
}
