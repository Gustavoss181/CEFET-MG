#include <stdio.h>
#include <stdlib.h>
main()
{	
	int num;
	printf("numeros divisiveis por 4 entre 0 e 10000\n");
	for(num=0; num<=10000; num++){
	if(num%4==0)
	printf("%d\n",num);
	}
}

