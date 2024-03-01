package monolitico.com.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import monolitico.com.domain.Curso;
import monolitico.com.servicios.CursoService;
import monolitico.com.servicios.CursoServiceImp;

@WebServlet(urlPatterns = { "/editarCursoForm"})

public class CargarFormularioEditarCursoServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	CursoService cursoService = new CursoServiceImp();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = this.getServletContext().
				getRequestDispatcher("/editCursoForm.jsp");
		
		String idCurso = req.getParameter("idCurso");
		int id = Integer.parseInt(idCurso);
		
		try {
			
			Curso curs = cursoService.buscarCurso(id);
			req.setAttribute("curso",curs);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		dispatcher.forward(req, resp);
	}

	
	
}
