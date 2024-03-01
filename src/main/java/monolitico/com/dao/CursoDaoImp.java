package monolitico.com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import monolitico.com.config.Connexion;
import monolitico.com.domain.Curso;

public class CursoDaoImp implements CursoDao{
	
	private List<Curso> cursos = new ArrayList<Curso>();
	
	private Connexion conexion = Connexion.getInstance();
	
	@Override
	public List<Curso> listar() {
		Statement st =null;
		ResultSet rs = null;
		Curso curso = null;
		
		try{
			st = conexion.dameConnection().createStatement();
			rs = st.executeQuery ("select * from curso");
			cursos = new ArrayList<Curso>();
			 while (rs.next()) {
				 curso = new Curso();
				 curso.setId_curso(rs.getInt(1));
				 curso.setNivel(rs.getInt(2));
				 curso.setLetra(rs.getString(3).charAt(0));
				cursos.add(curso);
			}
				
		 }catch (Exception e) {
			// TODO: handle exception
		 }finally {
			finalizarConexion(st, rs);
		 }	
		
		return cursos;
	}

	@Override
	public void agregarCurso(int nivel, char letra) throws Exception {
		Statement st =null;
		 try{
			 st = conexion.dameConnection().createStatement();
			 int registros = st.executeUpdate ("INSERT INTO curso (nivel, letra) values "
							+ "("+nivel+", '"+letra+"')");
			 if (registros == 0) {
					throw new Exception("algo paso que no se agrego curso");
				}
			}catch (Exception e) {
				throw new Exception(e.getMessage());
			}finally {
				finalizarConexion(st);
			}
	}

	@Override
	public void eliminar(int id_curso) throws Exception {
		 Statement st =null;
		 try{
			st = conexion.dameConnection().createStatement();
			int registros = st.executeUpdate ("DELETE FROM curso WHERE id_curso = " + id_curso);
			if (registros == 0) {
				throw new Exception("algo paso que no se elimino el curso");
			}
		 }catch (Exception e) {
			 throw new Exception("no encontramos tal id en dao curso");
		 }finally {
			finalizarConexion(st);
		}
	}

	@Override
	public void editar(int id_curso, int nivel, char letra) throws Exception {
		 Statement st =null;
		 try{
			st = conexion.dameConnection().createStatement();
			  st.executeUpdate("UPDATE curso SET nivel = "+nivel+", letra = '"+letra+"' WHERE id_curso="+ id_curso);
		 }catch (Exception e) {
			 throw new Exception(e.getMessage());
		 }finally {
			finalizarConexion(st);
		}
	}

	@Override
	public Curso buscarCurso(int id) throws Exception {
		Statement st =null;
		 ResultSet rs = null;
		 Curso curso = null;
		 try{
			st = conexion.dameConnection().createStatement();
			rs = st.executeQuery ("select * from curso where id_curso =" + id);
			if (rs.next()) {
				curso = new Curso();
				 curso.setId_curso(rs.getInt(1));
				 curso.setNivel(rs.getInt(2));
				 curso.setLetra(rs.getString(3).charAt(0));
			}	
		 }catch (Exception e) {
			// TODO: handle exception
		}finally {
			finalizarConexion(st, rs);
		}
		return curso;
	}
	
	@Override
	public int cantidadCursos() throws Exception {	
		Statement st =null;
		 ResultSet rs = null;
		 int cantidad=0;
		 try{
			st = conexion.dameConnection().createStatement();
			rs = st.executeQuery ("SELECT COUNT(*) FROM curso");
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
