package section26.expresioneslambdaprogramacionfuncionaljava8.assignment30;
import java.util.Map;

@FunctionalInterface
public interface ContadorPalabras {
    Map<String,Integer> contarPalabras(String frase);
}
