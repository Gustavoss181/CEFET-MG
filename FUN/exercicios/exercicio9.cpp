#include <stdio.h>
#include <stdlib.h>
main()
{
	int vPer, vMot, multa;
	
	printf("digite a velocidade maxima permitida\n");
	scanf("%d",&vPer);
	printf("digite a velocidade do motorista\n");
	scanf("%d",&vMot);
	
	if(vMot-vPer>30)
	printf("a multa eh de 200 reais");
	else if(vMot-vPer>10)
	printf("a multa eh de 100 reais");
	else if(vMot-vPer>0)
	printf("a multa eh de 50 reais");
	else
	printf("o motorista estava dentro dos limites de velocidade");
}
