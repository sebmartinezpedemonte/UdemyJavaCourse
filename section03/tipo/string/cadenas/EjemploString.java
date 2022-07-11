package section03.tipo.string.cadenas;

public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String curso2 = new String("Programacion Java");
        //== Compara la referencia del objeto
        boolean esIgual = curso == curso2;
        System.out.println("curso == curso2 = " + esIgual);//Son diferentes instancias ya que una se hace con el new
        //equals Compara el valor del objeto
        esIgual = curso.equals(curso2);
        System.out.println("curso.equals(curso2) = " + esIgual);

        //Asigna la misma referencia porque tiene el mismo texto. No crea tantos objetos. Ambos son el mismo objeto
        String curso3 = "Programacion Java";
        esIgual = curso == curso3;
        System.out.println("curso == curso3 = " + esIgual);



    }
}
