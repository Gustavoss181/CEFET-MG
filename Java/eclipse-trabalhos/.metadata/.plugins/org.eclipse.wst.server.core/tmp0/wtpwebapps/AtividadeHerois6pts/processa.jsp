<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	footer{
		width: 100%;
		height: 50px;
		position: absolute;
		bottom: 0;
		background-color: gray;
		text-align: center;
	}
	img{
		height: 100px;
	}
	header{
		background-color: darkblue;
	}
	div{
		text-align: center;
	}
</style>
</head>
<body>

<%!//servlet servlet = new servlet(); %>

<%
	String nome, email, filme, franquia;
	nome = request.getParameter("nome");
	email = request.getParameter("email");
	filme = request.getParameter("filme");
	franquia = request.getParameter("franquia");
	
	if(filme.equals("Vingadores")){
		response.getWriter().append("<header><center><img src='vingadores.jpg'></center></header>");
	}else if(filme.equals("Liga")){
		response.getWriter().append("<header><center><img src='liga.jpg'></center></header>");
	}
	
	response.getWriter().append("<div><br><br><br><b>Nome: </b>" + nome + "<br>");
	response.getWriter().append("<b>Email: </b>" + email + "<br>");
	response.getWriter().append("<b>Filme: </b>" + filme + "<br>");
	response.getWriter().append("<b>Franquia: </b>" + franquia + "<br>");
	response.getWriter().append("<a href='http://localhost:8080/AtividadeHerois6pts/servidor?nome="+nome+"&nome="+nome+"&filme="+filme+"&franquia="+franquia+"'>Servlet</a></div>");
	
	if(franquia.equals("Marvel")){
		if(filme.equals("Vingadores"))
			response.getWriter().append("<footer>"+ nome +"</footer>");
		else if(filme.equals("Liga"))
			response.getWriter().append("<footer>"+ nome +", Liga é da DC</footer>");
	}else if(franquia.equals("DC")){
		if(filme.equals("Vingadores"))
			out.print("<footer>"+ nome +"Vingadores é da Marvel</footer>");
		else if(filme.equals("Liga"))
			out.print("<footer>"+ nome +"</footer>");
	}
%>

</body>
</html>