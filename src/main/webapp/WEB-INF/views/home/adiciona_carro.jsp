<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Carros</title>
</head>
<body>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

	<h1>Adiciona Carro</h1>

	<form action="adicionaCarro" method="post" autocomplete="on">
		Dono: <input type="text" name="nome" placeholder="ex:Maggie Peyton" /><br /> 
		Modelo: <input type="text" name="modelo" placeholder="ex:Volkswagen Beetle"/><br /> 
		Placa: <input type="text" name="letras" placeholder="ABC" size="3" maxlength="3"
			style="text-transform: uppercase" /> - <input type="number" placeholder="0000" 
			name="numeros" min=1 max="9999" /> <br /> 
		Ano: <input	type="number" name="ano" placeholder="1970" min="1678" max="2019"/><br />
		<input type="submit" value="Salvar" />
	</form>

	<c:import url="footer.jsp" />
</body>
</html>