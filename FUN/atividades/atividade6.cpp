#include <stdio.h>
#include <stdlib.h>
main()
{
	int n1, n2, n3, n4, sm;
	printf("escreva quatro valores inteiros:\n");
	scanf("%d %d %d %d",&n1, &n2, &n3, &n4);
	
	if(n1%2==0)
	sm+= n1;
	
	if(n2%2==0)
	sm+= n2;
	
	if(n3%2==0)
	sm+= n3;
	
	if(n4%2==0)
	sm+= n4;
	
	printf("A soma, apenas dos valores pares, e de: %d\n", sm);
	system("pause");
}
