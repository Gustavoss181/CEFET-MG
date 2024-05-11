#include <stdio.h>
#include <stdlib.h>
main()
{
	float n1, n2, n3;
	printf("informe tres valores distintos\n");
	scanf("%f %f %f", &n1,&n2,&n3);
	
	if(n1>n2 && n1>n3)
	printf("%.2f eh o maior",n1);
	else if(n2>n1 && n2>n3)
	printf("%.2f eh o maior",n2);
	else
	printf("%.2f eh o maior",n3);
}
