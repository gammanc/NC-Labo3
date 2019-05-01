<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form</title>
</head>
<body>
	<table>
		<tr>
			<th>Nombre</th>
			<th>Apellido</th>
			<th>Fecha Nac</th>
			<th>Carrera</th>
			<th>Experiencia</th>
		</tr>
		<tr>
			<th>${student.name}</th>
			<th>${student.lastName}</th>
			<th>${student.bDate}</th>
			<th>${student.career}</th>
			<th>${student.experience}</th>
		</tr>
	</table>
</body>
</html>