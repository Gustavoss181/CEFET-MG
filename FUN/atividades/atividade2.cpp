#include <stdio.h>
#include <stdlib.h>
main()
{
	float n1, n2, n3, soma;
	printf("informe tres valores distintos\n");
	scanf("%f %f %f", &n1,&n2,&n3);
	
	if(n1<n2 && n1<n3)
	soma=n2+n3;
	else if(n2<n1 && n2<n3)
	soma=n1+n3;
	else
	soma=n1+n2;
	
	printf("a soma dos maiores eh %.2f",soma);
}
