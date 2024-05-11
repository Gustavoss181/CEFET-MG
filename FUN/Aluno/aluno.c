#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "aluno.h"
#define a 10

void preencherAluno(Aluno aluno[]){
	int x;
	for(x=0;x<a;x++){
		printf("\nAluno %d\n", x+1);
		printf("Nome: ");
		fflush(stdin);
		scanf("%s", &aluno[x].nome);
		printf("Matricula: ");
		scanf("%d", &aluno[x].matri);
		printf("Idade: ");
		scanf("%f", &aluno[x].idade);
		printf("Nota: ");
		scanf("%f", &aluno[x].nota);
	}
}

void mostrarNomes(Aluno aluno[]){
	int x;
	
	printf("Nome dos alunos:\n");
	for(x=0;x<a;x++){
		printf("%s\n", aluno[x].nome);
	}
}

void acimaMedia(Aluno aluno[]){
	float media=0, mediaf;
	int x;
	
	for(x=0;x<a;x++){
		media+=aluno[x].nota;
	}
	mediaf=media/a;
	
	printf("Alunos acima da media:\n");
	for(x=0;x<a;x++){
		if(mediaf<=aluno[x].nota){
			printf("Nome: %s\n", aluno[x].nome);
			printf("Matricula: %d\n", aluno[x].matri);
		}
	}
}

void mediaIdade(Aluno aluno[]){
	int x;
	float media=0;
	
	for(x=0;x<a;x++){
		media+=aluno[x].idade;
	}
	printf("Media da idade da turma: %.2f", media/a);
}



































