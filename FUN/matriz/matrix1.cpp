#include<stdio.h>
#include<stdlib.h>
#include<string.h>
main(){
	float mtx[3][3], media=0;
	int i, j;
	
	printf("informe os valores da matrix 3X3:\n");
	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
			scanf("%f", &mtx[i][j]);
		if(i==j)
			media+=mtx[i][j];
		}
	}
	printf("a media da diagonal principal eh %.2f", media/3);
}
