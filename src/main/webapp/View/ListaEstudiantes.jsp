<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<title>Lista de Estudiantes</title>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

<link rel="stylesheet"
	href="http://cdn.datatables.net/1.12.1/css/jquery.dataTables.min.css">

<script
	src="http://cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js"></script>

<script src="https://kit.fontawesome.com/4aae053731.js"
	crossorigin="anonymous"></script>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">





</head>
<body>

	<div class="container">

		<%@include file="/View/Menu.jsp"%>

		<h1>Lista Estudiantes</h1>
		<a href="${pageContext.request.contextPath}/DetalleEstudianteServlet?"
			class="btn btn-secundary">Crear Estudiante</a>

		<table id="tblEst" class="table">
			<thead class="table-dark">
				<tr>
					<th>Id</th>
					<th>Rut</th>
					<th>Nombre</th>
					<th>Email</th>
					<th>Telefono</th>
					<th>Accion</th>
				</tr>
			</thead>
			<tbody>

				<c:forEach var="Est" items="${estudiantes}">
					<tr>
						<td><c:out value="${Est.getId()}"></c:out></td>
						<td><c:out value="${Est.getRut()}"></c:out></td>
						<td><c:out value="${Est.getNombre()}"></c:out></td>
						<td><c:out value="${Est.getEmail()}"></c:out></td>
						<td><c:out value="${Est.getTelefono()}"></c:out></td>
						<td><a
							href="${pageContext.request.contextPath}/DetalleEstudianteServlet?id=${Est.getId()}"
							class="btn btn-secundary"><i class="fa-solid fa-user-pen"></i></a>

							<a
							href="${pageContext.request.contextPath}/DetalleEstudianteServlet?id=${Est.getId()}&op=del"
							class="btn btn-secundary"><i
								class="fa-solid fa-skull-crossbones"></i></a> 
								
							<a								
							href="${pageContext.request.contextPath}/DatosServlet?id=${Est.getId()}"
							class="btn btn-secundary"><i class="fa-solid fa-user-pen"></i></a>
						</td>
					</tr>

				</c:forEach>

			</tbody>

		</table>

	</div>

	<script>
		$(document).ready(function() {
			$('#tblEst').DataTable();
		});
	</script>


	<script
		type="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"></script>


	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.5/dist/umd/popper.min.js"
		integrity="sha384-Xe+8cL9oJa6tN/veChSP7q+mnSPaj5Bcu9mPX5F5xIGE0DVittaqT5lorf0EI7Vk"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.min.js"
		integrity="sha384-kjU+l4N0Yf4ZOJErLsIcvOU2qSb74wXpOhqTvwVx3OElZRweTnQ6d31fXEoRD1Jy"
		crossorigin="anonymous"></script>

</body>
</html>
