package Section08ClasesDateYCalendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {

        Date date = new Date();

        System.out.println("date = " + date);
        SimpleDateFormat df = new SimpleDateFormat("dd, MMMM, yyyy");
        //SimpleDateFormat df = new SimpleDateFormat("EEEE dd 'de' MMMM, yyyy ");
        String dateStr = df.format(date);
        System.out.println("dateStr = " + dateStr);

        long j = 0;
        for(int i =0; i < 1000000000;i++){
            j+= i;
        }

        System.out.println("j = " + j);

        Date date2 = new Date();
        long finalTime = date2.getTime() - date.getTime();
        System.out.println("time elapsed in the for = " + finalTime + " milliseconds");

        df = new SimpleDateFormat("EEEE dd 'de' MMMM, yyyy ");
        dateStr = df.format(date);
        System.out.println("dateStr = " + dateStr);

    }

}
