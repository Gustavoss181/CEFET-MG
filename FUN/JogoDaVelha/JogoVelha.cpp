#include <stdio.h>
#include <stdlib.h>
#define DIM 3
int vez;
char jog1[50], jog2[50], simb1, simb2;
 
int menu(void);
void clear(void);
void zeraTabuleiro(int tabuleiro[][DIM]);
void exibeTabuleiro(int tabuleiro[][DIM]);
void jogar(int tabuleiro[][DIM]);
int checaLocal(int tabuleiro[][DIM], int linha, int coluna);
int checaLinha(int tabuleiro[][DIM]);
int checaColuna(int tabuleiro[][DIM]);
int checaDiagonal(int tabuleiro[][DIM]);
int checaEmpate(int tabuleiro[][DIM]);
int checaTermino(int tabuleiro[][DIM], int vez);
void jogada(int tabuleiro[][DIM]);
 
int main(void)
{
    int tabuleiro[DIM][DIM],
        continuar;
 
    do
    {
        vez=1;
        continuar = menu();
        if(continuar == 1){
			printf("\n\nNome do jogador 1: ");
        	fflush(stdin);
        	gets(jog2);
        	printf("\n%s, qual simbolo gostaria de usar?(digite apenas um caracter): ",jog2);
        	scanf("%c",&simb1);
        	printf("\nNome do jogador 2: ");
            fflush(stdin);
        	gets(jog1);
        	printf("\n%s, qual simbolo gostaria de usar?(digite apenas um caracter): ",jog1);
        	scanf("%c",&simb2);
			jogar(tabuleiro);
			system("pause");
			system("cls");
		}
 
    }while(continuar);
 
    return 0;
}
 
int menu(void)
{
    int opcao;
 
        printf("\t\tJogo da Velha\n");
        printf("\n1.Jogar\n");
        printf("0.Sair\n");
        printf("\nOpcao: ");
 
        scanf("%d", &opcao);
 
        switch(opcao)
        {
           case 1:
           case 0:
                break;
           default:
                clear();
                printf("Opcao invalida. Tente de novo!\n");
        }
 
    return opcao;
}
 
void clear(void)
{
    system("cls");
}
 
void zeraTabuleiro(int tabuleiro[][DIM])
{
    int linha, coluna;
    for(linha = 0 ; linha < DIM ; linha++)
        for(coluna = 0 ; coluna < DIM ; coluna++)
            tabuleiro[linha][coluna] = 0;
}
 
void exibeTabuleiro(int tabuleiro[][DIM])
{
    int linha, coluna;
    putchar('\n');
 
    for(linha = 0 ; linha < DIM ; linha++)
    {
        for(coluna = 0 ; coluna < DIM ; coluna++)
        {
            if(tabuleiro[linha][coluna] == 0)
                printf("    ");
            else
                if(tabuleiro[linha][coluna] == 1)
                    printf("  %c ",simb1);
                else
                    printf("  %c ",simb2);
 
            if(coluna != (DIM-1))
                printf("|");
        }
        putchar('\n');
    }
    putchar('\n');
}
 
void jogar(int tabuleiro[][DIM])
{
    int continua;
    zeraTabuleiro(tabuleiro);
 
    do
    {
        clear();
        exibeTabuleiro(tabuleiro);
        jogada(tabuleiro);
 
    }while(checaTermino(tabuleiro, vez) != 1);
}
 
 
int checaLocal(int tabuleiro[][DIM], int linha, int coluna)
{
    if(linha < 0 || linha > (DIM-1) || coluna < 0 || coluna > (DIM-1) || tabuleiro[linha][coluna] != 0)
        return 0;
    else
        return 1;
}
 
int checaLinha(int tabuleiro[][DIM])
{
    int linha, coluna,
        soma;
 
    for(linha = 0 ; linha < DIM ; linha++)
    {
        soma=0;
 
        for(coluna = 0 ; coluna < DIM ; coluna++)
            soma += tabuleiro[linha][coluna];
 
        if(soma==DIM || soma == (-1)*DIM)
            return 1;
    }
 
    return 0;
}
 
int checaColuna(int tabuleiro[][DIM])
{
    int linha, coluna,
        soma;
 
 
    for(coluna = 0 ; coluna < DIM ; coluna++)
    {
        soma=0;
 
        for(linha = 0 ; linha < DIM ; linha++)
            soma += tabuleiro[linha][coluna];
 
        if(soma==DIM || soma == (-1)*DIM)
            return 1;
    }
 
    return 0;
}
 
int checaDiagonal(int tabuleiro[][DIM])
{
    int linha,
        diagonal_principal=0,
        diagonal_secundaria=0;
 
    for(linha = 0 ; linha < DIM ; linha++)
    {
        diagonal_principal += tabuleiro[linha][linha];
        diagonal_secundaria += tabuleiro[linha][DIM-linha-1];
    }
 
    if(diagonal_principal==DIM || diagonal_principal==(-1)*DIM ||
       diagonal_secundaria==DIM || diagonal_secundaria==(-1)*DIM)
       return 1;
 
    return 0;
}
 
int checaEmpate(int tabuleiro[][DIM])
{
    int linha, coluna;
 
    for(linha = 0 ; linha < DIM ; linha++)
        for(coluna = 0 ; coluna < DIM ; coluna++)
            if(tabuleiro[linha][coluna] == 0)
                return 0;
 
    return 1;
}
 
int checaTermino(int tabuleiro[][DIM], int vez)
{
    if(checaLinha(tabuleiro))
    {
        if(vez%2)
		printf("Jogo encerrado. %s venceu !\n\n", jog1);
		else
		printf("Jogo encerrado. %s venceu !\n\n", jog2);
        exibeTabuleiro(tabuleiro);
        return 1;
    }
 
    if(checaColuna(tabuleiro))
    {
        if(vez%2)
		printf("Jogo encerrado. %s venceu !\n\n", jog1);
		else
		printf("Jogo encerrado. %s venceu !\n\n", jog2);
        exibeTabuleiro(tabuleiro);
        return 1;
    }
 
    if(checaDiagonal(tabuleiro))
    {
        if(vez%2)
		printf("Jogo encerrado. %s venceu !\n\n", jog1);
		else
		printf("Jogo encerrado. %s venceu !\n\n", jog2);
        exibeTabuleiro(tabuleiro);
        return 1;
    }
 
    if(checaEmpate(tabuleiro))
    {
        printf("Jogo encerrado. Ocorreu um empate! !\n\n");
        exibeTabuleiro(tabuleiro);
        return 1;
    }
 
    return 0;
}
 
void jogada(int tabuleiro[][DIM])
{
    int linha, coluna;
    vez++;
    if(vez % 2)
    printf("\n--> %s \n", jog1);
 	else
 	printf("\n--> %s \n", jog2);
 
    do
    {
        printf("Linha: ");
        scanf("%d", &linha);
        linha--;
 
        printf("Coluna: ");
        scanf("%d", &coluna);
        coluna--;
 
        if(checaLocal(tabuleiro, linha, coluna) == 0)
            printf("Posicao ocupada ou inexistente, escolha outra.\n");
 
    } while(checaLocal(tabuleiro, linha, coluna) == 0);
 
    if(vez%2)
        tabuleiro[linha][coluna] = -1;
    else
        tabuleiro[linha][coluna] = 1;
}
