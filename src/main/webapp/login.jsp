<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Login</title>
    <link rel="stylesheet" href="css/styleLogin.css">
</head>
<body> 
    <div class="contenedor-principal">
        <div class="cont-text" style="user-select: text">
            <div class="div-img">
                <img src="img/logoescudo.png"> 
            </div>
            <div class="div-text">
                <h3>Colegio Colegiales</h3>
            </div>
            <div class="div-text">
                <h3>Ingreso de Personal</h3>
            </div>
        </div>
        <form class="formulariologin" method="POST" action="usuarioValidacion?" autocomplete="off">
            <div class="div-input">
                <input class="controls" type="text" id="usuario" name="usuario" placeholder="Usuario" required>
                <input class="controls" type="password" id="contrasena" name="password" placeholder="Contraseña" required>
            </div>
            <div class="div-apoyo" style="user-select: text">
                <a class="botones" id="botonVolver" href="<%=request.getContextPath()%>/inicio">
                	<button type="button" style="display:contents">Volver</button>
                </a>
                <button class="botones">Guardar</button>
            </div>
        </form>
    </div>
</body>

<script>
    function mostrarContrasena0(){
    var tipo = document.getElementById("password");
    if(tipo.type == "password"){
          tipo.type = "text";
    }else{
          tipo.type = "password";
    }
   }
</script>

</html>