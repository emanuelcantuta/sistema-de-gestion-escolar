package monolitico.com.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import monolitico.com.servicios.*;

@WebServlet(urlPatterns = { "/MenuAdmin"})

public class MenuAdminServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	AlumnoService alumnoService = new AlumnoServiceImp();
	
	CursoService cursoService = new CursoServiceImp();

	MateriaService materiaService = new MateriaServiceImp();

	ProfesorService profesorService = new ProfesorServiceImp();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession misession = req.getSession(true);

		String usuario = (String) misession.getAttribute("usuario");

		try {

		if (usuario !=null ) {
			RequestDispatcher dispatcher = this.getServletContext().
			getRequestDispatcher("/MenuAdmin.jsp");
			req.setAttribute("cantidadAlumnos", alumnoService.cantidadAlumnos());
			req.setAttribute("cantidadCursos", cursoService.cantidadCursos());
			req.setAttribute("cantidadProfesor", profesorService.cantidadProfesores());
			req.setAttribute("cantidadMateria", materiaService.cantidadMaterias());
			dispatcher.forward(req, resp);
		}else{
			resp.sendRedirect("/login");
			}
		} catch (Exception e) {
			
		}

	}

	
	
}
