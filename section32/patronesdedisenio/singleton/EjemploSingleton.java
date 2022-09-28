package section32.patronesdedisenio.singleton;

public class EjemploSingleton {
    public static void main(String[] args) {
        ConexionBDSingleton con = null;
        for(int i = 0; i < 10 ; i++) {
            con = ConexionBDSingleton.getInstancia();
            System.out.println("con = " + con);
        }
            ConexionBDSingleton con2 = ConexionBDSingleton.getInstancia();
            ConexionBDSingleton con3 = ConexionBDSingleton.getInstancia();
            boolean b1 = ((con == con2) && (con2 == con3) &&(con == con3)) ;
            System.out.println("b1 = " + b1);
            //da true porque son todas iguales, son la misma instancia


    }
}
