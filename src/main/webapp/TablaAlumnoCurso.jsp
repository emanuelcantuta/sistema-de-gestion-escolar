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
    <title>Menu Admin</title>
    <link href="css/styleMenuTable.css" rel="stylesheet">
    <link href="css/botons.css" rel="stylesheet">
    <link href="css/menu.css" rel="stylesheet">
    
<script>

$(function() {
    $(document).on('click', 'input[type="button"]', function(event) {
       var id = this.id;

		$.ajax({
			url : '/eliminarAlumno',
			data : {
				idalumno : id
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
    $(document).on('click', 'input[type="submit"]', function(event) {
       var id = this.id;

		$.ajax({
			url : '/eliminarCurso',
			data : {
				idcurso : id
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
                        <li><a href="">Alumnos y Cursos</a></li>
                        <li><a href="<%=request.getContextPath()%>/TablaProfesorMateria">Profesores y Asignaturas</a></li>
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
                <div class="row">
                  <a href="<%= request.getContextPath() %>/nuevoAlumno" class="botones">Nuevo Registro</a>
                </div>
            </div>
		    <table class="contenido-tabla">
				<thead>
				<tr>
					<th scope="col">Id</th>
					<th scope="col">Nombre</th>
					<th scope="col">Apellido</th>
					<th scope="col">Dni</th>
					<th scope="col">Curso Id</th>
					<th id="operaciones">Modificar y Eliminar</th>
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
						<td>
							<a class="botonesTab" href ="<%=request.getContextPath()%>/editarAlumnoForm?idAlumno=<%=alumnos.get(i).getId_alumnos()%>" >Editar</a>
							<input class="botonesTab" type="button" id="<%=alumnos.get(i).getId_alumnos()%>"  value ="Eliminar">
						</td>
					</tr>
				<%}%>
				</tbody>
			 </table>
		 
	         <div>
                <h2 style="text-align:center">Registro de Cursos</h2>
                <div class="row">
                  <a href="<%= request.getContextPath() %>/nuevoCurso" class="botones">Nuevo Registro</a>
                </div>
              </div>
		    <table class="contenido-tabla">
				<thead>
				<tr>
					<th scope="col">Id</th>
					<th scope="col">Nivel</th>
					<th scope="col">Letra</th>
					<th id="operaciones">Modificar y Eliminar</th>
				</tr>
				</thead>
				<tbody>
					<% for (int i = 0; i < cursos.size(); i++) { %>
					<tr>
						<th><%=cursos.get(i).getId_curso() %></th>
						<td><%=cursos.get(i).getNivel() %></td>
						<td><%=cursos.get(i).getLetra() %></td>
						<td>
							<a class="botonesTab" href ="<%=request.getContextPath()%>/editarCursoForm?idCurso=<%=cursos.get(i).getId_curso()%>">Editar</a>
							<input class="botonesTab" type="submit" id="<%=cursos.get(i).getId_curso()%>"  value="Eliminar">
						</td>
					</tr>
				<%}%>
				</tbody>
			 </table>	 
      	</div>
    </main>
</body>
</html>