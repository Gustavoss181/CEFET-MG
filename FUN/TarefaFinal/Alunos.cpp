#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int n;

typedef struct{
	char nome[30];
	float nota1, nota2, nota3, media;
}Alunos;

int Registrar(Alunos aluno[]){
	int i;
	for(i=0; i<n; i++){
		printf("\nDigite o nome do aluno %d: ", i+1);
		fflush(stdin);
		gets(aluno[i].nome);
		printf("digite a primeira nota de %s: ", aluno[i].nome);
		scanf("%f", &aluno[i].nota1);
		printf("digite a segunda nota de %s: ", aluno[i].nome);
		scanf("%f", &aluno[i].nota2);
		printf("digite a terceira nota de %s: ", aluno[i].nome);
		scanf("%f", &aluno[i].nota3);
	}
}

void Media(Alunos aluno[]){
	int i;
	
	for(i=0;i<n;i++){
		aluno[i].media=(aluno[i].nota1+aluno[i].nota2+aluno[i].nota3)/3;
	}
}

int Mostrar(Alunos aluno[]){
	int i;
	
	for(i=0; i<n; i++){
		printf("Nome: %s\n", aluno[i].nome);
		printf("Media: %.2f\n\n", aluno[i].media);
	}
}

void OrdenarNome(Alunos aluno[]){
	int i, j;
	Alunos aux;

	for (i = 1; i < n; i++) {
		for (j = 1; j < n; j++) {
			if (strcmp(aluno[j - 1].nome, aluno[j].nome) > 0) {
				aux=aluno[j - 1];
				aluno[j - 1]=aluno[j];
				aluno[j]=aux;
		}
		}
	}
}

void OrdenarNota(Alunos aluno[]){
	int i, j;
	Alunos aux;
	
	for(i=0;i<n-1;i++){
		for(j=1;j<n-i;j++){
			if(aluno[j].media>aluno[j-1].media){
				aux = aluno[j];
				aluno[j]=aluno[j-1];
				aluno[j-1]=aux;
			}
		}
	}
}

int main(){
	printf("Digite o numero de alunos na sala: ");
	scanf("%d", &n);
	
	Alunos aluno[n];
	int x=-1;
	Registrar(aluno);
	Media(aluno);
	system("cls");
	
	printf("Como quer ordenar os alunos?\n1 - Ordem alfabetica\n2 - Maior nota(media)\nOutro - Nao ordenar\n");
	scanf("%d", &x);
	
	if(x==1){
		OrdenarNome(aluno);
	}
	else if(x==2){
		OrdenarNota(aluno);
	}
	system("cls");
	
	Mostrar(aluno);
	
	system("pause");
}
