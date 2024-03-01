package monolitico.com.dao;

import java.util.List;

import monolitico.com.domain.Alumno;

public interface AlumnoDao {

	public List<Alumno> listar();
	
	public void agregarAlumno(String nombre, String apellido, int dni, int curso_id) throws Exception;
	
	public void eliminar(int idAlumno) throws Exception;
	
	public void editar(int id_alumno, String nombre, String apellido, int curso_id) throws Exception;
	
	public Alumno buscarAlumno(int id) throws Exception;
	
	public int cantidadAlumnos() throws Exception;
	
}
