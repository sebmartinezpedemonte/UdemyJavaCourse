package section27.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;

public class Assignment32 {
    public static void main(String[] args) {
   /* El siguiente ejercicio es obtener el numero mayor de un arreglo pero utilizando
     programación funcional, implementando la expresión lambda Function<T,R>
     (que viene predefinida) con el api stream y operador reduce.*/

        Function<Integer[], Integer> max = arr -> Arrays.stream(arr).reduce(0, (ac, e) -> ac > e? ac :e);
        int resultado = max.apply(new Integer[]{1, 78, -1700, 2500, 0, 2000, 54, 2});
        System.out.println(resultado);



    }
}
