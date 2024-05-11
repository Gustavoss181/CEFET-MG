<%@page import="servlet.servlet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%!servlet servlet = new servlet(); %>

<%
if(request.getParameter("nome") != null && request.getParameter("email") != null){
	String nome, email;
	nome = request.getParameter("nome");
	email = request.getParameter("email");
	int filme = Integer.parseInt(request.getParameter("filme"));
	int franquia = Integer.parseInt(request.getParameter("franquia"));
	
	if(filme == 1){
		response.getWriter().append("<header><center><img src='vingadores.jpg' style='width: 100%; height: 100px'></center></header>");
	}else{
		response.getWriter().append("<header><center><img src='liga.jpg' style='width: 100%; height: 100px'></center></header>");
	}
	response.getWriter().append("Nome: " + nome);
	response.getWriter().append("<br>Email: " + email + "<br><br>");
	
	if(franquia == 1){
		if(filme == 1)
			response.getWriter().append("<footer>Vingadores</footer>");
		else
			response.getWriter().append("<footer>Liga é da DC</footer>");
	}else if(franquia == 2){
		if(filme == 1)
			out.print("<footer>Vingadores é da Marvel</footer>");
		else
			out.print("<footer>Liga</footer>");
	}
}
%>


</body>
</html>