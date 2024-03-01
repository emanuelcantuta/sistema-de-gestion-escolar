package monolitico.com.servicios;

import java.util.List;

import monolitico.com.dao.CursoDao;
import monolitico.com.dao.CursoDaoImp;
import monolitico.com.domain.Curso;

public class CursoServiceImp implements CursoService{

	private CursoDao cursoDao = new CursoDaoImp();
	
	@Override
	public List<Curso> listar() {
		return cursoDao.listar();
	}

	@Override
	public void agregarCurso(int nivel, char letra) throws Exception {
		cursoDao.agregarCurso(nivel, letra);
	}

	@Override
	public void eliminar(int id_curso) throws Exception {
		cursoDao.eliminar(id_curso);
	}

	@Override
	public void editar(int id_curso, int nivel, char letra) throws Exception {
		cursoDao.editar(id_curso, nivel, letra);
	}

	@Override
	public Curso buscarCurso(int id) throws Exception {
		return cursoDao.buscarCurso(id);
	}

	@Override
	public int cantidadCursos() throws Exception {
		return cursoDao.cantidadCursos();
	}

}
