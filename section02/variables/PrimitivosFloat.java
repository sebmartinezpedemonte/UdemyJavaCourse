package section02.variables;

public class PrimitivosFloat {

    static float varFlotante;

    public static void main(String[] args) {
        float realFloat = 1.5e4F;//15000
        System.out.println("realFloat = " + realFloat);
        System.out.println("float corresponde en byte a = " + Float.BYTES);
        System.out.println("float corresponde en bits a = " + Float.SIZE);
        System.out.println("maximo valor para float = " + Float.MAX_VALUE);
        System.out.println("minimo valor para float = " + Float.MIN_VALUE);

        double realDouble = 1.7976931348623157E30;
        System.out.println("realDouble = " + realDouble);
        System.out.println("double corresponde en byte a = " + Double.BYTES);
        System.out.println("double corresponde en bits a = " + Double.SIZE);
        System.out.println("maximo valor para double = " + Double.MAX_VALUE);
        System.out.println("minimo valor para double = " + Double.MIN_VALUE);

        //valor por default del float es 0.0
        System.out.println("varFlotante = " + varFlotante);
        //En el main las variables siempre se tienen que inicializar.
        //En las clases no es necesario inicializar los atributos. Empiezan con el default (0 o null)


    }
}
