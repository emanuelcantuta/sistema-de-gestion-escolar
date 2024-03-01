package monolitico.com.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import monolitico.com.servicios.AlumnoService;
import monolitico.com.servicios.AlumnoServiceImp;
import monolitico.com.servicios.CursoService;
import monolitico.com.servicios.CursoServiceImp;

@WebServlet(urlPatterns = {"/TablaAlumnos"})
public class TablaAlumnosServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private AlumnoService alumnoService = new AlumnoServiceImp();
	private CursoService cursoService = new CursoServiceImp();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession misession = req.getSession(true);
		String usuario = (String) misession.getAttribute("usuario");

		if(usuario != null){
			RequestDispatcher dispatcher = this.getServletContext().
			getRequestDispatcher("/TablaAlumnos.jsp");
			req.setAttribute("alumnos",alumnoService.listar());
			req.setAttribute("cursos",cursoService.listar());
			dispatcher.forward(req, resp);
		}else{
			resp.sendRedirect("/login");
		}

	}
}
