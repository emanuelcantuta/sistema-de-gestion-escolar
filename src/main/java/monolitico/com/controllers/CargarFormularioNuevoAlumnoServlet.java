package monolitico.com.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import monolitico.com.servicios.CursoService;
import monolitico.com.servicios.CursoServiceImp;

@WebServlet(urlPatterns = { "/nuevoAlumno"})
public class CargarFormularioNuevoAlumnoServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private CursoService cursoService = new CursoServiceImp();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = this.getServletContext().
				getRequestDispatcher("/AlumnoForm.jsp");
		req.setAttribute("cursos",cursoService.listar());
		dispatcher.forward(req, resp);
	}

	
	
}
