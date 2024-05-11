#include<stdlib.h>
#include<stdio.h>
#include<string.h>

int Soma(int a, int b)
{
	int i, soma=0;
	for(i=a;i<=b;i++)
	soma+=i;
	return soma;
}

main(){
	int a, b;
	
	scanf("%d %d", &a, &b);
	int soma= Soma(a,b);
	printf("\nSomatorio entre %d e %d: %d\n\n", a, b, soma);
	system("pause");
}
