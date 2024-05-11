#include<stdio.h>
#include<stdlib.h>
main(){
	float valor[10];
	int i;
	
	for(i=0;i<10;i++){
		printf("digite o valor %d: ",i+1);
		scanf("%f",&valor[i]);
	}
	printf("\nOs valores invertidos:\n");
	for(i=9;i>-1;i--){
		printf("%.2f\n",valor[i]);
	}
}
