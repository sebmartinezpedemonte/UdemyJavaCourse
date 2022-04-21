package Section05FlujosDeControl;/*
Mediante el teclado pedir dos números enteros positivos
 o negativos y multiplicarlos, pero sin usar el símbolo de multiplicación (*).
Puede utilizar una sentencia for para realizar la multiplicación y tener en
 cuenta los unarios, donde menos por menos es positivo.
 */
import java.util.Scanner;
public class Assignment9MultiplicarDosNumerosSinUsarSignoMultiplicacion {
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        
        int num1, num2,resultado = 0;
        System.out.println("Ingrese el primer numero");
        num1 = input.nextInt();;
        System.out.println("Ingrese el segundo numero");
        num2=input.nextInt();

        for(int i = 0; i<Math.abs(num2);i++){
            resultado +=num1;
        }
        if(num2<0){
            resultado = -resultado;
        }
        System.out.println("resultado = " + resultado);

        input.close();
    }
}
