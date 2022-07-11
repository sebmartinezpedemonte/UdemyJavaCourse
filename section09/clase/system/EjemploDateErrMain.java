package section09.clase.system;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploDateErrMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");


        System.out.println("Enter a date with format: yyyy-MM-dd");
        try {
            Date date = format.parse(input.next());
            System.out.println("date = " + date);
            System.out.println("format = " + format.format(date));

        } catch (ParseException e) {
            e.printStackTrace();
            System.err.println("La fecha tiene un formato incorrecto: " + e.getMessage());
            System.err.println("El formato debe ser 'yyyy-MM-dd");
            //System.exit(1);
            main(args);
        }
        input.close();
    */

        int n = 1;
        System.out.println("Ingrese un nro");
        int n2 = input.nextInt();
        try {
            System.out.println(n / n2);
        } catch (Exception e) {
            System.err.println("Dividiste por cero");
            main(args);
        }


    }
}
