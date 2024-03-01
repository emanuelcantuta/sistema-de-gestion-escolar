package monolitico.com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import monolitico.com.config.Connexion;
import monolitico.com.domain.Materia;

public class MateriaDaoImp implements MateriaDao{

	private List<Materia> materias = new ArrayList<Materia>();
	
	private Connexion conexion = Connexion.getInstance();
	
	@Override
	public List<Materia> listar() {
		Statement st =null;
		ResultSet rs = null;
		 Materia materia = null;
		 try{
			st = conexion.dameConnection().createStatement();
			rs = st.executeQuery ("select * from materia");
			materias = new ArrayList<Materia>();
			 while (rs.next()) {
				 materia = new Materia();
				 materia.setId_materia(rs.getInt(1));
				 materia.setNombre(rs.getString(2));
				 materias.add(materia);
			}
		 }catch (Exception e) {
			// TODO: handle exception
		 }finally {
			finalizarConexion(st, rs);
		 }
		return materias;
	}

	@Override
	public void agregarMateria(String nombre) throws Exception {
		Statement st =null;
		 try{
			 st = conexion.dameConnection().createStatement();
			 int registros = st.executeUpdate ("INSERT INTO materia (nombre) values "
							+ "('"+nombre+"')");
			 if (registros == 0) {
					throw new Exception("algo paso que no se agrego una materia");
				}
			}catch (Exception e) {
				throw new Exception(e.getMessage());
			}finally {
				finalizarConexion(st);
			}
	}

	@Override
	public void eliminar(int idMateria) throws Exception {
		Statement st =null;
		 try{
			st = conexion.dameConnection().createStatement();
			int registros = st.executeUpdate ("DELETE FROM materia WHERE id_materia = " + idMateria);
			if (registros == 0) {
				throw new Exception("algo paso que no se elimino l materia");
			}
		 }catch (Exception e) {
			 throw new Exception("no encontramos tal id en dao materia eliminar");
		 }finally {
			finalizarConexion(st);
		}
	}

	@Override
	public void editar(int id_materia, String nombre) throws Exception {
		Statement st =null;
		 try{
			st = conexion.dameConnection().createStatement();
			  st.executeUpdate("UPDATE materia SET nombre = '"+nombre+"' WHERE id_materia="+ id_materia);
		 }catch (Exception e) {
			 throw new Exception(e.getMessage());
		 }finally {
			finalizarConexion(st);
		}
	}

	@Override
	public Materia buscarMateria(int id) throws Exception {
		Statement st =null;
		ResultSet rs = null;
		Materia materia = null;
		 try{
			st = conexion.dameConnection().createStatement();
			rs = st.executeQuery ("select * from materia where id_materia =" +id);
			if (rs.next()) {
				materia = new Materia();
				 materia.setId_materia(rs.getInt(1));
				 materia.setNombre(rs.getString(2));
			}	
		 }catch (Exception e) {
			// TODO: handle exception
		}finally {
			finalizarConexion(st, rs);
		}
		return materia;
	}

	@Override
	public int cantidadMaterias() throws Exception {
		Statement st =null;
		ResultSet rs = null;
		 int cantidad=0;
		 try{
			st = conexion.dameConnection().createStatement();
			rs = st.executeQuery ("SELECT COUNT(*) FROM materia");
			 while (rs.next()) {
				cantidad=rs.getInt(1);
			}
				
		 }catch (Exception e) {
			// TODO: handle exception
		 }finally {
			finalizarConexion(st, rs);
		 }
		return cantidad;
	}

	
	private void finalizarConexion(Statement st, ResultSet rs) {
		try {
			st.close();
			rs.close();
			System.out.println("Se cierra la conexion");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void finalizarConexion(Statement st) {
		try {
			st.close();
			System.out.println("Se cierra la conexion");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
