package monolitico.com.excepciones;

public class PasswordNoExisteException  extends Exception{

    private static final long serialVersionUID = 1L;
    public PasswordNoExisteException(String mensaje) {
        super(mensaje);
    }
    public PasswordNoExisteException(String mensaje, Throwable e) {
        super(mensaje, e);
    }
}

