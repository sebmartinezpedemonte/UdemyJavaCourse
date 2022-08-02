package section20.com.smartinez.poointerfaces.imprenta.Assignment25;

abstract public class Electronico extends Producto implements IElectronico{

    private String fabricante;

    public Electronico(int precio, String fabricante) {
        super(precio);
        this.fabricante = fabricante;
    }

    public String getFabricante(){
        return this.fabricante;
    }


}
