#include <stdio.h>
#include <stdlib.h>

int fat(int n){
	if(n==0)
		return 1;
	else
		return n*fat(n-1);
}

main(){
	int n;
	
	printf("Digite um valor: ");
	scanf("%d", &n);
	n= fat(n);
	printf("%d", n);
}
