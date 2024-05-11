#include <stdio.h>
#include <stdlib.h>
main()
{
	int m1, m2, f1, f2, soma, prod;
	
	printf("escreva as idades distintas de dois homens\n");
	scanf("%d %d",&m1,&m2);
	printf("escreva as idades distintas de duas mulheres\n");
	scanf("%d %d",&f1,&f2);
	
	if(m1-m2<0 && f1-f2<0)
	soma=m2+f1;
	else if(m1-m2>0 && f1-f2>0)
	soma=m1+f2;
	else if(m1-m2<0 && f1-f2>0)
	soma=m2+f2;
	else
	soma=m1+f1;
	
	if(m1-m2<0 && f1-f2<0)
	prod=m1*f2;
	else if(m1-m2>0 && f1-f2>0)
	prod=m2*f1;
	else if(m1-m2<0 && f1-f2>0)
	prod=m1*f1;
	else
	prod=m2*f2;
	
	printf("a soma das idades do homem mais velho com a mulher mais nova eh %d\n",soma);
	printf("o produto das idades do homem mais novo com a mulher mais velha eh %d",prod);
}
