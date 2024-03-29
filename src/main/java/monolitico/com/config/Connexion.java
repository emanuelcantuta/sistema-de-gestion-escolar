package monolitico.com.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {

	private static final String HOST = "localhost";
	private static final String URL = "jdbc:mysql://"+HOST+":3306";
	private static final String DBNAME = "escuela";
	
	
	private static final String TIMEZONE = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private static final String DRIVER = "com.mysql.jdbc.Driver";
				
	private static final String USUARIO = "root";
	private static final String PASSWORD = "";
	
	
	
	private static Connexion instance = Connexion.getInstance();
	 
	private Connection conn;
	
	private Connexion() {
		
	}
	
	public Connection dameConnection() {
		
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL+"/"+ DBNAME+TIMEZONE, USUARIO, PASSWORD);
			if (!conn.isClosed()) {
				System.out.println("conectado a la base de datos");
			}	
			return conn;
		} catch (ClassNotFoundException e) {
			System.out.println("Error al intentar conectar a la base");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	 public static Connexion getInstance() {
	       if (instance == null) {
	    	   instance = new Connexion();
	       }
	       return instance;
	   }
}
