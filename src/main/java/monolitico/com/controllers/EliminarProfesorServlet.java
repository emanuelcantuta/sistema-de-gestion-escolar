package monolitico.com.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import monolitico.com.servicios.ProfesorService;
import monolitico.com.servicios.ProfesorServiceImp;

@WebServlet(urlPatterns = { "/eliminarProfesor"})
public class EliminarProfesorServlet extends HttpServlet {

	private ProfesorService profesorService = new ProfesorServiceImp();
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String id =(String)req.getParameter("idprofesor");
			int idProfesor = Integer.parseInt(id);
			profesorService.eliminar(idProfesor);
			//resp.sendRedirect("/listadoProfesores");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
