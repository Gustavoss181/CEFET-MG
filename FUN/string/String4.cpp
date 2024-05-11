#include<stdlib.h>
#include<stdio.h>
#include<string.h>
main(){
	char nome[30],sexo[10];
	int idade;
	
	printf("Digite seu nome: ");
	gets(nome);
	printf("Digite seu sexo(M ou F): ");
	gets(sexo);
	printf("Digite sua idade: ");
	scanf("%d",&idade);
	
	if(strcmp(sexo,'f')==0 && idade<25){
		printf("%s",nome);
		printf("ACEITO");
	}
	else {
		printf("%s",nome);
		printf("NAO ACEITO")
	}
	system("pause");
}
