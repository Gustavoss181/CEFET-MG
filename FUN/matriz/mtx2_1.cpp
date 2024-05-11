#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#define a 5
main(){
	char nome[a][30];
	float nota[a][4], soma, maior=0;
	int i, j, melhor;
	
	for(i=0;i<a;i++){
		printf("nome do aluno %d: ", i);
		fflush(stdin);
		gets(nome[i]);
	}
	for(i=0;i<a;i++){
		for(j=0;j<4;j++){
			scanf("%f", &nota[i][j]);	
		}
	}
	for(i=0;i<a;i++){
		soma=0;
		for(j=0;j<4;j++){
			soma+=nota[i][j];	
		}
		if(soma/4>maior){
		maior=soma/4;
		melhor=i;
		}
	}
	printf("o aluno com maior nota foi: %s", nome[melhor]);

}
