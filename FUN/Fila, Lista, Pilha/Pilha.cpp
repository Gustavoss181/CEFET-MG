#include<stdlib.h>
#include<stdio.h>
#define max 50

struct Pilha{
	int n;
	float vet[max];
};

Pilha* cria(void){
	Pilha* p=(Pilha*)malloc(sizeof(Pilha));
	p->n=0;
	return p;
}

void push(Pilha* p, float v){
	if(p->n==max){
		printf("Pilha cheia!\n");
		exit(1);
	}
	p->vet[p->n]=v;
	p->n++;
}

int vazia(Pilha* p){
	return(p->n==0);
}

float Pop(Pilha* p){
	float v;
	if(vazia(p)){
		printf("Pilha vazia!");
		exit(1);
	}
	v=p->vet[p->n-1];
	p->n--;
	return v;
}

void libera(Pilha* p){
	free(p);
}

void NovaPilha(Pilha *p){
	Pilha* np;
	int cont;
	
	np=cria();
	
	for(cont=0;cont<p->n;cont++){
		np->vet[cont] = p->vet[cont];
	}
}

int main(){
	int retirou=0;
	float x;
	int a=-1;
	Pilha* p;
	
	while(a!=0){
		printf("MENU\n\n");
		printf("\nO que gostaria de fazer?\n");
		printf("0- Fechar o Programa\n");
		printf("1- Criar pilha\n");
		printf("2- Verificar se a pilha esta vazia\n");
		printf("3- Inserir item na pilha\n");
		printf("4- Retirar item da pilha\n");
		printf("5- Apagar pilha\n");
		printf("6- Fazer uma copia da pilha\n");
		scanf("%d", &a);
		system("cls");
		switch(a){
			case 0: system("pause"); break;
			case 1: p=cria();printf("\n\nPilha criada\n\n");system("pause"); system("cls"); break;
			case 2: if(vazia(p)==1) printf("\n\nEsta vazia\n\n");else printf("\n\nNao esta vazia\n\n");system("pause"); system("cls"); break;
			case 3: printf("\n\nDigite o numero que dezeja inserir: "); scanf("%f", &x); printf("\n\n"); push(p, x); system("pause"); system("cls");  break;
			case 4: x=Pop(p); printf("\n\nNumero retirado: %.2f\n\n", x);system("pause"); system("cls"); break;
			case 5: libera(p); printf("\n\nPilha apagada\n\n"); system("pause"); system("cls"); break;
			case 6: NovaPilha(p); printf("\n\nCopia criada!\n\n"); system("pause"); system("cls"); break;
			default: printf("Opcao invalida\n"); 
		}
	}
}
