package monolitico.com.dao;

public interface LoginDao {

	public void UsuarioExiste(String usuario) throws Exception;
	
	public void verificarPassword(String usuario,String password) throws Exception;
	
	public boolean logear(String usuario, String password) throws Exception;
}