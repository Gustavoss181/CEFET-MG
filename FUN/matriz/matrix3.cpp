#include<stdio.h>
#include<stdlib.h>
#include<string.h>
main(){
	float M[2][2], A, V[4];
	int i, j, a;
	
	printf("informe os valores da matrix 2X2:\n");
	for(i=0;i<2;i++)
		for(j=0;j<2;j++)
			scanf("%f", &M[i][j]);
	
	printf("A=");
	scanf("%f", &A);
	
	for(a=0;a<4;a++)
		for(i=0;i<2;i++)
			for(j=0;j<2;j++){
		V[a]=M[i][j]*A;
	}
		for(a=0;a<4;a++)
		printf(" %.2f\n", V[a]);
}
