<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <title>Carros</title>
</head>
<body>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    <h1>Adiciona Carro</h1>
    
    <form action="adicionaCarro" method="post">
    	Dono: <input type="text" name="nome" /><br/>
    	Modelo: <input type="text" name="modelo" /><br/>
    	Placa: <input type="text" name="letras" size="5" maxlength="3" /> 
    		- <input type="number" name="numeros" size="6" maxlength="4"/> <br/>
    	Ano: <input type="text" name="ano" /><br/>
    	<input type="submit" value="Salvar"/>
    </form>

<c:import url="footer.jsp"/>
</body>
</html>