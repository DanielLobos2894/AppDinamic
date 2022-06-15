<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<title>Detalle Facilitador</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">



</head>
<body>

	<div class="container">
		<h1>Detalle Facilitador</h1>


		<form
			action="${pageContext.request.contextPath}/DetalleFacilitadorServlet"
			method="post">

			<input type="hidden" name="id" id="id" value="${facilitador.getId()}">
		

			<div class="mb-3">
				<label for="formRut" class="form-label">Rut</label> <input
					type="text" class="form-control" name="rut" id="Rut"
					placeholder="${facilitador.getRut()}"
					value="${facilitador.getRut()}">

			</div>

			<div class="mb-3">
				<label for="formNombre" class="form-label">Nombre</label> <input
					type="Text" class="form-control" name="nombre" id="nombre"
					placeholder="${facilitador.getNombre()}"
					value="${facilitador.getNombre()}">

			</div>
			<div class="mb-3">
				<label for="formEmail" class="form-label">Email</label> <input
					type="Text" class="form-control" name="email" id="email"
					placeholder="${facilitador.getEmail()}"
					value="${facilitador.getEmail()}">

			</div>
			<div class="mb-3">
				<label for="formTelefono" class="form-label">Telefono</label> <input
					type="Text" class="form-control" name="telefono" id="telefono"
					placeholder="${facilitador.getTelefono()}"
					value="${facilitador.getTelefono()}">

			</div>
			<div class="mb-3">
				<label for="formValorhora" class="form-label">Valor por hora</label> <input
					type="Text" class="form-control" name="valorhora" id="valorhora"
					placeholder="${facilitador.getValorhora()}"
					value="${facilitador.getValorhora()}">

			</div>
			<div class="mb-3">
				<label for="formBanco" class="form-label">Banco</label> <input
					type="Text" class="form-control" name="banco" id="banco"
					placeholder="${facilitador.getBanco()}"
					value="${facilitador.getBanco()}">

			</div>
			<div class="mb-3">
				<label for="formCtabanco" class="form-label">ctabancaria</label> <input
					type="Text" class="form-control" name="ctabancaria" id="ctabancaria"
					placeholder="${facilitador.getCtabancaria()}"
					value="${facilitador.getCtabancaria()}">

			</div>

			<button type="submit" class="btn btn-primary">Guardar</button>
		</form>


	</div>




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
</body>
</html>