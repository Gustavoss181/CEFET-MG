#include<stdlib.h>
#include<stdio.h>
main(){
	float valor[8];
	int i;
	float soma=0,media;
	for (i=0;i<8;i++){
		printf("\nvalor %d:",i+1);
		scanf("%f",&valor[i]);
		soma=soma+valor[i];
	}
	media=soma/8;
	printf("\nA media dos valores e':%.2f",media);
}
