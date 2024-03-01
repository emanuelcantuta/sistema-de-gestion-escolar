<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Instituto Colegiales</title>
  <link rel="stylesheet" type="text/css" href="css/styleIndex.css">
</head>
<body>
  <header>
    <a href="#inicio"><img src="img/escudo.png" alt="logoEscudo"></a>
  </header>
 
  <nav>
    <ul>
      <li><a href="#oferta-educativa">Oferta Educativa</a>
        <ul>
            <li><a href="#">Bachiller</a></li>
            <li><a href="#">Cursos ExtraEscolares</a></li>
        </ul>
      </li>
      <li><a href="#recursos">Recursos</a>
        <ul>
          <li><a href="#">Ambientales</a></li>
          <li><a href="#">Didacticos</a></li> 
        </ul>
      </li>
      <li><a href="#inicio">Inicio</a>
        <ul>
          <li><a href="#">Sobre Nosotros</a></li>
        </ul>
      </li>
      <li><a href="#contacto">Ubicacion y Contacto</a></li>
      <li><a href="<%=request.getContextPath()%>/login?">Login</a></li> <!-- redirrecion servlet login -->
    </ul>
  </nav>

  <div id="imgcostado">
    <img src="img/imgcostado.png" alt="costado">
  </div>
  <main>
      <div id="jumbotron">
        <img src="img/formacion.webp" alt="formacion">
      </div>
  </main>
  

  <section>
    <div id="mision"> 
      <div id="grid-1">
        <h2>Nuestra Misi�n</h2>
        <p>Somos una instituci�n privada y laica. </p>
        <p>Nos proponemos afianzar la educaci�n en un proceso permanente y transformador a trav�s del cual se vayan desarrollando las potencialidades del hombre como persona individual, socialmente integrada a la comunidad y esencialmente trascendente.</p>
        <br>
        <br>
        <p>A fines de alcanzar estas metas, el nuevo rol de la escuela en su relaci�n con la comunidad educativa, cuenta con Directivos, Docentes, Familia y Estudiantes que se comprometen con las funciones propias de una educaci�n transformadora, sobre la base de la solidaridad, el cooperativismo, la producci�n creativa y la coherencia, conduciendo la construcci�n de conocimientos escolares y cient�ficos con metodolog�as y t�cnicas de estudio variadas, que estimulen la formaci�n integral de los ni�os. Solamente as� se logra el ideal de persona y de educaci�n planteados que dan sentido a nuestra identidad como Instituci�n.</p>  
      </div>    
      <div id="grid-2">
        <div id="cuadradito">
          <img src="img/imgizq.png" alt="cuadrito">
        </div>
      </div>
    </div>
    
  </section>

  <footer>
    <div class="footer-container">
      <div class="footer-left">
        <h3>Nombre de la Instituci�n</h3>
        <p>Direcci�n de la Instituci�n</p>
        <p>Tel�fono: 123-456-7890</p>
        <p>Email: info@institucion.com</p>
      </div>
      <div class="footer-right">
        <a><img src="img/escudo.png" alt="logoEscudo"></a>
      </div>
    </div>
    <div class="footer-bottom">
      <b>&copy; Copyright 2023 Colegio Colegiales. Todos los derechos reservados.</b>
    </div>
  </footer>
</body>
</html>
 