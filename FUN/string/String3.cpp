#include<stdlib.h>
#include<stdio.h>
#include<string.h>
main(){
	char nome[30],end[50],tel[15];
	
	printf("Digite seu nome: ");
	gets(nome);
	printf("Digite seu endereco: ");
	gets(end);
	printf("Digite seu telefone: ");
	gets(tel);
	printf("\nNome: %s\n", nome);
	printf("\nEndereco: %s\n", end);
	printf("\nTel: %s\n", tel);
	
	system("pause");
}
