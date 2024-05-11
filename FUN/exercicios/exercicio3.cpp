#include <stdio.h>
#include <stdlib.h>
main()
{
float num=1, den=1;
float soma=0;
printf("aguarde...\n");
	while(num<100){
		soma=soma+(num/den);
		num=num+2;
		den=den+1;
	}
	printf("o resultado da soma eh %.2f",soma);
}
