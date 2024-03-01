<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
        <%@page import="java.util.List"%>
        <%@page import="monolitico.com.domain.Profesor"%>
        <%@page import="monolitico.com.domain.Materia"%>
  <%
     List<Profesor> profesores = (List<Profesor>) request.getAttribute("profesores");
     List<Materia> materias = (List<Materia>) request.getAttribute("materias");
  %>
    
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
	 <script src="scripts/jquery/jquery-3.6.4.min.js" ></script> <!--javascript eliminar-->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Menu Admin</title>
    <link href="css/styleMenuTable.css" rel="stylesheet">
    <link href="css/botons.css" rel="stylesheet">
    <link href="css/menu.css" rel="stylesheet">
    
<script>

$(function() {
    $(document).on('click', 'input[type="button"]', function(event) {
       var id = this.id;

		$.ajax({
			url : '/eliminarProfesor',
			data : {
				idprofesor : id
			},
			success : function() {
				location.reload();
			},
            error : function(){
				console.log("no envio :(");
            }
		});
    
    });
});
$(function() {
    $(document).on('click', 'input[type="button"]', function(event) {
       var id = this.id;

		$.ajax({
			url : '/eliminarMateria',
			data : {
				idmateria : id
			},
			success : function() {
				location.reload();
			},
            error : function(){
				console.log("no envio :(");
            }
		});

    });
});
    


</script>


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
                    <a href="<%=request.getContextPath()%>/MenuAdmin">Administrador</a>
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
                        <li><a href="<%=request.getContextPath()%>/TablaAlumnoCurso" >Alumnos y Cursos</a></li>
                        <li><a href="">Profesores y Materias</a></li>
                    </ul>
                </li>
            </ul>
        </nav>
    </header>
<body>
    <main id="main">
        <div>
            <div>
                <h2 style="text-align:center">Registro de Profesores</h2>
                <div class="row">
                  <a href="<%= request.getContextPath() %>/nuevoProfesor" class="botones">Nuevo Registro</a>
                </div>
            </div>
		    <table class="contenido-tabla">
				<thead>
				<tr>
					<th scope="col">Id</th>
					<th scope="col">Nombre</th>
					<th scope="col">Apellido</th>
					<th scope="col">Dni</th>
					<th scope="col">Materia Id</th>
					<th id="operaciones">Modificar y Eliminar</th>
				</tr>
				</thead>
				<tbody>
					<% for (int i = 0; i < profesores.size(); i++) { %>
					<tr>
						<th><%=profesores.get(i).getId_profesor()%></th>
						<td><%=profesores.get(i).getNombre() %></td>
						<td><%=profesores.get(i).getApellido() %></td>
						<td><%=profesores.get(i).getDni() %></td>
						<td><%=materias.get((profesores.get(i).getMateria_id())-1).getNombre()%></td>
						<td>
                            <a class="botonesTab" href ="<%=request.getContextPath()%>/cargarEditarProfesorForm?idProfesor=<%=profesores.get(i).getId_profesor()%>" >Editar</a>
                            <input class="botonesTab" type="button" id="<%=profesores.get(i).getId_profesor()%>"  value ="Eliminar">
                        </td>
					</tr>
				<%}%>
				</tbody>
			</table>
		<div>
			<h2 style="text-align:center">Registro de Materias</h2>
			<div class="row">
			  <a href="<%= request.getContextPath() %>/nuevoMateria" class="botones">Nuevo Registro</a>
			</div>
		</div>
		<table class="contenido-tabla">
			<thead>
			<tr>
				<th scope="col">Id</th>
				<th scope="col">Nombre</th>
				<th id="operaciones">Modificar y Eliminar</th>
			</tr>
			</thead>
			<tbody>
				<% for (int i = 0; i < materias.size(); i++) { %>
				<tr>
					<th><%=materias.get(i).getId_materia()%></th>
					<td><%=materias.get(i).getNombre() %></td>
					<td>
						<a class="botonesTab" href ="<%=request.getContextPath()%>/cargarEditarMateriaForm?idMateria=<%=materias.get(i).getId_materia()%>" >Editar</a>
						<input class="botonesTab" type="button" id="<%=materias.get(i).getId_materia()%>"  value ="Eliminar">
					</td>
				</tr>
			<%}%>
			</tbody>
		</table>
	</div>
    </main>
</body>
</html>