package monolitico.com.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import monolitico.com.domain.Profesor;
import monolitico.com.servicios.ProfesorService;
import monolitico.com.servicios.ProfesorServiceImp;

@WebServlet(urlPatterns = { "/agregarProfesor"})
public class AgregarProfesorServlet extends HttpServlet{

	private ProfesorService profesorService = new ProfesorServiceImp();
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


		String nombre = (String)req.getParameter("nombre");
		String apellido = (String)req.getParameter("apellido");
		String dni = (String)req.getParameter("dni");
		String materiaId = (String)req.getParameter("materiaId");
		
		
		Profesor nuevoProfesor = new Profesor();
		nuevoProfesor.setNombre(nombre);
		nuevoProfesor.setApellido(apellido);
		nuevoProfesor.setDni(Integer.parseInt(dni));
		nuevoProfesor.setMateria_id(Integer.parseInt(materiaId));
		
		try {
			profesorService.agregarProfesor(nuevoProfesor.getNombre(), nuevoProfesor.getApellido(),nuevoProfesor.getDni(),nuevoProfesor.getMateria_id());

		} catch (Exception e1) {
			//redirigir a otra pagina error
			//si el producto existe tambien redirigir

		} 
		
		resp.sendRedirect("/TablaProfesorMateria");

	}

}
