package Section04Operadores;/*
Suponiendo un estanque de gasolina (gas) con capacidad 70 litros,
se requiere un programa que pida la medida actual en litros y mostrar el resultado de la forma:
Insuficiente, Suficiente, Medio...
La medida o capacidad actual del estanque puede ser en tipo double,
para una mejor precisión, pero tambien puede ser del tipo int.
Si la capacidad actual es 70 litros: imprimir Estanque lleno
Si está entre 60 y menor a 70: imprimir Estanque casi lleno
Si está entre 40 y menor a 60: imprimir Estanque  3/4
Si está entre 35 y menor a 40: imprimir Medio Estanque
Si está entre 20 y menor a 35: imprimir Suficiente
Si está entre 1 y menor a 20: imprimir Insuficiente

 */
import java.util.Scanner;
public class Assignment5SistemaEstanqueDeGasolina {
    public static void main(String[] args) {

        double ESTANQUE_MAX = 70.0;
        double estanqueActual = 0.0;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la medida actual en litros");
        estanqueActual = input.nextDouble();

        if (estanqueActual == ESTANQUE_MAX){
            System.out.println("Estanque lleno");
        }else if(estanqueActual >= 60.0 && estanqueActual < 70.0){
            System.out.println("Estanque casi lleno");
        }else if(estanqueActual >= 40.0 && estanqueActual < 60.0){
            System.out.println("Estanque 3/4");
        }else if(estanqueActual >= 35.0 && estanqueActual < 40.0){
            System.out.println("Medio estanque");
        }else if(estanqueActual >= 20.0 && estanqueActual < 35.0){
            System.out.println("Suficiente");
        }else if(estanqueActual >= 1.0 && estanqueActual < 20.0){
            System.out.println("Insuficiente");
        }else{
            System.out.println("El numero ingresado es incorrecto");
        }
    }
}
