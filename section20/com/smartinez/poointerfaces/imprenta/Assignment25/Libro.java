package section20.com.smartinez.poointerfaces.imprenta.Assignment25;

import java.util.Date;

public class Libro extends Producto implements ILibro{


    private Date fechaPublicacion = new Date();
    private String autor;
    private String titulo;
    private String editorial;

    public Libro(int precio, Date fechaPublicacion, String autor, String titulo, String editorial) {
        super(precio);
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }


    @Override
    public double getPrecioVenta() {
        return getPrecio()*2;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "fechaPublicacion=" + getFechaPublicacion() +
                ", autor='" + getAutor() + '\'' +
                ", titulo='" + getTitulo() + '\'' +
                ", editorial='" + getEditorial() + '\'' +
                ", precio=" + getPrecio() +
                '}';
    }

    @Override
    public Date getFechaPublicacion() {
        return this.fechaPublicacion;
    }

    @Override
    public String getAutor() {
        return this.autor;
    }

    @Override
    public String getTitulo() {
        return this.titulo;
    }

    @Override
    public String getEditorial() {
        return this.editorial;
    }
}
