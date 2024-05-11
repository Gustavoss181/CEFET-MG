#include<stdio.h>
#include<stdlib.h>
#include<string.h>
main(){
	float media=0;
	int  mtx[3][2], i, j, cont=0;
	
	printf("informe os valores da matrix 3X2:\n");
	for(i=0;i<3;i++)
		for(j=0;j<2;j++){
			scanf("%d", &mtx[i][j]);
		if(mtx[i][j]%2!=0){
		media+=mtx[i][j];
		cont++;
		}
		}
	printf("a media dos numeros impares eh %.2f", media/cont);
}
