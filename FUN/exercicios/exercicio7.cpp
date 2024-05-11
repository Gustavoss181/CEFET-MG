#include <stdio.h>
#include <stdlib.h>
main()
{
	int anosF, nCig;
	float pCig, dGasto;
	
	printf("ha quantos anos voce fuma?\n");
	scanf("%d",&anosF);
	printf("quantos cigarros voce fuma por dia?\n");
	scanf("%d",&nCig);
	printf("qual o preco de uma carteira com 20 cigarros?\n");
	scanf("%f",&pCig);
	
	dGasto=(pCig/20)*nCig*(365*anosF);
	
	printf("o dinheiro ja gasto por cigarros foi de %.2f",dGasto);
}
