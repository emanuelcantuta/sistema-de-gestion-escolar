package monolitico.com.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import monolitico.com.domain.Curso;
import monolitico.com.servicios.CursoService;
import monolitico.com.servicios.CursoServiceImp;

@WebServlet(urlPatterns = { "/agregarCurso"})

public class AgregarCursoServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	CursoService cursoService = new CursoServiceImp();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String nivel = (String)req.getParameter("nivel");
		String letra = (String)req.getParameter("letra");
		
		Curso nuevoCurso = new Curso();
		nuevoCurso.setNivel(Integer.parseInt(nivel));
		nuevoCurso.setLetra(letra.charAt(0));
		
		try {
			cursoService.agregarCurso(nuevoCurso.getNivel(), nuevoCurso.getLetra());
		} catch (Exception e1) {
			//cascd
		} 
		resp.sendRedirect("/TablaAlumnoCurso");	
	}
}
