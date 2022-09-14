package section26.expresioneslambdaprogramacionfuncionaljava8.assignment29;

import java.util.function.Function;

/*
Expresión Lambda que elimine espacios, comas y puntos de una frase
 y además devuelva la frase convertida en mayúscula.
 */
public class Test {
    public static void main(String[] args) {
        Function<String, String> f1 = param -> param.toUpperCase().replace(",","" ).replace(".", "").replace(" ", "");
        String resultado = f1.apply("Vivir sin filosofar es, propiamente, tener los ojos cerrados, sin tratar de abrirlos jamás.");
        System.out.println(resultado);
    }
}
