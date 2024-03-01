package monolitico.com.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import monolitico.com.servicios.ProfesorService;
import monolitico.com.servicios.ProfesorServiceImp;

@WebServlet(urlPatterns = { "/editarProfesor"})
public class EditarProfesorServlet extends HttpServlet{

	private ProfesorService profesorService = new ProfesorServiceImp();
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = (String) req.getParameter("idProfesor");
		String nombre = (String) req.getParameter("nombre");
		String apellido = (String) req.getParameter("apellido");
		String materiaId = (String) req.getParameter("materiaId");
		try {
			int idParseado = Integer.parseInt(id);
			String nombreParseado =(nombre);
			String apellidoParseado = (apellido);
			int idMateriaParseado = Integer.parseInt(materiaId);
			profesorService.editar(idParseado,nombreParseado, apellidoParseado,idMateriaParseado);
			resp.sendRedirect("/TablaProfesorMateria");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	
	
}
