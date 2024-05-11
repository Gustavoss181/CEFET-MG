#include <stdio.h>
#include <stdlib.h>
main()
{
	float a, b, c;
	
	printf("digete tres valores\n");
	scanf("%d %d %d",&a, &b, &c);
	
	if(a+b>c && a+c>b && b+c>a){
		printf("pode formar um triangulo ");
		if(a==b && a==c && b==c)
		printf("equilatero");
		else if(a!=b && a!=c && b!=c)
		printf("escaleno");
		else
		printf("isosceles");
	}
	else
	printf("\nnao pode formar um triangulo\n");
}
