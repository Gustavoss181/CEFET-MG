#include <stdio.h>
#include <stdlib.h>
main()
{
	int idade=4, serie, qLivros, red, qAlunos=0,qLivrosA=0;
	
	while(idade!=0 || serie!=0){
	printf("escreva a idade e a serie(1, 2, 3, 4) do aluno\n");
	scanf("%d %d",&idade,&serie);
	if (serie==1){
		printf("escreva a quantidade de livros que le por mes e se gosta de redacao(sim=1 e nao=0)\n");
		scanf("%d %d",&qLivros,&red);
		}
	else if (serie==2){
		printf("escreva a quantidade de livros que le por mes e se gosta de redacao(sim=1 e nao=0)\n");
		scanf("%d %d",&qLivros,&red);
		}
	else if (serie==3){
		printf("escreva a quantidade de livros que le por mes e se gosta de redacao(sim=1 e nao=0)\n");
		scanf("%d %d",&qLivros,&red);
		qAlunos=qAlunos+1;
		}
	else if (serie==4){
		printf("escreva a quantidade de livros que le por mes e se gosta de redacao(sim=1 e nao=0)\n");
		scanf("%d %d",&qLivros,&red);
			if(qLivros>qLivrosA)
			qLivrosA=qLivros;
	else
		printf("serie invalida\n");
		}
	}
printf("o numero de alunos da terceira serie eh %d\n",qAlunos);
printf("a maior quantidade de livros lidos na quarta serie eh %d\n",qLivrosA);
}
