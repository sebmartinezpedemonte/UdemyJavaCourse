package Section08ClasesDateYCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
Para esta tarea se pide ingresar una fecha de nacimiento
en formato string, convertirla a una fecha del tipo java.util.Date
 y calcular la edad de la persona de acuerdo a la fecha actual.
 */
public class CalcularEdad2 {
    public static void main(String[] args) throws ParseException {

        Scanner input = new Scanner(System.in);

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date currentDate = new Date();
        //Date currentDate = format.parse("3/10/2022");
        //or
        //Calendar currentCalendar = Calendar.getInstance();
        //Date currentDate = currentCalendar.getTime();

        long usersAgeMilliseconds;
        long usersAgeInYears;
        //double millisecondsInAYear = 3.1536e10;

        System.out.println("Enter your date of birth with format dd/MM/yyyy");

        try {
            Date usersBirthDate = format.parse(input.nextLine());
            System.out.println("currentDate = " + currentDate);
            System.out.println("usersBirthDate = " + usersBirthDate);
            usersAgeMilliseconds = currentDate.getTime() - usersBirthDate.getTime();
            System.out.println("usersAgeMilliseconds = " + usersAgeMilliseconds);
            //usersAgeInYears = (long) (usersAgeMilliseconds / (millisecondsInAYear));
            //System.out.println("millisecondsInAYear = " + millisecondsInAYear);
            usersAgeInYears = (long) (usersAgeMilliseconds*3.17098e-11);
            System.out.println("usersAgeInYears = " + usersAgeInYears);

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
