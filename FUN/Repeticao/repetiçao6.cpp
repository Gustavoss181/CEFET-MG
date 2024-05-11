#include <stdio.h>
#include <stdlib.h>
main()
{
	float n1;
	
	printf("escreva um valor\n");
	scanf("%f",&n1);
	
	if(n1>154 && n1<18745321)
	printf("esta compreendidido entre 154 e 18745321");
	else
		printf("nao esta compreendidido entre 154 e 18745321");
}
