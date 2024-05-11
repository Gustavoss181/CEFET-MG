#include<stdlib.h>
#include<stdio.h>
#include<string.h>
main(){
	
	char re[80] = "lagarto";
	printf ("\n\n\n\n%s\n\n\n\n", re);
	
	printf("digite seu nome: ");
	gets(re);
	printf("Oi %s\n", re);
	
	printf ("digite a senha: ");
	scanf("%s",&re);
	if(strcmp(re,"laranja")==0)
	printf("senha correta\n");
	else
	printf("senha incoreta\n");
	
	//strcmp = comparação
	//strlen = tamanho
	//gets = scanf com espaço
	//
	system("pause");
}
