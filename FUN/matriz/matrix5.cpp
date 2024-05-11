#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#define a 4
main(){
	int mtx[a][a];
	int i, j;
	
	printf("Informe os valores da matrix 4X2:\n");
	for(i=0;i<a;i++)
		for(j=0;j<a;j++){
			scanf("%d", &mtx[i][j]);
		}
		printf("\nElementos da diagonal secundaria:\n");
	for(i=0;i<a;i++)
		for(j=0;j<a;j++)
			if(i==j)
				printf("%3d", mtx[i][j]);
		printf("\n\nElementos da diagonal secundaria:\n");
	for(i=0;i<a;i++)
		for(j=0;j<a;j++)
			if(i+j==a-1)
				printf("%3d", mtx[i][j]);
	
}
