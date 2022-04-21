package Section06Wrapper;

public class WrapperInteger {
    public static void main(String[] args) {

        int intPrimitivo = 32768;
        //transformar un int en un Integer
        Integer intObjeto = Integer.valueOf(32768); //boxing
        intObjeto = Integer.valueOf(intPrimitivo);
        Integer intObjeto2 = 32768; //autoboxing
        //Integer intObjeto2 = intPrimitivo;     autoboxing
        intObjeto2 = intPrimitivo;
        System.out.println("intObjeto = " + intObjeto);

        //transformar un Integer en un int
        int num = intObjeto;    //implicita
        int num2 = intObjeto2.intValue();   //explicita
        System.out.println("num = " + num);
        System.out.println("num2 = " + num2);

        //transformar un String a un valor entero
        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);

        //imprime cualquier numero ya que esta mas alla
        Short shortObjeto = intObjeto.shortValue();
        System.out.println("shortObjeto = " + shortObjeto);
        //este tmp anda bien
        Byte byteObjeto = intObjeto.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);
        //este si anda bien
        Long longObjeto = intObjeto.longValue();
        System.out.println("longObjeto = " + longObjeto);

        //copia el numero ya transformado
        int valor2 = shortObjeto.intValue();
        System.out.println("valor2 = " + valor2);


    }
}
