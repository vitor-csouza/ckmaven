<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Detran</title>
</head>
<body>

<h2 style="text-align:center">Lista de Carros</h2>


	<c:forEach items="${carros}" var="itemList">
	<p style="text-align:center">
			${itemList.toString()}
			</p>
	</c:forEach>
	
	
</body>
</html>