package monolitico.com.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import monolitico.com.domain.Alumno;
import monolitico.com.servicios.AlumnoService;
import monolitico.com.servicios.AlumnoServiceImp;
import monolitico.com.servicios.CursoService;
import monolitico.com.servicios.CursoServiceImp;

@WebServlet(urlPatterns = { "/editarAlumnoForm"})
public class CargarFormularioEditarAlumnoServlet extends HttpServlet{

	private AlumnoService alumnoService = new AlumnoServiceImp();
	private CursoService cursoService = new CursoServiceImp();
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = this.getServletContext().
				getRequestDispatcher("/editAlumnoForm.jsp");
		
		String idAlumno = req.getParameter("idAlumno");
		int id = Integer.parseInt(idAlumno);
		
		try {
			
			Alumno alum = alumnoService.buscarAlumno(id);
			req.setAttribute("alumno",alum);
			req.setAttribute("cursos",cursoService.listar());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		dispatcher.forward(req, resp);
	}

	
	
}
