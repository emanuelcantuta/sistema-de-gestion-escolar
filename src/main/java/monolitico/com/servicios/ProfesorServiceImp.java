package monolitico.com.servicios;

import java.util.List;

import monolitico.com.dao.ProfesorDao;
import monolitico.com.dao.ProfesorDaoImp;
import monolitico.com.domain.Profesor;

public class ProfesorServiceImp implements ProfesorService{

	ProfesorDao profesorDao = new ProfesorDaoImp();
	
	@Override
	public List<Profesor> listar() {

		return profesorDao.listar();
	}

	@Override
	public void agregarProfesor(String nombre, String apellido, int dni, int materia_id) throws Exception {
		profesorDao.agregarProfesor(nombre, apellido, dni, materia_id);
	}

	@Override
	public void eliminar(int idProfesor) throws Exception {
		profesorDao.eliminar(idProfesor);
	}

	@Override
	public void editar(int id_profesor, String nombre, String apellido, int materia_id) throws Exception {
		profesorDao.editar(id_profesor, nombre, apellido, materia_id);
	}

	@Override
	public Profesor buscarProfesor(int id) throws Exception {
		return profesorDao.buscarProfesor(id);
	}

	@Override
	public int cantidadProfesores() throws Exception {
		return profesorDao.cantidadProfesores();
	}

	
	
}
