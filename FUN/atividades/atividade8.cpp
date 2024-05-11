#include <stdio.h>
#include <stdlib.h>
main()
{
	int n;
	printf("digite um numero de um a dez\n");
	scanf("%d",&n);
	switch(n)
	{
		case 1: printf("Um\n"); break;
		case 2: printf("Dois\n"); break;
		case 3: printf("Tres\n"); break;
		case 4: printf("Quatro\n"); break;
		case 5: printf("Cinco\n"); break;
		case 6: printf("Seis\n"); break;
		case 7: printf("Sete\n"); break;
		case 8: printf("Oito\n"); break;
		case 9: printf("Nove\n"); break;
		case 10: printf("Dez\n"); break;
		default: 
		printf("Numero invalido");
	}
}
