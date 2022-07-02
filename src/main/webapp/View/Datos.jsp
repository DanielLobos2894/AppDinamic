<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<title>Datos Generales</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">



</head>
<body>

	<div class="container">
		<h1>Datos de alumno</h1>
	
	<form action="${pageContext.request.contextPath}/DatosServlet"
		method="post">

		<input type="hidden" name="id" id="id" value="${datos.getId()}">


		

		<div class="mb-3">
			<label for="formRut" class="form-label">RUT Estudiante</label>
			<input type="Text" class="form-control" name="rut" id="rut"
				placeholder="${datos.getRutE()}" value="${datos.getRutE()}">

		</div>
		<div class="mb-3">
			<label for="formNombre" class="form-label">Nombre Estudiante</label>
			<input type="Text" class="form-control" name="nombre" id="nombre"
				placeholder="${datos.getNombreE()}" value="${datos.getNombreE()}">

		</div>
		<div class="mb-3">
			<label for="formEmail" class="form-label">Email Estudiante</label> <input
				type="Text" class="form-control" name="email" id="email"
				placeholder="${datos.getEmailE()}" value="${datos.getEmailE()}">

		</div>
		<div class="mb-3">
			<label for="formTelefono" class="form-label">Telefono
				Estudiante</label> <input type="Text" class="form-control" name="telefono"
				id="telefono" placeholder="${datos.getTelefonoE()}"
				value="${datos.getTelefonoE()}">

		</div>
		<div class="mb-3">
			<label for="formTelefono" class="form-label">Fecha de
				Matricula Estudiante</label> <input type="Text" class="form-control"
				name="telefono" id="telefono" placeholder="${datos.getFechaM()}"
				value="${datos.getFechaM()}">


		</div>
		<div class="mb-3">
			<label for="formTelefono" class="form-label">Codigo de Curso</label>
			<input type="Text" class="form-control" name="telefono" id="telefono"
				placeholder="${datos.getCodigoC()}" value="${datos.getCodigoC()}">

		</div>
		<div class="mb-3">
			<label for="formTelefono" class="form-label">Nombre de Curso</label>
			<input type="Text" class="form-control" name="telefono" id="telefono"
				placeholder="${datos.getNombreC()}" value="${datos.getNombreC()}">

		</div>
		<div class="mb-3">
			<label for="formTelefono" class="form-label">Nombre de
				Facilitador</label> <input type="Text" class="form-control" name="telefono"
				id="telefono" placeholder="${datos.getNombreF()}"
				value="${datos.getNombreF()}">

		</div>
		<div class="mb-3">
			<label for="formEmail" class="form-label">Email Facilitador</label> <input
				type="Text" class="form-control" name="email" id="email"
				placeholder="${datos.getEmailF()}" value="${datos.getEmailF()}">

		</div>
		<div class="mb-3">
			<label for="formTelefono" class="form-label">Telefono
				Facilitador</label> <input type="Text" class="form-control" name="telefono"
				id="telefono" placeholder="${datos.getTelefonoF()}"
				value="${datos.getTelefonoF()}">

		</div>

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