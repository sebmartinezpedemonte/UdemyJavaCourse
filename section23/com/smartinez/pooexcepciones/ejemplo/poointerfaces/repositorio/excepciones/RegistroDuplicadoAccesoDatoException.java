package section23.com.smartinez.pooexcepciones.ejemplo.poointerfaces.repositorio.excepciones;

public class RegistroDuplicadoAccesoDatoException extends EscrituraAccesoDatoException{
    public RegistroDuplicadoAccesoDatoException(String message) {
        super(message);
    }
}
