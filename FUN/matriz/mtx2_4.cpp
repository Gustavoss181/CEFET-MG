#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#define a 3
main(){
	int mtx[a][a], col[3], lin[3];
	int i, j;
	
	for(i=0;i<a;i++)
		for(j=0;j<a;j++){
			scanf("%d", &mtx[i][j]);
			col[i]=0;
			lin[i]=0;
		}
	for(i=0;i<a;i++)
		for(j=0;j<a;j++)
			lin[i]+=mtx[i][j];
	for(i=0;i<a;i++)
		for(j=0;j<a;j++)
			col[i]+=mtx[j][i];
	for(i=0;i<a;i++){
		printf("\nsoma da coluna na posicao %d: %d\n", i, col[i]);
		printf("soma da linha na posicao %d: %d\n", i, lin[i]);
	}
	
	
}
