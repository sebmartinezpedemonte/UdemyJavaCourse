package Section03TipoStringCadenas;

public class EjemploStringValidar {
    public static void main(String[] args) {

        String curso = null;

        boolean isNull = curso == null;


        System.out.println("isNull = " + isNull);

        if(isNull) {
            curso = " "; //"Programacion Java";
        }

        boolean esVacio = curso.length() ==0;

        System.out.println("isEmpty = " + esVacio);

        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);

        boolean esBlanco = curso.isBlank();
        System.out.println("esBlanco = " + esBlanco);
        if(!esBlanco){
        System.out.println(curso.toUpperCase());
        System.out.println("Bienvenido al ".concat(curso));
        }
    }
}
