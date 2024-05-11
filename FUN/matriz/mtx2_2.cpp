#include<stdio.h>
#include<stdlib.h>
#include<string.h>
main(){
	char nome[80];
	int i;
	
	printf("Nome: ");
	gets(nome);
	
	for(i=0;i<strlen(nome);i++)
		if(nome[i]!=32)
		printf("%s\n", nome);
	
}
