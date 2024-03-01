package monolitico.com.dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import monolitico.com.config.Connexion;
import monolitico.com.excepciones.UsuarioNoExisteOpasswordIncorrectoException;

public class LoginDaoImp implements LoginDao{


		private Connexion conexion = Connexion.getInstance();
		private static final String QUERY_USUARIO = "Select * from login where user=? ";
		private static final String QUERY_PASSWORD= "Select * from login where user=? and password=? ";
		public void UsuarioExiste(String usuario) throws UsuarioNoExisteOpasswordIncorrectoException {
			PreparedStatement st = null;
			ResultSet rs = null;
			try {
				st = conexion.dameConnection().prepareStatement(QUERY_USUARIO);
				st.setString(1,usuario);
				rs = st.executeQuery();
				if(!rs.first()) {
					throw new UsuarioNoExisteOpasswordIncorrectoException("Usuario No existe");
				}
			} catch (Exception e) {
				throw new UsuarioNoExisteOpasswordIncorrectoException("Usuario No existe");
			}
			finally{
				finalizarConexion(st, rs);
			}
		}
	
		public void verificarPassword(String usuario,String password) throws UsuarioNoExisteOpasswordIncorrectoException {
			PreparedStatement st = null;
			ResultSet rs = null;
			try {
				st = conexion.dameConnection().prepareStatement(QUERY_PASSWORD);
				st.setString(1, usuario);
				st.setString(2,password);
				rs = st.executeQuery();
				if(!rs.first()) {
					throw new UsuarioNoExisteOpasswordIncorrectoException("contraseña Incorrecta");
				}
			} catch (Exception e) {
				throw new UsuarioNoExisteOpasswordIncorrectoException("contraseña Incorrecta");
			}
			finally{
				finalizarConexion(st, rs);
				}
			}
		
		@Override
		public boolean logear(String usuario, String password) throws Exception {
			if (usuario.equals("admin") && password.equals("admin") ) {
				return true;
			}
			else {
				return false;
			}
		}

		private void finalizarConexion(Statement st, ResultSet rs) {
			try {
				st.close();
				rs.close();
			} catch (SQLException e) {
				System.out.println("Error al intentar cerrar la conexion");
			}
		}
		
}