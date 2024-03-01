package monolitico.com.servicios;

import java.util.List;

import monolitico.com.domain.Curso;

public interface CursoService {

	public List<Curso> listar();
		
	public void agregarCurso(int nivel, char letra) throws Exception;
	
	public void eliminar(int id_curso) throws Exception;
	
	public void editar(int id_curso, int nivel, char letra) throws Exception;
	
	public Curso buscarCurso(int id) throws Exception;

	public int cantidadCursos() throws Exception;
}
