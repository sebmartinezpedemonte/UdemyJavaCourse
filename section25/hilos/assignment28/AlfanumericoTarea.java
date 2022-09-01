package section25.hilos.assignment28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Para la tarea se pide implementar una clase llamada AlfanumericoTarea que implemente
 la interface Runnable y tenga como atributo un enum llamado Tipo.
El enum Tipo tiene dos elementos NUMERO Y LETRA.
Si el tipo es NUMERO, mostrara los números del 1 al 10, excluyente el último.
Si el tipo es LETRA, mostrar las letras de la 'A' a la 'Z', inclusivo el último.
Crea un par de hilos de diferentes tipos y ejecutarlos.
 */
public class AlfanumericoTarea implements Runnable{

    private Tipo tipo;

    public AlfanumericoTarea(Tipo tipo) {
        this.tipo = tipo;   }

    @Override
    public void run() {
        if(this.tipo.equals(Tipo.NUMERO)){
            Integer[] numeros = {1,2,3,4,5,6,7,8,9};
            List<Integer> numeros2 = new ArrayList<>();
            numeros2 = Arrays.asList(numeros);
            numeros2.forEach(System.out::println);
        }else if(this.tipo.equals(Tipo.LETRA)){
            Character[] letras = {'A', 'B', 'C', 'D', 'Z'};
            List<Character> letras2 = Arrays.asList(letras);
            letras2.forEach(System.out::println);
        }
    }

    /* Profesor:
     public void run() {
        //Segun el tipo hace una u otra cosa
        try {
            switch (tipo) {
                case NUMERO -> {
                    for (int i = 1; i < 10; i++) {
                        System.out.println(i);
                        TimeUnit.SECONDS.sleep(1);
                    }
                }
                case LETRA -> {
                    for (char c = 'A'; c <= 'Z'; c++) {

                        System.out.println(c);
                        TimeUnit.SECONDS.sleep(1);

                    }
                }
            }
        } catch (InterruptedException ex) {
        }
    }
     */

}
