#include <stdio.h>
#include <stdlib.h>
#define DIM 3
int vez, fant[DIM][DIM];

int menu(void);
void clear(void);
void jogar(int tabuleiro[][DIM]);
void zeraTabuleiro(int tabuleiro[][DIM]);
void exibeTabuleiro(int tabuleiro[][DIM]);
void jogada(int tabuleiro[][DIM]);
int vitoria(int tabuleiro[][DIM]);

int main(void)
{
	int tabuleiro[DIM][DIM],continuar;
	
	do{
		vez=1;
		continuar=menu();
		if(continuar==1)
		jogar(tabuleiro);
	} while(continuar);

	putchar('\n');
	system("pause");
}
int menu(void)
{
	int opcao;
	
	printf("\t\tNosso Primeiro Jogo -- Jogo da Velha");
	printf("\n1.\tJogar uma pardida \n");
	printf("0.\tSair\n");
	printf("\nOpcao: ");
	scanf("%d",&opcao);
	
	switch(opcao){
		case 1:;
		case 0: break;
		default: clear();
		printf("Opcao invalida. Tente de novo!\n");
	}
	return opcao;
}

void clear(void){
	system("cls");
}

void jogar(int tabuleiro[][DIM])
{
	int continua;
	zeraTabuleiro(tabuleiro);
	
	do{
		clear();
		exibeTabuleiro(tabuleiro);
		jogada(tabuleiro);
		if(vez>9){
			printf("Deu velha!!!\n\n\n\n\n\n\n\n\n\n\n\n\n");
			break;
		}
	}while (true);	//(checaTermino(tabuleiro,vez) != 1);
}

void zeraTabuleiro(int tabuleiro[][DIM])
{
	int lin, col;
	for(lin=0;lin<DIM;lin++)
		for(col=0;col<DIM;col++)
			tabuleiro[lin][col]=0;
}

void exibeTabuleiro(int tabuleiro[][DIM])
{
	int lin, col;
	putchar('\n');
	
	for(lin=0;lin<DIM;lin++){
		for(col=0;col<DIM;col++){
			if(tabuleiro[lin][col]==0){
				printf("   ");
				fant[lin][col]=0;
			}
			else if(tabuleiro[lin][col]==1){
				printf(" X ");
				fant[lin][col]=1;
			}
			else{
				printf(" O ");
				fant[lin][col]=4;
			}
			if(col!= (DIM-1))
				printf("|");
		}
		putchar('\n');
	}
	putchar('\n');
}

void jogada(int tabuleiro[][DIM])
{
	int lin, col;
	vez++;
	printf("\n-->Jogador %d \n",(vez%2)+1);
	
	do{
		printf("Linha: ");
		scanf("%d",&lin);
		lin--;
		
		printf("Coluna: ");
		scanf("%d",&col);
		col--;
		
	}while(false);
	
	if(vez%2)
		tabuleiro[lin][col]=-1;
	else
		tabuleiro[lin][col]=1;
	

}

int vitoria(int tabuleiro[][DIM])
{
	int i, j, soma=0;
	for(j=0;j<DIM;j++)
		for(i=0;i<DIM;i++){
			soma+=fant[j][i];
		if(soma==3){
			printf("Jogador 1 ganhou!!!");
			break;
		}
		if(soma==12){
			printf("Jogador 2 ganhou!!!");
			break;
		}
	}

	for(i=0;i<DIM;i++)
		for(j=0;j<DIM;j++){
			soma+=fant[j][i];
		if(soma==3){
			printf("Jogador 1 ganhou!!!");
			break;
		}
		if(soma==12){
			printf("Jogador 2 ganhou!!!");
			break;
		}
	}
	
	for(j=0;j<DIM;j++)
		for(i=0;i<DIM;i++){
			if(i==j){
			soma+=fant[j][i];
		if(soma==3){
			printf("Jogador 1 ganhou!!!");
			break;
		}
		if(soma==12){
			printf("Jogador 2 ganhou!!!");
			break;
		}
			}
	}
}
	





