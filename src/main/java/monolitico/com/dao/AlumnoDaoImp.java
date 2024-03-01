package monolitico.com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import monolitico.com.config.Connexion;
import monolitico.com.domain.Alumno;

public class AlumnoDaoImp implements AlumnoDao {

	private List<Alumno> alumnos = new ArrayList<Alumno>();
	
	private Connexion conexion = Connexion.getInstance();

	@Override
	public List<Alumno> listar() {
		 Statement st =null;
		 ResultSet rs = null;
		 Alumno alumno = null;
		 try{
			st = conexion.dameConnection().createStatement();
			rs = st.executeQuery ("select * from alumno");
			alumnos = new ArrayList<Alumno>();
			 while (rs.next()) {
				 alumno = new Alumno();
				 alumno.setId_alumnos(rs.getInt(1));
				 alumno.setNombre(rs.getString(2));
				 alumno.setApellido(rs.getString(3));
				 alumno.setDni(rs.getInt(4));
				 alumno.setCurso_id(rs.getInt(5));
				alumnos.add(alumno);
			}
				
		 }catch (Exception e) {
			// TODO: handle exception
		 }finally {
			finalizarConexion(st, rs);
		 }
		return alumnos;
	}


	@Override
	public void agregarAlumno(String nombre, String apellido, int dni, int curso_id) throws Exception{
		 Statement st =null;
		 
		 try{
			 st = conexion.dameConnection().createStatement();
			 int registros = st.executeUpdate ("INSERT INTO alumno (nombre, apellido, dni, curso_id) values "
							+ "('"+nombre+"', '"+apellido+"', "+dni+", '"+ curso_id + "')");
			 if (registros == 0) {
					throw new Exception("algo paso que no se agrego un alumno");
				}
			}catch (Exception e) {
				throw new Exception(e.getMessage());
			}finally {
				finalizarConexion(st);
			}
	}

	@Override
	public void eliminar(int idAlumno) throws Exception {
		 Statement st =null;
		 try{
			st = conexion.dameConnection().createStatement();
			int registros = st.executeUpdate ("DELETE FROM alumno WHERE id_alumno = " + idAlumno);
			if (registros == 0) {
				throw new Exception("algo paso que no se elimino");
			}
		 }catch (Exception e) {
			 throw new Exception("no encontramos tal id en dao alumno eliminar");
		 }finally {
			finalizarConexion(st);
		}
	}

	@Override
	public void editar(int id_alumno, String nombre, String apellido, int curso_id) throws Exception {
		 Statement st =null;
		 try{
			st = conexion.dameConnection().createStatement();
			  st.executeUpdate("UPDATE alumno SET nombre = '"+nombre+"', apellido = '"+apellido+"', curso_id = "+curso_id+ " WHERE id_alumno="+ id_alumno);
		 }catch (Exception e) {
			 throw new Exception(e.getMessage());
		 }finally {
			finalizarConexion(st);
		}
	}
	
	
	@Override
	public Alumno buscarAlumno(int id) throws Exception {
		Statement st =null;
		ResultSet rs = null;
		Alumno alumno = null;
		 try{
			st = conexion.dameConnection().createStatement();
			rs = st.executeQuery ("select * from alumno where id_alumno =" +id);
			if (rs.next()) {
				alumno = new Alumno();
				 alumno.setId_alumnos(rs.getInt(1));
				 alumno.setNombre(rs.getString(2));
				 alumno.setApellido(rs.getString(3));
				 alumno.setDni(rs.getInt(4));
				 alumno.setCurso_id(rs.getInt(5));
			}	
		 }catch (Exception e) {
			// TODO: handle exception
		}finally {
			finalizarConexion(st, rs);
		}
		return alumno;
	}
	
	@Override
	public int cantidadAlumnos() throws Exception {
		Statement st =null;
		 ResultSet rs = null;
		 int cantidad=0;
		 try{
			st = conexion.dameConnection().createStatement();
			rs = st.executeQuery ("SELECT COUNT(*) FROM alumno");
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
