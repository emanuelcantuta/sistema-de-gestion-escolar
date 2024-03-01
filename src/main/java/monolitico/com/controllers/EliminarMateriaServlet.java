package monolitico.com.controllers;

import monolitico.com.servicios.MateriaService;
import monolitico.com.servicios.MateriaServiceImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = { "/eliminarMateria"})
public class EliminarMateriaServlet extends HttpServlet {

    MateriaService materiaService = new MateriaServiceImp();
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String id = (String) req.getParameter("idmateria");
        int idMateria = Integer.parseInt(id);

        try {
            materiaService.eliminar(idMateria);
        } catch (Exception e) {
            System.out.println("No mande ningun id a service :(");
            //	e.printStackTrace();
        }
    }
}
