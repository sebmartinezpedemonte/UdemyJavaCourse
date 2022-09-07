package section29.datetimejava8.ejemplos.assignment35;


import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/*
Para esta tarea se pide ingresar una fecha de nacimiento en formato String,
convertirla a una fecha del tipo LocalDate y calcular la edad de la persona
 de acuerdo a la fecha actual.
 //formato estandar para ingresar en String año, mes, dia ("2022-09-05")
 */
public class CalcularEdad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento en el siguiente formato: yyyy-MM-dd, por ejemplo, 1988-10-12");
        String fechaNacimiento = input.nextLine();
        try {
            LocalDate nac = LocalDate.parse(fechaNacimiento);
            //LocalDate fechaActual = LocalDate.now();
            //Period edad = Period.between(nac, fechaActual);
            Period edad = Period.between(nac, LocalDate.now());
            System.out.println("Usted tiene " + edad.getYears() + " años");
        }catch(RuntimeException e){
            System.out.println("El formato ingresado es incorrecto");
            main(args);
        }

     }
}

/*
Solucion profesor
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un fecha de nacimiento con formato yyyy-MM-dd:");
        String fechaStr = scanner.next();

        LocalDate fechaNacimiento = LocalDate.parse(fechaStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate actual = LocalDate.now();

        Period periodo = Period.between(fechaNacimiento, actual);
        System.out.printf("Tu edad es: %s años, %s meses y %s días", periodo.getYears(), periodo.getMonths(), periodo.getDays());
    }
}
 */