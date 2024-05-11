#include <stdio.h>
#include <stdlib.h>
main()
{
	int n1, n2;
	printf("Escreva dois valores:\n");
	scanf("%d %d",&n1,&n2);
	
	if(n1<n2){
		printf("crescente: %d e %d\n",n1,n2);
		printf("decrescente: %d e %d",n2,n1);
	}
	else{
		printf("crescente: %d e %d\n",n2,n1);
		printf("decrescente: %d e %d",n1,n2);
	}
}
