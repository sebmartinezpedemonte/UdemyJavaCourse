package section20.com.smartinez.poointerfaces.imprenta.modelo;

public interface Imprimible {

    //final static no son necesarios para los atributos
    //porque por defecto los atributos de las interfaces son
    //estaticos (de la clase ya que no se instancian las interfaces)
    //y constantes por lo mismo
    String TEXTO_DEFECTO = "Imprimiendo un valor por defecto";

    String imprimir();

    //se pueden hacer metodos comunes tmb en las interfaces
    /*
    default String imprimir(){
        return TEXTO_DEFECTO;
    }
    */
    static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }


}
