package Section05FlujosDeControl;

import java.util.Scanner;

public class SentenciaIfElseNumDiasMes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el numero del mes de 1 - 12");

       int mes = input.nextInt();
        System.out.println("Ingrese el año (YYYY)");
       int anio = input.nextInt();

       int numeroDias = 0;


       if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
          numeroDias = 31;
       }else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
           numeroDias = 30;
       }else if(mes == 2){
           if(anio % 400 == 0 || ( (anio % 4 == 0) && !(anio% 100 == 0))){
             numeroDias = 29;
           }else {
               numeroDias = 28;
           }
       }

        System.out.println("numeroDias = " + numeroDias);
        input.close();
    }

}
