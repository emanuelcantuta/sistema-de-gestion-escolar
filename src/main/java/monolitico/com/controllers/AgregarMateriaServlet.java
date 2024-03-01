package monolitico.com.controllers;

import monolitico.com.domain.Materia;
import monolitico.com.servicios.MateriaServiceImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import monolitico.com.servicios.MateriaService;
@WebServlet(urlPatterns = { "/agregarMateria"})
public class AgregarMateriaServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
	private MateriaService materiaService = new MateriaServiceImp();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String nombre = req.getParameter("nombre");

        Materia materia = new Materia();

        materia.setNombre(nombre);

        try {
            materiaService.agregarMateria(materia.getNombre());
        } catch (Exception e) {

        }
        resp.sendRedirect("/TablaProfesorMateria");
    }
}
