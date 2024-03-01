/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.43
 * Generated at: 2023-07-12 00:38:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import monolitico.com.domain.Profesor;
import monolitico.com.domain.Materia;

public final class TablaProfesoresMateria_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("monolitico.com.domain.Profesor");
    _jspx_imports_classes.add("monolitico.com.domain.Materia");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("    \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("  ");

     List<Profesor> profesores = (List<Profesor>) request.getAttribute("profesores");
     List<Materia> materias = (List<Materia>) request.getAttribute("materias");
  
      out.write("\n");
      out.write("    \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("\t <script src=\"scripts/jquery/jquery-3.6.4.min.js\" ></script> <!--javascript eliminar-->\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Menu Admin</title>\n");
      out.write("    <link href=\"css/styleMenuTable.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/botons.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/menu.css\" rel=\"stylesheet\">\n");
      out.write("    \n");
      out.write("<script>\n");
      out.write("\n");
      out.write("$(function() {\n");
      out.write("    $(document).on('click', 'input[type=\"button\"]', function(event) {\n");
      out.write("       var id = this.id;\n");
      out.write("\n");
      out.write("\t\t$.ajax({\n");
      out.write("\t\t\turl : '/eliminarProfesor',\n");
      out.write("\t\t\tdata : {\n");
      out.write("\t\t\t\tidprofesor : id\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\tsuccess : function() {\n");
      out.write("\t\t\t\tlocation.reload();\n");
      out.write("\t\t\t},\n");
      out.write("            error : function(){\n");
      out.write("\t\t\t\tconsole.log(\"no envio :(\");\n");
      out.write("            }\n");
      out.write("\t\t});\n");
      out.write("    \n");
      out.write("    });\n");
      out.write("});\n");
      out.write("$(function() {\n");
      out.write("    $(document).on('click', 'input[type=\"button\"]', function(event) {\n");
      out.write("       var id = this.id;\n");
      out.write("\n");
      out.write("\t\t$.ajax({\n");
      out.write("\t\t\turl : '/eliminarMateria',\n");
      out.write("\t\t\tdata : {\n");
      out.write("\t\t\t\tidmateria : id\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\tsuccess : function() {\n");
      out.write("\t\t\t\tlocation.reload();\n");
      out.write("\t\t\t},\n");
      out.write("            error : function(){\n");
      out.write("\t\t\t\tconsole.log(\"no envio :(\");\n");
      out.write("            }\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("    });\n");
      out.write("});\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("    <header>\n");
      out.write("        <div class=\"escuela\">\n");
      out.write("            <div class=\"imageEscuela\">\n");
      out.write("                <img src=\"img/escudo.png\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"perfil\">\n");
      out.write("            <div class=\"contenido\">\n");
      out.write("                <div class=\"image\">\n");
      out.write("                    <img src=\"img/contacto.png\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"info\">\n");
      out.write("                    <a href=\"");
      out.print(request.getContextPath());
      out.write("/MenuAdmin\">Administrador</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <form action=\"");
      out.print(request.getContextPath());
      out.write("/adios?\" method=\"POST\">\n");
      out.write("   \t\t<button type=\"submit\" class=\"botones\" id=\"botonVolver\">Cerrar Sesión</button>\n");
      out.write("   \t\t</form>\n");
      out.write("        <nav>\n");
      out.write("        <br>\n");
      out.write("            <ul>\n");
      out.write("                <li><a>Tablas</a>\n");
      out.write("                    <ul style=\"--cantidad-items: 2\">\n");
      out.write("                        <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/TablaAlumnoCurso\" >Alumnos y Cursos</a></li>\n");
      out.write("                        <li><a href=\"\">Profesores y Materias</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("    </header>\n");
      out.write("<body>\n");
      out.write("    <main id=\"main\">\n");
      out.write("        <div>\n");
      out.write("            <div>\n");
      out.write("                <h2 style=\"text-align:center\">Registro de Profesores</h2>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                  <a href=\"");
      out.print( request.getContextPath() );
      out.write("/nuevoProfesor\" class=\"botones\">Nuevo Registro</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\t\t    <table class=\"contenido-tabla\">\n");
      out.write("\t\t\t\t<thead>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<th scope=\"col\">Id</th>\n");
      out.write("\t\t\t\t\t<th scope=\"col\">Nombre</th>\n");
      out.write("\t\t\t\t\t<th scope=\"col\">Apellido</th>\n");
      out.write("\t\t\t\t\t<th scope=\"col\">Dni</th>\n");
      out.write("\t\t\t\t\t<th scope=\"col\">Materia Id</th>\n");
      out.write("\t\t\t\t\t<th id=\"operaciones\">Modificar y Eliminar</th>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t</thead>\n");
      out.write("\t\t\t\t<tbody>\n");
      out.write("\t\t\t\t\t");
 for (int i = 0; i < profesores.size(); i++) { 
      out.write("\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<th>");
      out.print(profesores.get(i).getId_profesor());
      out.write("</th>\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(profesores.get(i).getNombre() );
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(profesores.get(i).getApellido() );
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(profesores.get(i).getDni() );
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(materias.get((profesores.get(i).getMateria_id())-1).getNombre());
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t<td>\n");
      out.write("                            <a class=\"botonesTab\" href =\"");
      out.print(request.getContextPath());
      out.write("/cargarEditarProfesorForm?idProfesor=");
      out.print(profesores.get(i).getId_profesor());
      out.write("\" >Editar</a>\n");
      out.write("                            <input class=\"botonesTab\" type=\"button\" id=\"");
      out.print(profesores.get(i).getId_profesor());
      out.write("\"  value =\"Eliminar\">\n");
      out.write("                        </td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t");
}
      out.write("\n");
      out.write("\t\t\t\t</tbody>\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<h2 style=\"text-align:center\">Registro de Materias</h2>\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t  <a href=\"");
      out.print( request.getContextPath() );
      out.write("/nuevoMateria\" class=\"botones\">Nuevo Registro</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<table class=\"contenido-tabla\">\n");
      out.write("\t\t\t<thead>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<th scope=\"col\">Id</th>\n");
      out.write("\t\t\t\t<th scope=\"col\">Nombre</th>\n");
      out.write("\t\t\t\t<th id=\"operaciones\">Modificar y Eliminar</th>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t</thead>\n");
      out.write("\t\t\t<tbody>\n");
      out.write("\t\t\t\t");
 for (int i = 0; i < materias.size(); i++) { 
      out.write("\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<th>");
      out.print(materias.get(i).getId_materia());
      out.write("</th>\n");
      out.write("\t\t\t\t\t<td>");
      out.print(materias.get(i).getNombre() );
      out.write("</td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<a class=\"botonesTab\" href =\"");
      out.print(request.getContextPath());
      out.write("/cargarEditarMateriaForm?idMateria=");
      out.print(materias.get(i).getId_materia());
      out.write("\" >Editar</a>\n");
      out.write("\t\t\t\t\t\t<input class=\"botonesTab\" type=\"button\" id=\"");
      out.print(materias.get(i).getId_materia());
      out.write("\"  value =\"Eliminar\">\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t");
}
      out.write("\n");
      out.write("\t\t\t</tbody>\n");
      out.write("\t\t</table>\n");
      out.write("\t</div>\n");
      out.write("    </main>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}