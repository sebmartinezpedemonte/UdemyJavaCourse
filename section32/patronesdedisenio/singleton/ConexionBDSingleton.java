package section32.patronesdedisenio.singleton;
//BD:Base de Datos
public class ConexionBDSingleton {

    private static ConexionBDSingleton instancia;

     private ConexionBDSingleton(){
         System.out.println("Conectandose a algun motor de base de datos");
     }
        //el constructor se llama solo una vez y se crea solo una instancia
     public static ConexionBDSingleton getInstancia(){
         if(instancia == null){
             instancia = new ConexionBDSingleton();
         }
         return instancia; //devuelve la instancia recien creada, luego del if, o la misma nstancia ya creada ya que no es nula
     }

}
