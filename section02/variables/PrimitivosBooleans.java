package section02.variables;

public class PrimitivosBooleans {
    public static void main(String[] args) {
        //En el main siempre se tienen que inicializar las variables.  No es necesario en los atributos en las clases.

        boolean datoLogico = true;
        System.out.println("datoLogico = " + datoLogico);

        double d = 98765.43e-3;
        System.out.println("d = " + d);

        float f = 1.2345e2f;
        System.out.println("f = " + f);

        datoLogico = d < f;
        System.out.println("datoLogico = d < f = "  + datoLogico);

        boolean esIgual = (3-2 == 1);
        System.out.println("esIgual = (3-2 == 1) = " + esIgual);

    }
}
