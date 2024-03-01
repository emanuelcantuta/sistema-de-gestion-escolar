<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
        String mensajeError = (String) request.getAttribute("mensajeError");
    %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Error</title>
    <link rel="stylesheet" href="css/Error.css">
<script type="text/javascript">
setTimeout(function() {
  window.history.back();
}, 3000);
</script>
</head>
<body>
    <div class="centro">
        <div class="img"></div>
        <div class="cont-letter">
            <h2>Oops!!</h2>
            <h4><%= mensajeError %></h4>
        </div>
    </div>
</body>
</html>