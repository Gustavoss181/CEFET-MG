#include<stdlib.h>
#include<stdio.h>
#include<string.h>

int Soma(int a, int b){
	int soma=a+b;
	return soma;
}

void Imprime(int a, int b, int soma);

main(){
	int a, b;
	printf("Informe um numero: ");
	scanf("%d",&a);
	printf("Informe um numero: ");
	scanf("%d",&b);
	
	int soma = Soma(a,b);
	Imprime(a,b,soma);
	system("pause");

}
void Imprime(int a,int b,int soma){
	printf("Operacao realizada=> %d + %d = %d\n", a,b,soma);
}
