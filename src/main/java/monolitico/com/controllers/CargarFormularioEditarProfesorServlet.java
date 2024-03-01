package monolitico.com.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import monolitico.com.domain.Profesor;
import monolitico.com.servicios.MateriaService;
import monolitico.com.servicios.MateriaServiceImp;
import monolitico.com.servicios.ProfesorService;
import monolitico.com.servicios.ProfesorServiceImp;

@WebServlet(urlPatterns = { "/cargarEditarProfesorForm"})
public class CargarFormularioEditarProfesorServlet extends HttpServlet{

	private ProfesorService profesorService = new ProfesorServiceImp();
	private MateriaService materiaService = new MateriaServiceImp();
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = this.getServletContext().
				getRequestDispatcher("/editProfesor.jsp");
		
		String idProfesor = req.getParameter("idProfesor");
		int id = Integer.parseInt(idProfesor);


		try {
			
			Profesor prof = profesorService.buscarProfesor(id);
			req.setAttribute("profesor",prof);
			req.setAttribute("materias",materiaService.listar());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		dispatcher.forward(req, resp);
	}

	
	
}
