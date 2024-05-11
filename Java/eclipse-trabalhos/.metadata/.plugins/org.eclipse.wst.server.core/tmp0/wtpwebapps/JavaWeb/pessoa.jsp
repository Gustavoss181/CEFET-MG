<%@page import="DTO.PessoaDto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
	PessoaDto pessoa = new PessoaDto();
%>

<%
if(request.getParameter("nome") != null && request.getParameter("ident") != null){
	pessoa.setNome(request.getParameter("nome"));
	pessoa.setIdentidade(request.getParameter("ident"));
	pessoa.setCpf(request.getParameter("cpf"));
	pessoa.setTelefone(request.getParameter("tel"));
	pessoa.setCelular1(request.getParameter("cel1"));
	pessoa.setCelular2(request.getParameter("cel2"));
	pessoa.setEmail(request.getParameter("email"));
	pessoa.setDataNascimento(request.getParameter("dataNasc"));
}else{
%>
<form action="pessoa.jsp" method="get">
	<label>Nome:</label><input name="nome" type="text"><br>
	<label>Identidade:</label><input name="ident" type="text"><br>
	<label>Cpf:</label><input name="cpf" type="text"><br>
	<label>Telefone:</label><input name="tel" type="text"><br>
	<label>Celular 1:</label><input name="cel1" type="text"><br>
	<label>Celular 2:</label><input name="cel2" type="text"><br>
	<label>Email:</label><input name="email" type="text"><br>
	<label>Data de Aniversario:</label><input name="dataNasc" type="text"><br>
	<input type="submit" name="Enviar">
</form>
<% } %>
</body>
</html>