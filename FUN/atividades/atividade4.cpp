#include <stdio.h>
#include <stdlib.h>
main()
{
	float SalM, reaj, SalF;
	printf("escreva o salario mensal\n");
	scanf("%f",&SalM);
	printf("escreva o valor do reajuste em porcentagem\n");
	scanf("%f",&reaj);
	
	SalF=SalM*reaj/100;
	SalF=SalF+SalM;
	printf("o novo salario eh %.2f",SalF);
}
