<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:ui="http://java.sun.com/jsf/facelets"
	xmlns:f="http://java.sun.com/jsf/core"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:c="http://java.sun.com/jsp/jstl/core">
<h:head>
	<title>Estacionamento</title>
</h:head>
<h:body>
	<table>

		<thead>
			<tr>Id</tr>
			<tr>Marca</tr>
			<tr>Modelo</tr>
			<tr>Cor</tr>
			<tr>Placa</tr>
			<tr>Tipo</tr>
		</thead>
		<tbody>
			<c:forEach>
				<tr>
					<td>${veiculo.id }</td>
					<td>${veiculo.marca }</td>
					<td>${veiculo.modelo }</td>
					<td>${veiculo.cor }</td>
					<td>${veiculo.placa }</td>
					<td>${veiculo.tipo }</td>				
				</tr>
			</c:forEach>
		</tbody>
	</table>

</h:body>
</html>