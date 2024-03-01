package monolitico.com.dao;

import java.util.List;

import monolitico.com.domain.Profesor;

public interface ProfesorDao {
	
	public List<Profesor> listar();
	
	public void agregarProfesor(String nombre, String apellido, int dni, int materia_id) throws Exception;
	
	public void eliminar(int idProfesor) throws Exception;
	
	public void editar(int id_profesor, String nombre, String apellido, int materia_id) throws Exception;
	
	public Profesor buscarProfesor(int id) throws Exception;
	
	public int cantidadProfesores() throws Exception;
}
