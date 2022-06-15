<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inicio</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">


<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.5/dist/umd/popper.min.js"
	integrity="sha384-Xe+8cL9oJa6tN/veChSP7q+mnSPaj5Bcu9mPX5F5xIGE0DVittaqT5lorf0EI7Vk"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.min.js"
	integrity="sha384-kjU+l4N0Yf4ZOJErLsIcvOU2qSb74wXpOhqTvwVx3OElZRweTnQ6d31fXEoRD1Jy"
	crossorigin="anonymous"></script>
<script
	type="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"></script>

</head>
<body>
	<div class="container">

		<%@include file="/View/Menu.jsp"%>

		<h1>Inicio</h1>

		<div class="accordion" id="accordionExample">
			<div class="accordion-item">
				<h2 class="accordion-header" id="headingOne">
					<button class="accordion-button" type="button"
						data-bs-toggle="collapse" data-bs-target="#collapseOne"
						aria-expanded="true" aria-controls="collapseOne">MiApp</button>
				</h2>
				
				<%-- Resumen --%>
				<div id="collapseOne" class="accordion-collapse collapse show"
					aria-labelledby="headingOne" data-bs-parent="#accordionExample">
					<div class="accordion-body">
						<strong><h2>App web creada con JEE.</h2><br>Apoyado
							del material en la plataforma de sustantiva, dando inicio a este
							pequeño vistazo a un proyecto:<br>
							<ul>
								<li>Una lista de Estudiantes.</li>
								<li>Actualizar los datos de cada Estudiante</li>
								<li>Eliminar Estudiantes</li>
								<li>Una lista de Facilitadores.</li>

							</ul>
						</strong>
					</div>
				</div>
			</div>

			<div class="accordion-item">

              <%-- Acceso rapido--%>
				<h2 class="accordion-header" id="headingTwo">
					<button class="accordion-button collapsed" type="button"
						data-bs-toggle="collapse" data-bs-target="#collapseTwo"
						aria-expanded="false" aria-controls="#collapseTwo">Acceso
						Rapido</button>
				</h2>
				<div id="collapseTwo" class="accordion-collapse collapse"
					aria-labelledby="collapseTwo" data-bs-parent="#accordionExample">
					<div class="accordion-body">
						<div class="card" style="float: left;">
							<img src="..." class="card-img-top" alt="...">
							<div class="card-body">
								<h5 class="card-title">Estudiante</h5>
								<p class="card-text">Agregar un Nuevo Estudiante.</p>
								<ul>
									<li>Rut</li>
									<li>Nombre</li>
									<li>Email</li>
									<li>Telefono</li>

								</ul>
								
								<a
									href="${pageContext.request.contextPath}/DetalleEstudianteServlet"
									class="btn btn-primary">Nuevo</a>
							</div>
						</div>
						<div class="card" style="float: left ;">
							<img src="..." class="card-img-top" alt="...">
							<div class="card-body">
								<h5 class="card-title">Facilitador</h5>
								<p class="card-text">Agregar un Nuevo Facilitador.</p>
								<ul>
									<li>Rut</li>
									<li>Nombre</li>
									<li>Email</li>
									<li>Telefono</li>
									<li>Valor por Hora</li>
									<li>Banco</li>
									<li>Cuenta de Banco</li>

								</ul>
								
								<a
									href="${pageContext.request.contextPath}/DetalleFacilitadorServlet"
									class="btn btn-primary">Nuevo</a>
							</div>
						</div>
						<div class="card" style="float: left;">
							<img src="..." class="card-img-top" alt="...">
							<div class="card-body">
								<h5 class="card-title">Facilitador</h5>
								<p class="card-text">Agregar un Nuevo Facilitador.</p>
								<ul>
									<li>Rut</li>
									<li>Nombre</li>
									<li>Email</li>
									<li>Telefono</li>

								</ul>
								
								<a
									href="${pageContext.request.contextPath}/DetalleEstudianteServlet"
									class="btn btn-primary">Nuevo</a>
							</div>
						</div>
					</div>
				</div>
			</div>
		
			
			
		</div>

	</div>


</body>
</html>