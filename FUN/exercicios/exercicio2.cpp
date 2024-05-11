#include <stdio.h>
#include <stdlib.h>
main()
{
float saldoM, valorC;

printf("informe o valor do saldo medio\n");
scanf("%f",&saldoM);

if(saldoM<201)
valorC=0;
else if(saldoM<401)
valorC=saldoM*0.2;
else if(saldoM<601)
valorC=saldoM*0.3;
else
valorC=saldoM*0.4;
printf("o valor do saldo medio eh %.2f\n",saldoM);
printf("o valor do credito eh %.2f\n",valorC);
}
