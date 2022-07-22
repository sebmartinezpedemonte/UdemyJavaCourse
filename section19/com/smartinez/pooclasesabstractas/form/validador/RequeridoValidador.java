package section19.com.smartinez.pooclasesabstractas.form.validador;

public class RequeridoValidador extends Validador{

    protected String mensaje = "el campo %s es requerido";

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        //primero chequear si es nulo, porque si lo ponemos al reves y es nulo va a tirar nullPointerException
        return (valor != null && valor.length() > 0); //!valor.isBlank() chequea que no sea espacios vacios/en blanco, incluye al !isEmpty()
    }
}
