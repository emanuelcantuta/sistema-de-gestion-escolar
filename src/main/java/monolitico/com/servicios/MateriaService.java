package monolitico.com.servicios;

import java.util.List;

import monolitico.com.domain.Materia;

public interface MateriaService {
	
	public List<Materia> listar();
	
	public void agregarMateria(String nombre) throws Exception;
	
	public void eliminar(int idMateria) throws Exception;
	
	public void editar(int id_materia, String nombre) throws Exception;
	
	public Materia buscarMateria(int id) throws Exception;
	
	public int cantidadMaterias() throws Exception;
}
