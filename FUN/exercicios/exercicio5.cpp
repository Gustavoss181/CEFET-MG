#include <stdio.h>
#include <stdlib.h>
main()
{
	int code, quant;
	float pTotal=0, p;
	printf("para parar digite 0\n");
	do{
		printf("escreva o codigo do produto e a quantidade comprada respectivamente\n");
		scanf("%d %d",&code, &quant);
		switch(code){
		case 1001: p=5.32*quant; break;
		case 1324: p=6.45*quant; break;
		case 6548: p=2.37*quant; break;
		case 987:  p=5.32*quant; break;
		case 7623: p=6.45*quant; break;
		case 0:		printf("programa finalizado\n");
		default:
			printf("codigo invalido\n");
		}
		pTotal=pTotal+p;
	}while(code!=0);
printf("o valor final eh %.2f\n",pTotal);
}
