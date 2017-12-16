<%@page import="javax.servlet.descriptor.TaglibDescriptor"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="dao" class="br.com.caelum.desafio.jdbc.dao.CarroDao"/>
	<table>
		<c:forEach var="carro" items="${dao.lista}"/>
		<tr>
			<td>${carro.dono}</td>
			<td>${carro.modelo}</td>
			<td>${carro.letras}</td>
			<td>${carro.numeros}</td>
			<td>${carro.ano}</td>
		</tr>
	</table>
	<p>Hola</p>
</body>
</html>