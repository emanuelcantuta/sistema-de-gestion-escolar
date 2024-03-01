package monolitico.com.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import monolitico.com.servicios.AlumnoService;
import monolitico.com.servicios.AlumnoServiceImp;

@WebServlet(urlPatterns = { "/eliminarAlumno"})
public class EliminarAlumnoServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private AlumnoService alumnoService = new AlumnoServiceImp();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id = (String) req.getParameter("idalumno");
		int idAlumno = Integer.parseInt(id);

		try {	
			alumnoService.eliminar(idAlumno);	
		} catch (Exception e) {
			System.out.println("No mande ningun id a service :(");
		//	e.printStackTrace();
		}
	}

}
