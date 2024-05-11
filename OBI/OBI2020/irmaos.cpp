#include<stdlib.h>
#include<stdio.h>

main(){
	int novo, meio, velho;
	
	scanf("%d", &novo);
	scanf("%d", &meio);
	
	velho = meio + (meio-novo);
	
	printf("%d", velho);
}
