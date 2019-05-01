<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Test</title>
</head>
<body>
	<h1>${message}</h1>
	
	<table>
		<tr>
			<th>Codigo</th>
			<th>Nombre</th>
			<th>Descripcion</th>
			<th>Precio</th>
			<th></th>
		</tr>
		<c:forEach items="${productList}" var="product">
			<tr>
				<th>${product.code}</th>
				<th>${product.name}</th>
				<th>${product.description}</th>
				<th><fmt:formatNumber value="${product.price}" type="currency"/></th>
				<c:if test = "${product.hasOffer}" >
					<th><p style="color:#FF0000";>OFERTA</p></th>
				</c:if>
			</tr>
		</c:forEach>
	</table>
	

	<!--<form action="${pageContext.request.contextPath}/formData" method="post">
		<label>Nombre: </label><input type="text" name="name"><br>
		<label>Apellido: </label><input type="text" name="lname"><br>
		<label>Fecha de nacimiento: </label><input type="text" name="bdate" placeholder="dd/mm/yyyy"><br>
		<label>Carrera: </label><input type="text" name="career"><br>
		<label>Experiencia: </label><input type="text" name="experience"><br>
		<input type="submit" value="Enviar">-->
	</form>
</body>
</html>