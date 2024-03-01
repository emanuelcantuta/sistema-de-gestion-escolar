<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 <%@page import="monolitico.com.domain.Alumno"%>
 <%@page import="java.util.List"%>
 <%@page import="monolitico.com.domain.Curso"%>
 
 <% Alumno alumno = (Alumno) request.getAttribute("alumno"); %>
 
 <% List<Curso> cursos = (List<Curso>) request.getAttribute("cursos"); %>

<!DOCTYPE html>
  <html>
   <head>
      <meta charset="UTF-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">	 
	  <title>edicion de alumno</title>
      <link rel="stylesheet" href="css/styleForm.css">
      <link href="css/botons.css" rel="stylesheet">
	</head>
  <body>
    <div class="contenedor-principal">
        <div class="cont-text" style="user-select: text">
            <div class="div-text">
                <h3>Colegio Colegiales</h3>
            </div>
            <div class="div-text">
                <h3>Actualizacion del Alumno</h3>
            </div>
        </div>
        <form class="formulariologin" action="<%=request.getContextPath()%>/editarAlumno?" method="Post" autocomplete="off">
            <div class="div-input">
                <input class="controls" type="hidden"name="id_alumnos" value="<%= alumno.getId_alumnos()%>">
                <input class="controls" type="text" name="nombre" placeholder="Nombre del alumno" value="<%= alumno.getNombre()%>" required>
                <input class="controls" type="text" name="apellido" placeholder="Apellido Alumno" value="<%= alumno.getApellido()%>" required>
                <select class="controls" name="curso_id" required>
                	<option selected value="<%=  alumno.getCurso_id() %>"> <%=cursos.get((alumno.getCurso_id())-1).getNivel() %>
                        <%=cursos.get((alumno.getCurso_id())-1).getLetra() %> </option>
               	<% for (int i = 0; i < cursos.size(); i++) { %>
               		<% if(alumno.getCurso_id() != cursos.get(i).getId_curso()){ %>
 						<option value="<%= cursos.get(i).getId_curso()%>"> <%=cursos.get(i).getNivel()%> <%=cursos.get(i).getLetra()%> </option>
 					<%}%>
             	<%}%> 
				</select>
            </div>
            <div class="div-apoyo" style="user-select: text">
                <a type="button" class="botones" id="botonVolver" href="<%=request.getContextPath()%>/MenuAdmin">Volver</a>
                <button class="botones">Actualizar</button>
            </div>
        </form>
    </div>
</body>
  </html>