package section13.matrices.arreglos.bidimensionales;

public class EjemploMatricesTranspuesta {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        System.out.println("Matriz original");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        //solamente recorremos la mitad porque si recorremos toda
        //la matriz igualmente va a cambiar los datos, pero despues
        //va a volver a sobreescribir y volver a dar vuelta y va a
        //dejar la matriz como estaba originalmente
        //entonces solamente tenemos que trasponer los elementos
        //por debajo de la diagonal principal
        int aux;
        for(int i = 1; i < matriz.length; i++){
            for(int j = 0; j < i; j++){
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }
        }
        System.out.println("Matriz traspuesta");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
