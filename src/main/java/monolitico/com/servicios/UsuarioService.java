package monolitico.com.servicios;

public interface UsuarioService {


	public void verificarUsuario(String usuario, String password) throws Exception;
	
	public boolean login(String usuario, String password) throws Exception;
	
}