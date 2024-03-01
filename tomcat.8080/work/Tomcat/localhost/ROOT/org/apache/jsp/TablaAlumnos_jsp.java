/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.43
 * Generated at: 2024-03-01 03:38:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import monolitico.com.domain.Alumno;
import monolitico.com.domain.Curso;

public final class TablaAlumnos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("monolitico.com.domain.Alumno");
    _jspx_imports_classes.add("monolitico.com.domain.Curso");
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

      out.write("\r\n");
      out.write("    \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("  ");

     List<Alumno> alumnos = (List<Alumno>) request.getAttribute("alumnos");
     List<Curso> cursos = (List<Curso>) request.getAttribute("cursos");
  
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("\t <script src=\"scripts/jquery/jquery-3.6.4.min.js\" ></script> <!--javascript eliminar-->\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Menu Profesor</title>\r\n");
      out.write("    <link href=\"css/styleMenuTable.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/botons.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/menu.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write(" <header>\r\n");
      out.write("        <div class=\"escuela\">\r\n");
      out.write("            <div class=\"imageEscuela\">\r\n");
      out.write("                <img src=\"img/escudo.png\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"perfil\">\r\n");
      out.write("            <div class=\"contenido\">\r\n");
      out.write("                <div class=\"image\">\r\n");
      out.write("                    <img src=\"img/contacto.png\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"info\">\r\n");
      out.write("                    <a href=\"");
      out.print(request.getContextPath());
      out.write("/MenuProfesor\">Profesor</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <br>\r\n");
      out.write("        <form action=\"");
      out.print(request.getContextPath());
      out.write("/adios?\" method=\"POST\">\r\n");
      out.write("   \t\t<button type=\"submit\" class=\"botones\" id=\"botonVolver\">Cerrar Sesión</button>\r\n");
      out.write("   \t\t</form>\r\n");
      out.write("        <nav>\r\n");
      out.write("        <br>\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li><a>Tablas</a>\r\n");
      out.write("                    <ul style=\"--cantidad-items: 2\">\r\n");
      out.write("                        <li><a href=\"\">Alumnos</a></li>\r\n");
      out.write("                        <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/TablaProfesores\">Profesores</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("    </header>\r\n");
      out.write("<body>\r\n");
      out.write("    <main id=\"main\">\r\n");
      out.write("        <div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <h2 style=\"text-align:center\">Registro de Alumnos</h2>\r\n");
      out.write("            </div>\r\n");
      out.write("\t\t    <table class=\"contenido-tabla\">\r\n");
      out.write("\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th scope=\"col\">Id</th>\r\n");
      out.write("\t\t\t\t\t<th scope=\"col\">Nombre</th>\r\n");
      out.write("\t\t\t\t\t<th scope=\"col\">Apellido</th>\r\n");
      out.write("\t\t\t\t\t<th scope=\"col\">Dni</th>\r\n");
      out.write("\t\t\t\t\t<th scope=\"col\">Curso</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t");
 for (int i = 0; i < alumnos.size(); i++) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th>");
      out.print(alumnos.get(i).getId_alumnos() );
      out.write("</th>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(alumnos.get(i).getNombre() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(alumnos.get(i).getApellido() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(alumnos.get(i).getDni() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(cursos.get((alumnos.get(i).getCurso_id())-1).getNivel() );
      out.write("\r\n");
      out.write("                        ");
      out.print(cursos.get((alumnos.get(i).getCurso_id())-1).getLetra() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t </table> \r\n");
      out.write("\t   </div>\r\n");
      out.write("    </main>\r\n");
      out.write("</body>\r\n");
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
