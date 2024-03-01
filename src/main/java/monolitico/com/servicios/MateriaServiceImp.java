package monolitico.com.servicios;

import java.util.List;

import monolitico.com.dao.MateriaDao;
import monolitico.com.dao.MateriaDaoImp;
import monolitico.com.domain.Materia;

public class MateriaServiceImp implements MateriaService{

	private MateriaDao materiaDao = new MateriaDaoImp();
	
	@Override
	public List<Materia> listar() {
		return materiaDao.listar();
	}

	@Override
	public void agregarMateria(String nombre) throws Exception {
		materiaDao.agregarMateria(nombre);
	}

	@Override
	public void eliminar(int idMateria) throws Exception {
		materiaDao.eliminar(idMateria);
	}

	@Override
	public void editar(int id_materia, String nombre) throws Exception {
		materiaDao.editar(id_materia, nombre);
	}

	@Override
	public Materia buscarMateria(int id) throws Exception {
		return materiaDao.buscarMateria(id);
	}

	@Override
	public int cantidadMaterias() throws Exception {
		return materiaDao.cantidadMaterias();
	}

}
