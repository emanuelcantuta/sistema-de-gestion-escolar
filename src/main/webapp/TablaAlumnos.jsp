<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
        <%@page import="java.util.List"%>
        <%@page import="monolitico.com.domain.Alumno"%>
        <%@page import="monolitico.com.domain.Curso"%>
  <%
     List<Alumno> alumnos = (List<Alumno>) request.getAttribute("alumnos");
     List<Curso> cursos = (List<Curso>) request.getAttribute("cursos");
  %>
    
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
	 <script src="scripts/jquery/jquery-3.6.4.min.js" ></script> <!--javascript eliminar-->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Menu Profesor</title>
    <link href="css/styleMenuTable.css" rel="stylesheet">
    <link href="css/botons.css" rel="stylesheet">
    <link href="css/menu.css" rel="stylesheet">

</head>
 <header>
        <div class="escuela">
            <div class="imageEscuela">
                <img src="img/escudo.png">
            </div>
        </div>
        <div class="perfil">
            <div class="contenido">
                <div class="image">
                    <img src="img/contacto.png">
                </div>
                <div class="info">
                    <a href="<%=request.getContextPath()%>/MenuProfesor">Profesor</a>
                </div>
            </div>
        </div>
        <br>
        <form action="<%=request.getContextPath()%>/adios?" method="POST">
   		<button type="submit" class="botones" id="botonVolver">Cerrar Sesión</button>
   		</form>
        <nav>
        <br>
            <ul>
                <li><a>Tablas</a>
                    <ul style="--cantidad-items: 2">
                        <li><a href="">Alumnos</a></li>
                        <li><a href="<%=request.getContextPath()%>/TablaProfesores">Profesores</a></li>
                    </ul>
                </li>
            </ul>
        </nav>
    </header>
<body>
    <main id="main">
        <div>
            <div>
                <h2 style="text-align:center">Registro de Alumnos</h2>
            </div>
		    <table class="contenido-tabla">
				<thead>
				<tr>
					<th scope="col">Id</th>
					<th scope="col">Nombre</th>
					<th scope="col">Apellido</th>
					<th scope="col">Dni</th>
					<th scope="col">Curso</th>
				</tr>
				</thead>
				<tbody>
					<% for (int i = 0; i < alumnos.size(); i++) { %>
					<tr>
						<th><%=alumnos.get(i).getId_alumnos() %></th>
						<td><%=alumnos.get(i).getNombre() %></td>
						<td><%=alumnos.get(i).getApellido() %></td>
						<td><%=alumnos.get(i).getDni() %></td>
						<td><%=cursos.get((alumnos.get(i).getCurso_id())-1).getNivel() %>
                        <%=cursos.get((alumnos.get(i).getCurso_id())-1).getLetra() %></td>
					</tr>
				<%}%>
				</tbody>
			 </table> 
	   </div>
    </main>
</body>
</html>