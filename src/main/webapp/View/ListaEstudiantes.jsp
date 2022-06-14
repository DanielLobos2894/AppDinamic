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

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">

<link rel="stylesheet"
	href="http://cdn.datatables.net/1.12.1/css/jquery.dataTables.min.css">


</head>
<body>

	<div class="container">

		<%@include file="/View/Menu.jsp"%>

		<h1>Lista Estudiantes</h1>

		<table id="tblEst" class="table">
			<thead class="table-dark">
				<tr>
					<th>Id</th>
					<th>Rut</th>
					<th>Nombre</th>
					<th>Email</th>
					<th>Telefono</th>
				</tr>
			</thead>
			<tbody>

				<c:forEach var="Est" items="${estudiantes}">
					<tr>
						<td><a href="${pageContext.request.contextPath}/DetalleEstudianteServlet?id=${Est.getId()}"><c:out value="${Est.getId()}"></c:out></a></td>
						<td><c:out value="${Est.getRut()}"></c:out></td>
						<td><c:out value="${Est.getNombre()}"></c:out></td>
						<td><c:out value="${Est.getEmail()}"></c:out></td>
						<td><c:out value="${Est.getTelefono()}"></c:out></td>
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
		src="http://cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js"></script>

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