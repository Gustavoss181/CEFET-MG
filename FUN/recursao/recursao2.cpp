#include <stdio.h>
#include <stdlib.h>

int Fib(int n){
	if(n<=0)
		return 0;
	else if(n==1)
		return 1;
	else
		return Fib(n-1) + Fib(n-2);
}

main(){
	int n;
	scanf("%d", &n);
	n=Fib(n);
	printf("%d", n);
}
