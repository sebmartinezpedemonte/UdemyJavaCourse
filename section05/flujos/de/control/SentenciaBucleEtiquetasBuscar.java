package section05.flujos.de.control;

public class SentenciaBucleEtiquetasBuscar {
    public static void main(String[] args) {

        String frase = "tres tristes tigres tragan trigo en un trigal ";
        String palabra = "trigo";
        System.out.println("frase = " + frase);

        int maxPalabra = palabra.length();
        int maxFrase = frase.length() - maxPalabra;

        int cantidad = 0;
        char letra = 't';
        buscar:
        for (int i = 0; i <= maxFrase; i++) {
            int k = i;
            for (int j = 0; j < maxPalabra; j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    continue buscar;
                }
            }
            cantidad++;
        }

        System.out.println("Encontrado = " + cantidad + " veces la palabra " + palabra + " en la frase");

        int cont = 0;
        for(int l = 0; l < maxFrase; l++){
            if(frase.charAt(l) != letra){
                continue;
            }
            cont++;
        }

        System.out.println("Encontrado = " + cont + " veces la letra " + letra + " en la frase");

        int contadorBis = 0;
        char letraBis = 'g';

        for(int n = 0; n < maxFrase; n++){
            if(frase.charAt(n) == letraBis){
                contadorBis++;
            }
        }

        System.out.println("Encontrado = " + contadorBis + " veces la letra " + letraBis + " en la frase");


       // for(int o = 0;)






    }
}
