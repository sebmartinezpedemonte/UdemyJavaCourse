package Section13MatricesArreglosBidimensionales;

public class EjemploMatricesIdentidad {
    public static void main(String[] args) {
        //tambien conocidas como matrices unitarias (en algebra lineal)

        int[][] matriz = new int[5][5];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(i == j){ //si i == j es porque justo estamos en la diagonal (0,0) fila 0 columna 0, (1,1) fila 1 columna 1
                    matriz[i][j] = 1;
                }
            }
        }
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
