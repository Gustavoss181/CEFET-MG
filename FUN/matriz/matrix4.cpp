#include<stdio.h>
#include<stdlib.h>
#include<string.h>
main(){
	int mtx[4][2];
	int i, j, mi=0, mj=0, maior=-99999;
	
	printf("Informe os valores da matrix 4X2:\n");
	for(i=0;i<4;i++)
		for(j=0;j<2;j++){
			scanf("%d", &mtx[i][j]);
		if(mtx[i][j]>maior){
			maior=mtx[i][j];
			mi=i;
			mj=j;
		}
		}
	printf("Maior numero da matrix: %d\nPosicao [%d] [%d]",maior,mi,mj);
	
}
