#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#define a 2
#define b 3
main(){
	int A[a][b], B[a][b], C[a][b];
	int i, j;
	
	printf("Informe os valores da matrix A:\n");
	for(i=0;i<a;i++)
		for(j=0;j<b;j++){
			scanf("%d", &A[i][j]);
		}
	printf("Informe os valores da matrix B:\n");
	for(i=0;i<a;i++)
		for(j=0;j<b;j++){
			scanf("%d", &B[i][j]);
		}
	for(i=0;i<a;i++)
		for(j=0;j<b;j++){
			C[i][j]=A[i][j]+B[i][j];
		}
	printf("Os valores da matrix C:\n");
	for(i=0;i<a;i++){
		for(j=0;j<b;j++)
			printf("%3d", C[i][j]);
		printf("\n\n");
		}

}
