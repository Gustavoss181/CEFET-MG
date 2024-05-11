#include <stdio.h>
#include <stdlib.h>

int Som(int n){
	if(n==0)
		return 0;
	else if(n==1)
		return 1;
	else
		return n+Som(n-1);
}

main(){
	int n;
	scanf("%d", &n);
	n=Som(n);
	printf("%d", n);
}
