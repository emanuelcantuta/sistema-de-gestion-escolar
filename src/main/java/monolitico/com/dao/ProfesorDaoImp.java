package monolitico.com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import monolitico.com.config.Connexion;
import monolitico.com.domain.Profesor;

public class ProfesorDaoImp implements ProfesorDao{

	private List<Profesor> profesores = new ArrayList<Profesor>();
	
	private Connexion conexion = Connexion.getInstance();
	
	@Override
	public List<Profesor> listar() {
		Statement st =null;
		 ResultSet rs = null;
		 Profesor profesor = null;
		 try{
			st = conexion.dameConnection().createStatement();
			rs = st.executeQuery ("select * from profesor");
			profesores = new ArrayList<Profesor>();
			 while (rs.next()) {
				 profesor = new Profesor();
				 profesor.setId_profesor(rs.getInt(1));
				 profesor.setNombre(rs.getString(2));
				 profesor.setApellido(rs.getString(3));
				 profesor.setDni(rs.getInt(4));
				 profesor.setMateria_id(rs.getInt(5));
				profesores.add(profesor);
			}
				
		 }catch (Exception e) {
			// TODO: handle exception
		 }finally {
			finalizarConexion(st, rs);
		 }
		return profesores;
	}

	@Override
	public void agregarProfesor(String nombre, String apellido, int dni, int materia_id) throws Exception {
		Statement st =null;
		 try{
			 st = conexion.dameConnection().createStatement();
			 int registros = st.executeUpdate ("INSERT INTO profesor (nombre, apellido, dni, materia_id) values "
							+ "('"+nombre+"', '"+apellido+"', "+dni+", '"+ materia_id + "')");
			 if (registros == 0) {
					throw new Exception("algo paso que no se agrego un profesor");
				}
			}catch (Exception e) {
				throw new Exception(e.getMessage());
			}finally {
				finalizarConexion(st);
			}
	}

	@Override
	public void eliminar(int idProfesor) throws Exception {
		Statement st =null;
		 try{
			st = conexion.dameConnection().createStatement();
			int registros = st.executeUpdate ("DELETE FROM profesor WHERE id_profesor = " + idProfesor);
			if (registros == 0) {
				throw new Exception("algo paso que no se elimino el profesor");
			}
		 }catch (Exception e) {
			 throw new Exception("no encontramos tal id en dao profesor agregar");
		 }finally {
			finalizarConexion(st);
		}
	}

	@Override
	public void editar(int id_profesor, String nombre, String apellido, int materia_id) throws Exception {
		Statement st =null;
		 try{
			st = conexion.dameConnection().createStatement();
			  st.executeUpdate("UPDATE profesor SET nombre = '"+nombre+"', apellido = '"+apellido+"', materia_id = "+materia_id+ " WHERE id_profesor="+ id_profesor);
		 }catch (Exception e) {
			 throw new Exception(e.getMessage());
		 }finally {
			finalizarConexion(st);
		}
	}

	@Override
	public Profesor buscarProfesor(int id) throws Exception {
		Statement st =null;
		ResultSet rs = null;
		Profesor profesor = null;
		 try{
			st = conexion.dameConnection().createStatement();
			rs = st.executeQuery ("select * from profesor where id_profesor =" +id);
			if (rs.next()) {
				profesor = new Profesor();
				 profesor.setId_profesor(rs.getInt(1));
				 profesor.setNombre(rs.getString(2));
				 profesor.setApellido(rs.getString(3));
				 profesor.setDni(rs.getInt(4));
				 profesor.setMateria_id(rs.getInt(5));
			}	
		 }catch (Exception e) {
			// TODO: handle exception
		}finally {
			finalizarConexion(st, rs);
		}
		return profesor;
	}

	@Override
	public int cantidadProfesores() throws Exception {
		Statement st =null;
		ResultSet rs = null;
		 int cantidad=0;
		 try{
			st = conexion.dameConnection().createStatement();
			rs = st.executeQuery ("SELECT COUNT(*) FROM profesor");
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
