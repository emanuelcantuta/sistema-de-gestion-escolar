package monolitico.com.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import monolitico.com.servicios.UsuarioService;
import monolitico.com.servicios.UsuarioServiceImp;

@WebServlet(urlPatterns = { "/usuarioValidacion"})
public class ValidarUsuarioServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	UsuarioService usuarioService = new UsuarioServiceImp();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession misession=null;
		boolean existeUsuario;
		String usuario = (String) req.getParameter("usuario");
		String password = (String) req.getParameter("password");
		
		try {
			existeUsuario = usuarioService.login(usuario, password);
			if(existeUsuario) {
				misession = req.getSession(true);
				misession.setAttribute("usuario", usuario);
				resp.sendRedirect("/MenuAdmin");
			}else {
				usuarioService.verificarUsuario(usuario,password);
				misession = req.getSession(true);
				misession.setAttribute("usuario", usuario);
				resp.sendRedirect("/MenuProfesor");
			}
		} catch (Exception e) {
			req.setAttribute("mensajeError", e.getMessage());
			RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/pantallaError.jsp");
			rd.forward(req, resp);
		}
	
	}

	
	
	
}