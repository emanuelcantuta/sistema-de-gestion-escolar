package monolitico.com.controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = { "/adios"})

public class CerrarSessionServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

	@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession misession = req.getSession();
        if(misession != null){
        	misession.invalidate();
        	resp.sendRedirect("/inicio");
        }   
    }
}
