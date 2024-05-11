#include <stdio.h>
#include <stdlib.h>
int main()
{
	char nome[80];
	int i=0;
	printf("Digite seu nome: ");
	gets(nome);
	printf("Letras em posicao impar:\n");
	while(nome[i]!='\0'){
		if(i%2==1)
		printf("%c ", nome[i]);
	
	i++;
	}
	printf("\n");
	i=0;
	printf("Letras em posicao par:\n");
	while(nome[i]!='\0'){
		if(i%2==0)
		printf("%c ", nome[i]);
	
	i++;
	}
}
