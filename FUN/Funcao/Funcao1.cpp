#include<stdlib.h>
#include<stdio.h>
#include<string.h>

int Menor(int n1, int n2, int n3)
{
	int menor;
	if(n1<=n2 && n1<=n3)
	menor=n1;
	else if(n2<=n1 && n2<=n3)
	menor=n2;
	else menor=n3;
	
	return menor;
}

int Maior(int n1, int n2, int n3)
{
	int maior;
	if(n1>=n2 && n1>=n3)
	maior=n1;
	else if(n2>=n1 && n2>=n3)
	maior=n2;
	else maior=n3;
	
	return maior;
}

main(){
	int n1, n2, n3;
	
	scanf("%d",&n1);
	scanf("%d",&n2);
	scanf("%d",&n3);
	
	int maior = Maior(n1,n2,n3);
	int menor = Menor(n1,n2,n3);
	
	printf("Menor valor: %d\n", menor);
	printf("Maior valor: %d\n", maior);
}
