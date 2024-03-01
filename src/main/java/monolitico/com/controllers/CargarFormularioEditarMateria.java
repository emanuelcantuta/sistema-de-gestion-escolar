package monolitico.com.controllers;

import monolitico.com.domain.Materia;
import monolitico.com.servicios.MateriaService;
import monolitico.com.servicios.MateriaServiceImp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = { "/cargarEditarMateriaForm"})
public class CargarFormularioEditarMateria extends HttpServlet {
    private static final long serialVersionUID = 1L;
	private MateriaService materiaService = new MateriaServiceImp();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = this.getServletContext().
                getRequestDispatcher("/editMateriaForm.jsp");

        String idMateria = req.getParameter("idMateria");
        int id = Integer.parseInt(idMateria);


        try {

            Materia mat = materiaService.buscarMateria(id);
            req.setAttribute("materia",mat);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        dispatcher.forward(req, resp);
    }

}
