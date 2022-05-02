package Section08ClasesDateYCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a date with formato: yyyy-MM-dd");
        try {
            Date date = format.parse(input.next());
            System.out.println("date = " + date);
            System.out.println("format = " + format.format(date));

            Date currentDate = new Date();

            System.out.println("currentDate = " + currentDate);
            if (date.after(currentDate)) {
                System.out.println("date of the user is after currentDate  ");
            } else if (date.before(currentDate)) {
                System.out.println("date of the user is before currentDate");
            } else if (date.equals(currentDate)) {
                System.out.println("date of the user is equal to currentDate");
            }
            //Another way to compare dates
            if (date.compareTo((currentDate)) > 0) {
                System.out.println("date of the user is after currentDate  ");

            } else if (date.compareTo((currentDate)) < 0) {
                System.out.println("date of the user is before currentDate");

            } else if (date.compareTo((currentDate)) == 0) {
                System.out.println("date of the user is equal to currentDate");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        input.close();
    }
}
