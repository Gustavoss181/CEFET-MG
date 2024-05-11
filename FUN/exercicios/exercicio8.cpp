#include <stdio.h>
#include <stdlib.h>
main()
{
	int n1, n2, quo, resto;
	
	printf("digite dois numeros inteiros numerador e denominador respectivamente\n");
	scanf("%d %d",&n1,&n2);
	
	quo=n1/n2;
	resto=n1%n2;
	
	printf("o quociente inteiro eh %d",quo);
	printf("\no resto inteiro da divisao eh %d",resto);
}
