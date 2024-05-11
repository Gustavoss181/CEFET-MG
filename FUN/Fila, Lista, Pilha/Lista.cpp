#include<stdio.h>
#include<stdlib.h>
#define INICIOARRANJO 1
#define MAXTAM 1000

typedef int TipoChave;

typedef int TipoApontador;

typedef struct{
	TipoChave Chave;
	//outros componentes
}TipoItem;

typedef struct{
	TipoItem Item[MAXTAM];
	TipoApontador Primeiro=INICIOARRANJO, Ultimo=INICIOARRANJO;
}TipoLista;

/*=========================================================*/

void FLVazia(TipoLista *Lista){
	Lista->Primeiro=INICIOARRANJO;
	Lista->Ultimo=Lista->Primeiro;
}/*FLVazia*/

int Vazia(TipoLista Lista){
	return (Lista.Primeiro==Lista.Ultimo);
}

void Insere(TipoItem x, TipoLista*Lista){
	if(Lista->Ultimo>MAXTAM)
		printf("Lista esta cheia\n\n");
	else{
		Lista->Item[Lista->Ultimo-1]=x;
		Lista->Ultimo++;
	}
}

void Retira(TipoApontador p, TipoLista*Lista, TipoItem*Item){
	int Aux;
	
	if(Vazia(*Lista) || p>=Lista->Ultimo){
		printf("Erro, Posicao nao existe\n\n");
		return;
	}
	*Item=Lista->Item[p-1];
	Lista->Ultimo--;
	for(Aux=p; Aux<Lista->Ultimo; Aux++){
		Lista->Item[Aux-1]=Lista->Item[Aux];
	}
}

void Imprime(TipoLista Lista){
	int Aux;
	
	for(Aux=Lista.Primeiro-1;Aux<=(Lista.Ultimo-2);Aux++)
	printf("%d, ", Lista.Item[Aux].Chave);
}

/*==================================================*/
main(){
	int a=-1, p;
	TipoLista Lista;
	TipoItem Item, x;
	
	while(a!=0){
		printf("MENU\n\n");
		printf("\nO que gostaria de fazer?\n");
		printf("0- Fechar o Programa\n");
		printf("1- Esvaziar Lista\n");
		printf("2- Verificar se a lista esta vazia\n");
		printf("3- Inserir item a lista\n");
		printf("4- Retirar item da lista\n");
		printf("5- Imprimir a lista\n");
		scanf("%d", &a);
		system("cls");
		switch(a){
			case 0: system("pause"); break;
			case 1: FLVazia(&Lista); break;
			case 2: if(Vazia(Lista)==1) printf("\n\nEsta vazia\n\n");else printf("\n\nNao esta vazia\n\n");system("pause"); system("cls"); break;
			case 3: printf("\n\nDigite o numero que dezeja inserir: "); scanf("%d", &x); printf("\n\n"); Insere(x, &Lista); system("pause"); system("cls");  break;
			case 4: printf("\n\nDigite a posicao do numero que dezeja retirar: "); scanf("%d", &p); printf("\n\n"); Retira(p, &Lista, &Item);system("pause"); system("cls"); break;
			case 5: Imprime(Lista); printf("\n\n"); system("pause"); system("cls"); break;
			default: printf("Opcao invalida\n"); 
		}
	}
}
