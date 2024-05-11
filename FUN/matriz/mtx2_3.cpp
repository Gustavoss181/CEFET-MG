#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#define a 10
main(){
	int vet[a];
	int i, j;
	
	for(i=0;i<a;i++){
		printf("digite um valor %d: ", i+1);
		scanf("%d", &vet[i]);
			for(j=0;j<i;j++){
				if(vet[i]==vet[j]){
					printf("Numero invalido! Digite um novo numero diferente dos anteriores!\n");
					printf("digite um valor %d: ", i+1);
					scanf("%d", &vet[i]);
				}
			}
	}
	printf("\nnumeros digitados: ");
	for(i=0;i<a;i++)
	printf("%d, ", vet[i]);
}
