#include <stdio.h>
#include <stdlib.h>
main()
{
	int num;
	printf("multiplos de 3 entre 0 e 1000\n");
	for(num=0; num<=1000; num++){
	if(num%3==0)
	printf("%d\n",num);
	}
		printf("multiplos de 5 entre 0 e 1000\n");
	for(num=0; num<=1000; num++){
	if(num%5==0)
	printf("%d\n",num);
	}
}
