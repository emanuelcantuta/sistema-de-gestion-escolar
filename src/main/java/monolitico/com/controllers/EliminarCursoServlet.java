package monolitico.com.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import monolitico.com.servicios.CursoService;
import monolitico.com.servicios.CursoServiceImp;

@WebServlet(urlPatterns = { "/eliminarCurso"})

public class EliminarCursoServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private CursoService cursoService = new CursoServiceImp();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id = (String) req.getParameter("idcurso");
		int idCurso = Integer.parseInt(id);

		try {	
			cursoService.eliminar(idCurso);	
		} catch (Exception e) {
			System.out.println("No mande ningun id a service :(");
		//	e.printStackTrace();
		}
	}
	
}
