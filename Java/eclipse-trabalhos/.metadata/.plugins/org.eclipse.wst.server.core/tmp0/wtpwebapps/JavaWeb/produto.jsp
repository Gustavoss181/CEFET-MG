<%@page import="DTO.ProdutoDto"%>
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
	ProdutoDto pessoa = new ProdutoDto();
%>

<%
if(request.getParameter("nome") != null && request.getParameter("idFor") != null){
	pessoa.setNomeProduto(request.getParameter("nome"));
	pessoa.setIdFornecedor(Integer.parseInt(request.getParameter("idFor")));
	pessoa.setIdCategoria(Integer.parseInt(request.getParameter("idCat")));
	pessoa.setQuantidadePorUnidade(request.getParameter("qtdUni"));
	pessoa.setPrecoUnitario(Double.parseDouble(request.getParameter("precoUni")));
	pessoa.setUnidadesEmEstoque(Integer.parseInt(request.getParameter("UniEst")));
	pessoa.setUnidadesEmOrdem(Integer.parseInt(request.getParameter("UniOrd")));
	pessoa.setNivelDeReposicao(Integer.parseInt(request.getParameter("NivelRep")));
	//pessoa.setNivelDeReposicao(request.getParameter("dataNasc"));
	if(request.getParameter("desc") == "1"){
		pessoa.setDescontinuado(true);
	}else{
		pessoa.setDescontinuado(false);
	}
}else{
%>
<form action="produto.jsp" method="get">
	<label>Nome do Produto:</label><input name="nome" type="text"><br>
	<label>Id do fornecedor:</label><input name="idFor" type="number"><br>
	<label>Id da categoria:</label><input name="idCat" type="number"><br>
	<label>Quantidade por unidade:</label><input name="qtdUni" type="text"><br>
	<label>Preço unitario:</label><input name="precoUni" type="text"><br>
	<label>Unidades em estoque:</label><input name="UniEst" type="number"><br>
	<label>Unidades em ordem:</label><input name="UniOrd" type="number"><br>
	<label>Nivel de reposição:</label><input name="NivelRep" type="text"><br>
	<label>Descontinuado?</label><br>
	<input name="desc" type="radio" value="1"><label>Sim</label><br>
	<input name="desc" type="radio" value="0"><label>Não</label><br>
	<input type="submit" name="Enviar">
</form>
<% } %>
</body>
</html>