#include<stdio.h>
#include<stdlib.h>
#define max 4

int comeco=0, tamanho=0, queue[max];

void inserir(int);
void remover();
void mostrar();

int main(){
	int x, a=-1;
	
	while(a!=0){
		printf("MENU\n\n");
		printf("\nO que gostaria de fazer?\n");
		printf("0- Fechar o Programa\n");
		printf("1- Inserir elemento na fila\n");
		printf("2- Retirar elemento na fila\n");
		printf("3- Mostrar fila ordenada\n");
		scanf("%d", &a);
		system("cls");
		switch(a){
			case 0: system("pause"); break;
			case 1: printf("\n\nDigite o numero que dezeja inserir: "); scanf("%d", &x); printf("\n\n"); inserir(x); system("pause"); system("cls");  break;
			case 2: remover(); system("pause"); system("cls"); break;
			case 3: mostrar(); system("pause"); system("cls"); break;
			default: printf("Opcao invalida\n");
		}
	}
}

void inserir(int elemento){
	if(tamanho==max)
		printf("\nFila cheia\n");
	else{
		queue[((comeco+tamanho)%max)]=elemento;
		tamanho++;
	}
}

void remover(){
	if(tamanho==0)
		printf("\nfila vazia\n");
	else{
		comeco++;
		tamanho--;
	}
}

void mostrar(){
	int i;
	for(i=0;i<tamanho;i++)
		printf("%d\n", queue[(comeco+i)%max]);
}









