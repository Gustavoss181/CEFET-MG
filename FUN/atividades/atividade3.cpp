#include <stdio.h>
#include <stdlib.h>
main()
{
	float n, ant, suc;
	printf("informe um valor\n");
	scanf("%f",&n);
	
	ant=n-1;
	suc=n+1;
	printf("seu antecessor eh %.2f",ant);
	printf("seu sucessor eh %.2f",suc);
}
