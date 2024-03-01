package monolitico.com.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import monolitico.com.servicios.MateriaService;
import monolitico.com.servicios.MateriaServiceImp;

@WebServlet(urlPatterns = { "/nuevoProfesor"})
public class CargarFormularioNuevoProfesorServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private MateriaService materiaService = new MateriaServiceImp();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = this.getServletContext().
				getRequestDispatcher("/ProfesorForm.jsp");
		req.setAttribute("materias",materiaService.listar());
		dispatcher.forward(req, resp);
	}

	
	
}
