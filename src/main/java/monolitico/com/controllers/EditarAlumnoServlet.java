package monolitico.com.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import monolitico.com.servicios.AlumnoService;
import monolitico.com.servicios.AlumnoServiceImp;

@WebServlet(urlPatterns = { "/editarAlumno"})
public class EditarAlumnoServlet extends HttpServlet{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private AlumnoService alumnoService = new AlumnoServiceImp();
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = (String) req.getParameter("id_alumnos");
		String nombre = (String) req.getParameter("nombre");
		String apellido = (String) req.getParameter("apellido");
		String curso_id = (String) req.getParameter("curso_id");
		
		try {
			int idParseado = Integer.parseInt(id);
			int cursoIdParseado = Integer.parseInt(curso_id);
			alumnoService.editar(idParseado, nombre, apellido, cursoIdParseado);
			resp.sendRedirect("/TablaAlumnoCurso");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}	
}
