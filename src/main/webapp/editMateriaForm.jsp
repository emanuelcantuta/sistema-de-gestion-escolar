<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 <%@page import="monolitico.com.domain.Materia"%>
 <%
Materia materia = (Materia) request.getAttribute("materia");

%>

<!DOCTYPE html>
  <html>
   <head>
      <meta charset="UTF-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">	 
	  <title>Edicion de Materia</title>
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
                <h3>Actualizacion del Curso</h3>
            </div>
        </div>
        <form class="formulariologin" action="<%=request.getContextPath()%>/EditarMateria" method="Post" autocomplete="off">
            <div class="div-input">
                <input class="controls" type="hidden"name="id_materia" value="<%= materia.getId_materia()%>">
                <input class="controls" type="text" name="nombre" placeholder="nombre de la materia" value="<%= materia.getNombre()%>" required>
            </div>
            <div class="div-apoyo" style="user-select: text">
                <a type="button" class="botones" id="botonVolver" href="<%=request.getContextPath()%>/TablaAlumnoCurso">Volver</a>
                <button class="botones">Actualizar</button>
            </div>
        </form>
    </div>
</body>
  </html>