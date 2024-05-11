#include <stdio.h>
#include <stdlib.h>
main()
{
	int idade, cont, soma=0, cont2=0;
	float media=0;
	
	printf("escreva 10 valores\n");
	for(cont=0; cont<10; cont++){
		scanf("%d",&idade);
		if(idade>18){
		soma=soma+idade;
		cont2=cont2+1;
		}
	}
	printf("a media das idades eh %d",soma/cont2);
}
