<!DOCTYPE html>
<html>
<head>
	<title></title>
	<link rel="stylesheet" type="text/css" href="../css/velha.css">
</head>
<body>
<center>
	<div id="tabela">
		<button onclick="criarTabela()">mostrar tabela</button>
	</div>
	<div id="teste"></div>
</center>
<script>
	var tabu;

	var tabela = new Array(3);
	for(var i=0; i < 3; i++) {
		tabela[i] = new Array(3);
	}


	function criarTabela(){
		tabu="<table>";
		for(var i=0;i<3;i++){
			tabu+="<tr>";
			for(var j=0;j<3;j++){
				tabu+="<td id='"+i+j+"'><div class='img' onclick='jogo("+i+","+j+")'></div></td>";
				tabela[i][j]=0;
			}
			tabu+="</tr>";
		}
		tabu+="</table>";
		document.getElementById("tabela").innerHTML = tabu;
	}

	function jogo(x,y){
		if(img<8){		
			if (img%2==0) {
				document.getElementById(cont).innerHTML = "<img src='../imagens/1.jpg'>";
				tabela[x][y]=1;
			}
			else{
				document.getElementById(cont).innerHTML = "<img src='../imagens/4.jpg'>";
				tabela[x][y]=4;
			}
			img++;
			
		}else{
			document.getElementById("teste").innerHTML = "Deu velha";
		}
	}

</script>

</body>
</html>