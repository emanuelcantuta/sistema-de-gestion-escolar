package monolitico.com.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import monolitico.com.domain.Alumno;
import monolitico.com.servicios.AlumnoService;
import monolitico.com.servicios.AlumnoServiceImp;

@WebServlet(urlPatterns = { "/agregarAlumno"})
public class AgregarAlumnoServlet extends HttpServlet{

	private AlumnoService alumnoService = new AlumnoServiceImp();	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/listar");

		String nombre = (String)req.getParameter("nombre");
		String apellido = (String)req.getParameter("apellido");
		String dni = (String)req.getParameter("dni");
		String curso_id = (String)req.getParameter("curso_id");
		
		
		Alumno nuevoAlumno = new Alumno();
		nuevoAlumno.setNombre(nombre);
		nuevoAlumno.setApellido(apellido);
		nuevoAlumno.setDni(Integer.parseInt(dni));
		nuevoAlumno.setCurso_id(Integer.parseInt(curso_id));
		
		try {
			alumnoService.agregarAlumno(nuevoAlumno.getNombre(), nuevoAlumno.getApellido(), nuevoAlumno.getDni(), nuevoAlumno.getCurso_id());

		} catch (Exception e1) {
			//redirigir a otra pagina error
			//si el producto existe tambien redirigir

		} 
		
		resp.sendRedirect("/TablaAlumnoCurso");	

	}

}
