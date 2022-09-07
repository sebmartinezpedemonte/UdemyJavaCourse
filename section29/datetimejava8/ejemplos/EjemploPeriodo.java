package section29.datetimejava8.ejemplos;

import java.time.LocalDate;
import java.time.Period;

public class EjemploPeriodo {
    public static void main(String[] args) {
        //El periodo no incluye el tiempo
        //Hay que usar fechas: LocalDate

        LocalDate fecha1 = LocalDate.of(2011,9,23);
        LocalDate fecha2 = LocalDate.of(2020,11,25);
        //para cambiar una fecha:
        //fecha2 = fecha2.withMonth(12); reasignamos el valor.
        //fecha es inmutable

        LocalDate fecha3 = fecha2.withMonth(12);
        fecha3 = fecha3.withDayOfMonth(28);

        Period periodo = Period.between(fecha1, fecha3);

        System.out.println(periodo);
        System.out.printf("Perido entre %s y %s hay %d años, %d meses, %d dias",
                fecha1, fecha3, periodo.getYears(), periodo.getMonths(), periodo.getDays());


    }
}
