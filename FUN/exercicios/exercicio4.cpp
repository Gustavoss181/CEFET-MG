#include <stdio.h>
#include <stdlib.h>
main()
{ 
	int horasT, code, nDep, salB;
	float salL,inss,ir;
	
	printf("para parar o programa digite 0 no codigo\n");
	while(code!=0){
		printf("digite o codigo, o numero de horas trabalhadas e o numero de dependentes\n");
		scanf("%d %d %d",&code,&horasT,&nDep);
		salB=(12*horasT)+(40*nDep);
		inss=salB*0.085;
		ir=salB*0.05;
		salL=salB-salB*0.135;
	printf("o codigo escrito foi %d\n",code);
	printf("valor descontado do INSS foi %f\n",inss);
	printf("valor descontado do IR foi %f\n",ir);
	printf("o salario liquido eh %f\n",salL);	
	}
	
}
