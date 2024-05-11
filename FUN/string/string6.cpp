#include<stdlib.h>
#include<stdio.h>
#include<string.h>
#define i 10
main(){
	int code[i];
	float preco[i], reaj;
	int z;
	for(z=0;z<i;z++){
	printf("Produto %d:\n", z+1);
	printf("Codigo: ");
	scanf("%d",&code[z]);
	printf("Preco: ");
	scanf("%f",&preco[z]);
	printf("\n");
	}
	printf("Informe o reajuste: ");
	scanf("%f", &reaj);
	printf("\n");
	for(z=0;z<i;z++){
	printf("Produto %d:\n", z+1);
	printf("Codigo: %d\n", code[z]);
	printf("Preco: %.2f\n", preco[z]);
	printf("Reajuste: %.2f\n", preco[z]*((100-reaj)/100));
	}
}
