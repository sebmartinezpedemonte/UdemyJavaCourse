package section18.com.smartinez.assignment23almacenventapormayor;

public class Empleado extends Persona {
    private Double remuneracion;
    private int empleadoId;

    public Empleado(String nombre, String apellido,  String direccion, Double remuneracion, int empleadoId) {
        super(nombre, apellido,  direccion);
        this.remuneracion = remuneracion;
        this.empleadoId = empleadoId;
    }

    public Double getRemuneracion() {
        return remuneracion;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void aumentarRemuneracion(int porcentaje){
        this.remuneracion = this.remuneracion + (this.remuneracion * porcentaje);
    }


    @Override
    public String toString() {
        return super.toString() + "Empleado{" +
                "remuneracion=" + remuneracion +
                ", empleadoId=" + empleadoId +
                '}';
    }
}
