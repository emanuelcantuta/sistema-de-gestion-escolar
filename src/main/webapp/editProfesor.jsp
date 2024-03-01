<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 <%@page import="monolitico.com.domain.Profesor"%>
 <%@page import="java.util.List"%>
 <%@page import="monolitico.com.domain.Materia"%>
 
 <%Profesor profesor = (Profesor) request.getAttribute("profesor");%>
 <% List<Materia> materias = (List<Materia>) request.getAttribute("materias"); %>

<!DOCTYPE html>
  <html>
   <head>
      <meta charset="UTF-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">	 
	  <title>edicion de profesor</title>
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
                <h3>Actualizacion del Profesor</h3>
            </div>
        </div>
        <form class="formulariologin" action="<%=request.getContextPath()%>/editarProfesor" method="Post" autocomplete="off">
            <div class="div-input">
                <input class="controls" type="hidden"name="idProfesor" value="<%= profesor.getId_profesor()%>">
                <input class="controls" type="text" name="nombre" placeholder="Nombre del profesor" value="<%= profesor.getNombre()%>" required>
                <input class="controls" type="text" name="apellido" placeholder="Apellido profesor" value="<%= profesor.getApellido()%>" required>
                <select class="controls" name="curso_id" required>
                	<option selected value="<%=  profesor.getMateria_id() %>"> <%=materias.get((profesor.getMateria_id())-1).getNombre() %> </option>
               	<% for (int i = 0; i < materias.size(); i++) { %>
               		<% if(profesor.getMateria_id() != materias.get(i).getId_materia()){ %>
 						<option value="<%= materias.get(i).getId_materia()%>"> <%=materias.get(i).getNombre()%></option>
 					<%}%>
             	<%}%> 
				</select>
            </div>
            <div class="div-apoyo" style="user-select: text">
                <a type="button" class="botones" id="botonVolver" href="<%=request.getContextPath()%>/TablaProfesorMateria">Volver</a>
                <button class="botones">Actualizar</button>
            </div>
        </form>
    </div>
</body>
  </html>