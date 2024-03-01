
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 

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
                <h3>Nuevo Registro de Materia</h3>
            </div>
        </div>
        <form class="formulariologin" action="<%= request.getContextPath() %>/agregarMateria" method="Post" autocomplete="off">
            <div class="div-input">
                <input class="controls" type="text" name="nombre" placeholder="Nombre Materia" required>
            </div>
            <div class="div-apoyo" style="user-select: text">
                <a type="button" class="botones" id="botonVolver" href="<%=request.getContextPath()%>/TablaAlumnoCurso">Volver</a>
                <button class="botones">Guardar</button>
            </div>
        </form>
    </div>
</body>
</html>