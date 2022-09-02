package section26.java8programacionfuncionalexpresioneslambda.assignment30;
import java.util.Map;

@FunctionalInterface
public interface ContadorPalabras {
    Map<String,Integer> contarPalabras(String frase);
}
