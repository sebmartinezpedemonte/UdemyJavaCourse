package section19.com.smartinez.pooclasesabstractas.form.validador;

import section19.com.smartinez.pooclasesabstractas.form.mensaje.IMensajeFormateable;

public class LargoValidador extends Validador implements IMensajeFormateable {

    protected String mensaje = "el campo %s debe tener minimo %d caracteres y maximo %d caracteres";
    // usamos %d -digitos- con String.format
    private int min; //por defecto es 0
    private int max = Integer.MAX_VALUE; //el maximo que soportan los enteros

    //si queremos poner un minimo o un max lo creamos sin parametros y despues lo seteamos con los setters
    public LargoValidador() {
    }

    public LargoValidador(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

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
        //this.mensaje = String.format(this.mensaje, this.min, this.max);
        if(valor == null){//valido el nulo con NoNuloValidador
            return true;
        }
        int largo = valor.length();
        return (largo >= min && largo <= max);
    }

    @Override
    public String getMensajeFormateado(String campo) {
        return String.format(this.mensaje, campo,  this.min, this.max);
    }


}
