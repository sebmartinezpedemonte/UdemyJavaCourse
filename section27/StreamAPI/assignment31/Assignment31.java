package section27.StreamAPI.assignment31;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Modificar flujo y devolver la suma
+


Como desafió consiste en un arreglo de 100 elementos del 1 al 100, del tipo int,

utilizando el api stream se pide eliminar los divisibles en 10, luego convertir
 los elementos restante del flujo en tipo double y dividirlos en 2, para finalmente
 devolver la suma total de todos ellos usando el operador terminal reduce.
 El resultado debería ser 2250.0
*/
public class Assignment31 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        for(int i = 1; i <=100 ; i++){
            nums.add(i);
        }
        double sum = nums.stream()
                .filter(e -> e%10 != 0)
                .mapToDouble(e -> (double)e/2)
                .reduce(0, Double::sum); //(ac, e) -> ac + e
        System.out.println("sum = " + sum);
    }
}
