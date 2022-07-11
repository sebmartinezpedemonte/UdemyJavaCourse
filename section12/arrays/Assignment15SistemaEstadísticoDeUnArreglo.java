package section12.arrays;

import java.util.Scanner;

public class Assignment15SistemaEstadísticoDeUnArreglo {
    public static void main(String[] args) {
        /*
        Leer 7 números por teclado para llenar un arreglo y a
        continuación calcular el promedio de los números positivos,
         el promedio de los negativos y contar el número de ceros.
         */
        Scanner input = new Scanner(System.in);
        double[] numeros = new double[7];
        double[] positivos = new double[7];
        double[] negativos = new double[7];
        int cantPositivos = 0;
        int cantNegativos = 0;
        int cantCeros = 0;
        double promedioPositivos = 0;
        double promedioNegativos = 0;
        double acumuladorPositivos = 0;
        double acumuladorNegativos = 0;


        for(int i = 0; i<numeros.length ; i++){
            System.out.println("Ingrese un numero: ");
            numeros[i] = input.nextInt();
        }
        //-3,-5,8,0,0,2,2
        for(int i = 0; i< numeros.length; i++){
            if(numeros[i] > 0){
                cantPositivos++;
                positivos[i] = numeros[i];
            }else if(numeros[i] < 0){
                cantNegativos++;
                negativos[i] = numeros[i];
            }else{
                cantCeros++;
            }
        }

        if(cantPositivos > 0){
            for (int i = 0; i < positivos.length; i++){
                acumuladorPositivos += positivos[i];
            }
            promedioPositivos = acumuladorPositivos/cantPositivos;
        }


        if(cantNegativos>0){
            for(int i = 0; i<negativos.length ; i++){
                acumuladorNegativos += negativos[i];
            }
            promedioNegativos = acumuladorNegativos/cantNegativos;
        }

        System.out.println("promedioPositivos = " + promedioPositivos);
        System.out.println("promedioNegativos = " + promedioNegativos);
        System.out.println("cantCeros = " + cantCeros);
    }
}
