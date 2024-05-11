#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "pessoa.h"

void preencherPessoa(Pessoa pessoa[]){
int idade, x;
for (x=0; x<5; x++){
	fflush(stdin);
	printf("Digite o nome da pessoa %d\n", x+1);
	scanf("%s",&pessoa[x].nome);
	fflush(stdin);
	printf("Digite o cpf da pessoa %d\n", x+1);
	scanf("%lf",&pessoa[x].cpf);
	printf("Digite a data de nascimento da pessoa %d\n", x+1);
	scanf("%d",&idade);
	pessoa[x].ano = 2018-idade;
}
}

void pessoaMaisVelha(Pessoa pessoa[]){
	int maior = 0, indice, x;
	for(x = 0; x < 5; x++ ){
	if (maior < pessoa[x].ano){
		maior = pessoa[x].ano;
		indice = x;
	}}
	printf("A pessoa mais Velha eh: %s\n", pessoa[indice].nome);
}

void pessoaMaisNova(Pessoa pessoa[]){
	int menor = 999999, indice, x;
	for( x = 0; x < 5; x++ ){
	if (menor > pessoa[x].ano){
		menor = pessoa[x].ano;
		indice = x;
	}}
	printf("A pessoa mais Nova eh : %s\n", pessoa[indice].nome);
}

void ordenaPessoas(Pessoa pessoa[]){
	Pessoa aux;
	int i, j;
	for(j=0;j<5;j++)
		for(i=0;i<4;i++){
			if(pessoa[i].ano>pessoa[i+1].ano){
				aux=pessoa[i];
				pessoa[i]=pessoa[i+1];
				pessoa[i+1]=aux;
			}
		}
}

void listaPessoas(Pessoa pessoa[]){
	int x;
	for(x=0;x<5;x++)
	printf("Dados da pessoa %d\n Nome: %s\n CPF: %.0lf\n Idade: %d\n\n", x+1, pessoa[x].nome, pessoa[x].cpf, pessoa[x].ano);
}
























