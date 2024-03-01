package monolitico.com.servicios;

import java.util.List;

import monolitico.com.dao.AlumnoDao;
import monolitico.com.dao.AlumnoDaoImp;
import monolitico.com.domain.Alumno;

public class AlumnoServiceImp implements AlumnoService{

	private AlumnoDao alumnoDao = new AlumnoDaoImp();
	
	@Override
	public List<Alumno> listar() {
		return alumnoDao.listar();
	}

	@Override
	public void agregarAlumno(String nombre, String apellido, int dni, int curso_id) throws Exception {
		alumnoDao.agregarAlumno(nombre, apellido, dni, curso_id);
	}

	@Override
	public void eliminar(int idAlumno) throws Exception {
			alumnoDao.eliminar(idAlumno);
	}

	@Override
	public void editar(int id_alumno, String nombre, String apellido, int curso_id) throws Exception {
		alumnoDao.editar(id_alumno, nombre, apellido, curso_id);
	}
	
	@Override
	public Alumno buscarAlumno(int idAlumno) throws Exception {
		return alumnoDao.buscarAlumno(idAlumno);
	}

	@Override
	public int cantidadAlumnos() throws Exception {
		return alumnoDao.cantidadAlumnos();
	}

	
	
}
