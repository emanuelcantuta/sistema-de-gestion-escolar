package monolitico.com.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import monolitico.com.servicios.CursoService;
import monolitico.com.servicios.CursoServiceImp;

@WebServlet(urlPatterns = { "/editarCurso"})

public class EditarCursoServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	CursoService cursoService = new CursoServiceImp();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = (String) req.getParameter("id_curso");
		String nivel = (String) req.getParameter("nivel");
		String letra = (String) req.getParameter("letra");
		
		try {
			int idParseado = Integer.parseInt(id);
			int nivelParseado = Integer.parseInt(nivel);
			char letraParseada = letra.charAt(0);
			cursoService.editar(idParseado, nivelParseado, letraParseada);
			resp.sendRedirect("/TablaAlumnoCurso");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	
}
