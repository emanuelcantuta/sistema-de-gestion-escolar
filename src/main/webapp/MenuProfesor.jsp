<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% int cantidadAlumnos = (Integer) request.getAttribute("cantidadAlumnos");%>
    <% int cantidadCursos = (Integer) request.getAttribute("cantidadCursos");%>
    <% int cantidadProfesor = (Integer) request.getAttribute("cantidadProfesor");%>
    <% int cantidadMateria = (Integer) request.getAttribute("cantidadMateria");%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Menu Profesor</title>
    <link href="css/styleMenuTable.css" rel="stylesheet">
    <link href="css/botons.css" rel="stylesheet">
    <link href="css/menu.css" rel="stylesheet">
    <link href="css/main.css" rel="stylesheet">
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
                    <a href="">Profesor</a>
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
                        <li><a href="<%=request.getContextPath()%>/TablaAlumnos">Alumnos</a></li>
                        <li><a href="<%=request.getContextPath()%>/TablaProfesores">Profesores</a></li>
                    </ul>
                </li>
            </ul>
        </nav>
    </header>
<body>
    <main class="ReyContenedor">
        <div class="contenedor4">
            <div class="cajita" style="background-color:#dc3545;">
              <div class="inner">
                <h3><%=cantidadAlumnos %></h3>
                <p>Alumnos</p>
              </div>
            </div>
        </div>
        <div class="contenedor4">
            <div class="cajita" style="background-color:#28a745;">
              <div class="inner">
                <h3><%=cantidadProfesor %></h3>
                <p>Profesores</p>
              </div>
            </div>
        </div>   
        <div class="contenedor4">
            <div class="cajita" style="background-color: #17a2b8;">
              <div class="inner">
                <h3><%=cantidadCursos %></h3>
                <p>Cursos</p>
              </div>
            </div>
        </div>   
        <div class="contenedor4">
            <div class="cajita" style="background-color: #ffc107;">
              <div class="inner">
                <h3><%=cantidadMateria %></h3>
                <p>Materias</p>
              </div>
            </div>
        </div>
    </main>
</body>
</html>