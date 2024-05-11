#include <stdio.h>
#include <stdlib.h>
main()
{
	float l1,l2,l3;
	printf("escreva o valor dos lados do triangulo\n");
	scanf("%f %f %f",&l1,&l2,&l3);
	
	if ((l2+l3)>l1 && (l1+l3)>l2 && (l1+l2)>l3)
	printf("Eh um triangulo possivel");
	else
	printf("nao eh um triangulo possivel");
}
