#include <stdio.h>
#include <stdlib.h>

int Som(int n, int m){
	if(n==m)
		return 0;
	else
		return n+Som(n-1, m);
}

main(){
	int n, m;
	printf("Digite um numero: ");
	scanf("%d", &n);
	printf("Parada: ");
	scanf("%d", &m);
	n=Som(n, m);
	printf("%d", n);
}
