#include<stdio.h>
#include<stdlib.h>
int n=10;

typedef int ChaveTipo;

typedef struct{
	ChaveTipo Chave;
}Item;

void Inserir(Item*v){
	int i, a;
	printf("Insira %d valores:\n", n);
	for(i=0;i<n;i++){
		scanf("%d", &v[i].Chave);
	}
}

void Bolha(Item*v, int n){
	int i, j;
	Item aux;
	for(i=0;i<n-1;i++){
		for(j=1;j<n-i;j++){
			if(v[j].Chave<v[j-1].Chave){
				aux = v[j];
				v[j]=v[j-1];
				v[j-1]=aux;
			}
		}
	}
}

void Selecao(Item*v, int n){
	int i, j, Min;
	Item aux;
	for(i=0;i<n-1;i++){
		Min=i;
		for(j=i+1;j<n;j++){
			if(v[j].Chave<v[Min].Chave){
				Min=j;
				aux = v[Min];
				v[Min]=v[i];
				v[i]=aux;
			}
		}
	}
}

void Insercao(Item*v, int n){
	int i, j;
	Item aux;
	for(i=1;i<n;i++){
		aux=v[i];
		j=i-1;
		while((j>=0)&&(aux.Chave<v[j].Chave)){
			v[j+1]=v[j];
			j--;
		}
		v[j+1]=aux;
	}
}

int main(void){
	int i, a=-1;
	Item v[n];
	while(a!=0){
	Inserir(v);
		printf("Escolha uma das formas de organizacao:\n");
		printf("0- Fechar o programa\n");
		printf("1- Bolha\n");
		printf("2- Selecao\n");
		printf("3- Insercao\n");
		scanf("%d",&a);
		switch(a){
			case 0: break;
			case 1: Bolha(v, n); break;
			case 2: Selecao(v, n); break;
			case 3: Insercao(v, n); break;
			default: printf("Opcao invalida\n");system("pause");system("cls");
		}
		if(a==0){
			break;
		}
		for(i=0;i<n;i++){
			printf("%d, ", v[i]);
		}
		printf("\n");
		system("pause");
		system("cls");
	}
}














