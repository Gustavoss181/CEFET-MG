#include <stdio.h>
#include <stdlib.h>
main()
{
	float n1, n2, n3;
	
	printf("digite tres valores distintos\n");
	scanf("%f %f %f",&n1,&n2,&n3);
	
	if(n1<n2 && n2<n3)
	printf("a ordem crescente eh %.2f, %.2f, %.2f",n1,n2,n3);
	else if(n1<n3 && n3<n2)
	printf("a ordem crescente eh %.2f, %.2f, %.2f",n1,n3,n2);
	else if(n2<n3 && n3<n1)
	printf("a ordem crescente eh %.2f, %.2f, %.2f",n2,n3,n1);
	else if(n2<n1 &&n1<n3)
	printf("a ordem crescente eh %.2f, %.2f, %.2f",n2,n1,n3);
	else if(n3<n2 && n2<n1)
	printf("a ordem crescente eh %.2f, %.2f, %.2f",n3,n2,n1);
	else if(n3<n1 && n1<n2)
	printf("a ordem crescente eh %.2f, %.2f, %.2f",n3,n1,n2);
}
