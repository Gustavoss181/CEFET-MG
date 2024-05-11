#include <stdio.h>
#include <stdlib.h>

int Pot(int base, int exp){
	if(exp==0)
		return 1;
	else
		return(base*Pot(base, exp-1));
}


main(){
	int base, exp, n;
	printf("base: ");
	scanf("%d", &base);
	printf("expoente: ");
	scanf("%d", &exp);
	n=Pot(base, exp);
	printf("%d", n);
}

