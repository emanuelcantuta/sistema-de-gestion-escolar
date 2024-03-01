package monolitico.com.controllers;

import monolitico.com.servicios.MateriaService;
import monolitico.com.servicios.MateriaServiceImp;
import monolitico.com.servicios.ProfesorService;
import monolitico.com.servicios.ProfesorServiceImp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;
@WebServlet(urlPatterns = { "/TablaProfesorMateria"})
public class TablaProfesorMateriaServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
	private ProfesorService profesorService = new ProfesorServiceImp();
    private  MateriaService materiaService = new MateriaServiceImp();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	HttpSession misession = req.getSession(true);
		String usuario = (String) misession.getAttribute("usuario");
		
		if(usuario != null){	
	    	req.setAttribute("profesores",profesorService.listar());
	        req.setAttribute("materias",materiaService.listar());
	        RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/TablaProfesoresMateria.jsp");
	        dispatcher.forward(req, resp);
		}else {
			resp.sendRedirect("/login");
		}
    }
}
