package section06.wrapper;

public class WrapperBoolean {
    public static void main(String[] args) {

        //definicion de dos objetos de referencia
        Integer num1, num2;
        //forma implicita
        num1 = 1;
        num2 = 2;

        boolean primBoolean = num1 > num2; //false
        //forma implicita
        // Boolean objBoolean = false;

        //forma explicita
        //Boolean objBoolean = Boolean.valueOf(false);

        //boxing
        Boolean objBoolean = Boolean.valueOf(primBoolean);
        Boolean objBoolean2 = Boolean.valueOf("false");
        Boolean objBoolean3 = false;

        System.out.println("primBoolean = " + primBoolean);
        System.out.println("objBoolean = " + objBoolean);
        System.out.println("objBoolean2 = " + objBoolean2);

        //los Boolean no se comportan como los Integer (Se comparan con el metodo equals)
        //los Boolean se compara con ==
        System.out.println("comparando dos objetos boolean " + (objBoolean == objBoolean2));
        System.out.println("comparando dos objetos boolean "+ objBoolean.equals(objBoolean2)) ;
        System.out.println("comparando dos objetos boolean " + (objBoolean2 == objBoolean3));
        System.out.println("comparando dos objetos boolean "+ objBoolean2.equals(objBoolean3));
        System.out.println("comparando dos objetos boolean " + (objBoolean == objBoolean3));

        //obtengo el valor primitivo del Booleano objeto
        //unboxing
        //forma explicita
        boolean primBoolean2 = objBoolean2.booleanValue();

        //forma implicita
        // boolean primBoolean2 = objBoolean2;

    }
}
