package monolitico.com.controllers;

import monolitico.com.servicios.MateriaService;
import monolitico.com.servicios.MateriaServiceImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = { "/EditarMateria"})
public class EditarMateriaServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
	private MateriaService materiaService = new MateriaServiceImp();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = (String) req.getParameter("id_materia");
        String nombre = (String) req.getParameter("nombre");

        try {
            int idParseado = Integer.parseInt(id);

            materiaService.editar(idParseado,nombre);
            resp.sendRedirect("/TablaProfesorMateria");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }



    }

}
