
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

    <%@page import="java.util.List"%>
    <%@page import="monolitico.com.domain.Curso"%>
  <%
     List<Curso> cursos = (List<Curso>) request.getAttribute("cursos");
  %>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="css/styleForm.css" rel="stylesheet">
    <link href="css/botons.css" rel="stylesheet">
    <title>Nuevo Registro de Alumno</title>
</head>
<body>
    <div class="contenedor-principal">
        <div class="cont-text" style="user-select: text">
            <div class="div-text">
                <h3>Colegio Colegiales</h3>
            </div>
            <div class="div-text">
                <h3>Nuevo Registro de Alumno</h3>
            </div>
        </div>
        <form class="formulariologin" action="<%= request.getContextPath() %>/agregarAlumno" method="Post" autocomplete="off">
            <div class="div-input">
                <input class="controls" type="text" name="nombre" placeholder="Nombre Alumno" required>
                <input class="controls" type="text" name="apellido" placeholder="Apellido Alumno" required>
                <input class="controls" type="number" name="dni" placeholder="DNI Alumno" required>
                <select class="controls" name="curso_id" required>
                	<option selected disabled> Selecciona el Curso </option>
               	<% for (int i = 0; i < cursos.size(); i++) { %>
 					<option value="<%= cursos.get(i).getId_curso()%>"> <%=cursos.get(i).getNivel()%> <%=cursos.get(i).getLetra()%> </option>
             	<%}%> 
				</select>
            </div>
            <div class="div-apoyo" style="user-select: text">
                <a type="button" class="botones" id="botonVolver" href="<%=request.getContextPath()%>/TablaAlumnoCurso">Volver</a>
                <button class="botones">Guardar</button>
            </div>
        </form>
    </div>
</body>
</html>