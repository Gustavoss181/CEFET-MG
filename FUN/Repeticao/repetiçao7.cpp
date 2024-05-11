#include <stdio.h>
#include <stdlib.h>
main()
{
	int num, soma;
	printf("para sair da repeticao digite -1\n");
	do{
	printf("digite um valor: ");
	scanf("%d",&num);
		if(num%2!=0 && num>33 && num<99)
		soma=soma+num;
	}while(num!=-1);
	printf("\na soma dos valores impares entre 33 e 99 eh %d",soma);
}
