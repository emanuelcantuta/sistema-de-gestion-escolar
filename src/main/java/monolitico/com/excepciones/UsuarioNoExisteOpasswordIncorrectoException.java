package monolitico.com.excepciones;

public class UsuarioNoExisteOpasswordIncorrectoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UsuarioNoExisteOpasswordIncorrectoException(String mensaje) {

		super(mensaje);
	}

	public UsuarioNoExisteOpasswordIncorrectoException(String mensaje, Throwable e) {

		super(mensaje, e);
	}
}
