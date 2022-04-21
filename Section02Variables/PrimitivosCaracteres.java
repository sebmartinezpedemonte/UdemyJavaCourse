package Section02Variables;

public class PrimitivosCaracteres {

        public static void main(String[] args) {
        char caracter = '\u0040';
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter : " + (decimal == caracter));

        char simbolo = 'Æ';
        System.out.println("simbolo = " + simbolo);
        System.out.println("decimal = simbolo : " + (decimal == simbolo));

        var caracterVar = 's';
        System.out.println("caracterVar = " + caracterVar);

        char espacio = '\u8820';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';


        System.out.println("char corresponde en \tbyte =" + espacio + Character.BYTES);
        System.out.println("tipo char" + System.getProperty("line.separator") + "corresponde en bits a" + retroceso + Character.SIZE);
        System.out.println("Valor maximo de un char es " + + tabulador + nuevaLinea + Character.MAX_VALUE);
        System.out.println("Valor minimo de un " + retornoCarro + " char es " + Character.MIN_VALUE);

    }
}
