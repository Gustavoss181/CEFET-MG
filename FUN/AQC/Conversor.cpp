#include <stdio.h>
#include <stdlib.h>
#include <math.h>
main()
{
	int i, n, result=0;
	printf("Numero de bits: ");
	scanf("%d",&n);
	char bi[n];
	
	printf("Escreva o numero: ");
	for(i=(n-1); i>=0; i--){
		scanf("%c", &bi[i]);
	}
	
	for(i=0; i<n; i++){
		result+=(bi[i]-'0')*pow(2,i);
	}
	printf("%d",result);
}
