#include <stdio.h>
#include <stdlib.h>
main()
{
	int a, b, c, n;
	
	for(a=0; a<2; a++) {
			for(b=0; b<2; b++) {
				for(c=0; c<2; c++) {
					n=(a&&b&&c);
					printf("%d%d%d = %d\n",a,b,c,n);
				}
			}
		}
}
