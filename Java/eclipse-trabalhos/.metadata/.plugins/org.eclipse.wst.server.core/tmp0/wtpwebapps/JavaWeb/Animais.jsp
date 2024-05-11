<%@page import="animais.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

if(request.getParameter("tamanho") != null && request.getParameter("nome") != null){
	Cachorro cao;
	Gato gato;
	
	float tamanho = Float.parseFloat(request.getParameter("tamanho"));
	String nome = request.getParameter("nome");
	int tipo = Integer.parseInt(request.getParameter("tipo"));
	
	if(tipo==1) {
		int unha = Integer.parseInt(request.getParameter("unha"));
		cao = new Cachorro(tamanho, nome, unha);
		response.getWriter().append("Tipo: Cachorro<br>Nome: " + cao.getNome() +"<br>");
		response.getWriter().append("Tamanho: " + cao.getTamanho() +"<br>");
		response.getWriter().append("Unhas: " + cao.getUnhas() +"<br>");
		
		response.getWriter().append("<br>" + cao.andar() +"<br>");
	}else if(tipo==2) {
		int vidas = Integer.parseInt(request.getParameter("vida"));
		gato = new Gato(tamanho, nome, vidas);
		response.getWriter().append("Tipo: Gato<br>Nome: " + gato.getNome() +"<br>");
		response.getWriter().append("Tamanho: " + gato.getTamanho() +"<br>");
		response.getWriter().append("Vidas: " + gato.getVidas() +"<br>");
	}
}else{
%>
<form action="Animais.jsp" method="get">
	<label>Nome:</label><input name="nome" type="text"><br>
	<label>Tamanho:</label><input name="tamanho" type="text"><br>
	<label>Tipo de animal</label><br>
	<input name="tipo" type="radio" value="1"><label>Cachorro</label><br>
	<input name="tipo" type="radio" value="2"><label>Gato</label><br><br>
	<label>N° de unhas(para cachorro):</label><input name="unha" type="number"><br><br>
	<label>N° de vidas(para gato):</label><input name="vida" type="number"><br><br>
	<input type="submit" name="Enviar">
</form>
<%
}
%>

</body>
</html>





