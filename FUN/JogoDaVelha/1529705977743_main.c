
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

#define N 3

void inicia_tabuleiro(char t[N][N])
{
	int i = 0, j = 0;
	
	for (i = 0; i < N; i++)
	{
		for (j = 0; j < N; j++)
		{
			t[i][j] = ' ';
		}
	}
}

void imprime_tabuleiro(char t[N][N])
{
	printf("\n");
	printf("   1   2   3 \n\n");
	printf("     |   |   \n");
	printf("1  %c | %c | %c \n", t[0][0], t[0][1], t[0][2]);
	printf("  ___|___|___\n");
	printf("     |   |   \n");
	printf("2  %c | %c | %c \n", t[1][0], t[1][1], t[1][2]);
	printf("  ___|___|___\n");
	printf("     |   |   \n");
	printf("3  %c | %c | %c \n", t[2][0], t[2][1], t[2][2]);
	printf("     |   |   \n");
	printf("\n");
}

char define_jogador_inicial(void)
{
	char jogador = '?';

	while (true)
	{
		printf("\n Gostaria de comecar com 'o' ou 'x': ");
		scanf(" %c", &jogador);
		
		if (jogador == 'x' || jogador == 'o')
		{
			return jogador;
		}
		
		printf("\n Entrada invalida.");
	}
}

void alterna_jogador(char *ptr_jogador)
{
	*ptr_jogador = (*ptr_jogador == 'o') ? 'x' : 'o';
}

void le_jogada(int *ptr_i, int *ptr_j)
{
	while (true)
	{
		printf("\n Digite a posição de jogada: ");
		scanf(" %d %d", ptr_i, ptr_j);
		
		(*ptr_i)--;
		(*ptr_j)--;
		
		if (*ptr_i < 0 || *ptr_i > 2 || *ptr_j < 0 || *ptr_j > 2)
		{
			printf("\n Entrada invalida.");
			continue;
		}
		system("cls");
		break;
	}
}

void faz_jogada(char t[N][N], char jogador)
{
	int i = 0, j = 0;

	while (true)
	{
		le_jogada(&i, &j);
		
		if (t[i][j] == ' ')
		{
			t[i][j] = jogador;
			break;
		}
		
		printf("\n Posição escolhida já marcada pelo jogador");
		printf(" '%c'.", t[i][j]);
	}
}

void imprime_vencedor(char vencedor)
{
	switch (vencedor)
	{
		case 'v':
			printf("\n Deu velha...\n\n");
		break;
		
		default:
			if (vencedor == 'x' || vencedor == 'o')
			{
				printf("\n Jogador '%c' ganhou!\n\n", vencedor);
			}
			else
			{
				printf("\n Erro: vencedor '%c' é inválido.\n\n", vencedor);
				exit(1);
			}
		break;
	}
}

bool verifica_vitoria(char t[N][N])
{
	if (t[0][0] != ' ')
	{
		if (t[0][0] == t[0][1] && t[0][1] == t[0][2])
		{
			return true;
		}
		if (t[0][0] == t[1][0] && t[1][0] == t[2][0])
		{
			return true;
		}
		if (t[0][0] == t[1][1] && t[1][1] == t[2][2])
		{
			return true;
		}
	}
	
	if (t[1][1] != ' ')
	{
		if (t[0][2] == t[1][1] && t[1][1] == t[2][0])
		{
			return true;
		}
		if (t[0][1] == t[1][1] && t[1][1] == t[2][1])
		{
			return true;
		}
		if (t[1][0] == t[1][1] && t[1][1] == t[1][2])
		{
			return true;
		}
	}
	
	if (t[2][2] != ' ')
	{
		if (t[2][0] == t[2][1] && t[2][1] == t[2][2])
		{
			return true;
		}
		if (t[0][2] == t[1][2] && t[1][2] == t[2][2])
		{
			return true;
		}
	}
	
	return false;
}

int main(void)
{
	char tabuleiro[N][N];
	
	char jogador = '?';
	int  jogadas = 0;
	
	char vencedor = 'v';
	
	inicia_tabuleiro(tabuleiro);
	jogador = define_jogador_inicial();
	
	for (jogadas = 1; jogadas <= 9; jogadas++)
	{
		imprime_tabuleiro(tabuleiro);
		
		printf(" Vez do jogador '%c'...", jogador);
		faz_jogada(tabuleiro, jogador);
		
		if (verifica_vitoria(tabuleiro))
		{
			vencedor = jogador;
			break;
		}
	
		alterna_jogador(&jogador);
	}
	
	imprime_tabuleiro(tabuleiro);
	imprime_vencedor(vencedor);

	return 0;
}


















