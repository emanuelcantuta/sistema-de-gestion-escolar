package monolitico.com.servicios;

import monolitico.com.dao.LoginDao;
import monolitico.com.dao.LoginDaoImp;
import monolitico.com.excepciones.UsuarioNoExisteOpasswordIncorrectoException;

public class UsuarioServiceImp implements UsuarioService{

	private LoginDao loginDao = new LoginDaoImp();

	@Override
	public void verificarUsuario(String usuario, String password) throws Exception {
		try {
			loginDao.UsuarioExiste(usuario);
			loginDao.verificarPassword(usuario, password);
		} catch (UsuarioNoExisteOpasswordIncorrectoException e) {
			throw new UsuarioNoExisteOpasswordIncorrectoException(e.getMessage());
		}
		
	}

	@Override
	public boolean login(String usuario, String password) throws Exception {
		return loginDao.logear(usuario, password);
	}

}