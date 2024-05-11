#include<stdlib.h>
#include<stdio.h>
#include<string.h>
#define I 1
main(){
	int mat[I], CodDisc[I];
	float nota1[I], nota2[I], media[I];
	int z;
	for(z=0;z<I;z++){
		printf("Numero de matricula do aluno %d: ",z+1);
		scanf("%d", &mat[z]);
		printf("Cod. Disc. do aluno %d: ",z+1);
		scanf("%d", &CodDisc[z]);
		printf("Nota 1 do aluno %d: ",z+1);
		scanf("%f", &nota1[z]);
		printf("Nota 2 do aluno %d: ",z+1);
		scanf("%f", &nota2[z]);
		media[z]=((nota1[z]*1)+(nota2[z]*2))/3;
	printf("\n");
	}
	for(z=0;z<I;z++)
	printf("Media do aluno %d: %.2f\n", z+1,media[z]);	
}
