#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include "pessoa.h"
#define a 5

void Preencher(Pessoa pessoa[]){
	int x;
	for(x=0;x<a;x++){
		printf("Pessoa %d:\n",x+1);
		printf("Nome: ");
		fflush(stdin);
		scanf("%s",&pessoa[x].nome);
		fflush(stdin);
		printf("Ano de nascimento: ");
		scanf("%d",&pessoa[x].ano);
		pessoa[x].ano=2018-pessoa[x].ano;
		printf("CPF: ");
		scanf("%d",&pessoa[x].cpf);
	}
}

void MaisVelho(Pessoa pessoa[]){
	int x, velho=0, pes;
	for(x=0;x<a;x++){
		if(pessoa[x].ano>velho){
		velho=pessoa[x].ano;
		pes=x;
		}
	}
	printf("\nMais velho: %s\nIdade: %d\n",pessoa[pes].nome,velho);
}

void MaisNovo(Pessoa pessoa[]){
	int x, novo=9999, pes;
	for(x=0;x<a;x++){
		if(pessoa[x].ano<novo){
		novo=pessoa[x].ano;
		pes=x;
		}
	}
	printf("\nMais novo: %s\nIdade: %d\n",pessoa[pes].nome,novo);
}

void Nomes(Pessoa pessoa[]){
	int x;
	for(x=0;x<a;x++){
	printf("\nPessoa %d: %s\n",x+1,pessoa[x].nome);	
	}
}

void Maiores(Pessoa pessoa[]){
	int x;
	printf("\nPessoas maiores de 18 anos:");
	for(x=0;x<a;x++){
		if(pessoa[x].ano>=18)
		printf("\n%s",pessoa[x].nome);
	}
}

void CpfImpar(Pessoa pessoa[]){
	int x;
	printf("\n\nPessoas com CPF impar: ");
	for(x=0;x<a;x++){
		if(pessoa[x].cpf%2)
		printf("\n%s",pessoa[x].nome);
	}
}

void OrdenarIdade(Pessoa pessoa[]){
	Pessoa aux;
	int j, i;
	printf("\n\nDo mais novo ao mais velho:");
	for(j=0;j<a-1;j++)
		for(i=0;i<a-1;i++){
			if(pessoa[i].ano<pessoa[i+1].ano){
				aux=pessoa[i];
				pessoa[1]=pessoa[i+1];
				pessoa[i+1]=aux;
			}
		}
	for(j=0;j<a;j++){
	printf("\nNome: %s",pessoa[j].nome);
	}
}













































