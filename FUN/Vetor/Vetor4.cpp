#include<stdio.h>
#include<stdlib.h>
main(){
	float valor[10];
	int i,imaior,imenor;
	float maior=-1, menor=11, soma=0, media;
	
	for(i=0;i<10;i++){
		printf("digite o valor %d: ",i+1);
		scanf("%f",&valor[i]);
		while(valor[i]<0||valor[i]>10){
		printf("Valor invalido. Escreva novamente: ");
		scanf("%f",&valor[i]);
		}
		soma=soma+valor[i];
		if(valor[i]>maior){
		imaior=i;
		maior=valor[i];}
		if(valor[i]<menor){
		imenor=i;
		menor=valor[i];}
	}
	media=soma/10;
	printf("\nMaior valor em [%d]: %.2f\n",imaior+1,maior);
	printf("\nMenor valor em [%d]: %.2f\n",imenor+1,menor);
	printf("\nMedia: %.2f\n",media);
	printf("\nOs valores invertidos:\n");
	for(i=9;i>-1;i--){
		printf("%.2f\n",valor[i]);
	}
}
