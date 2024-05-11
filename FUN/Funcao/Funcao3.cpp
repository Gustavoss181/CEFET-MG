#include <stdio.h>
#include <stdlib.h>
	int Com(float v, float c, float co)
	{
		float coA, coB, p;
		p=c/100;
		coA=v*p;
		coB=v*0.1;
		co=coA-coB;
		return co;		
	}
	
	
int main()
{
	float v, c;
	printf("Informe o valor das vendas do funcionario:\n");
	scanf("%f", &v);
	printf("Informe o percentual de comissao:\n");
	scanf("%f", &c);
	float co=Com(v,c,co);
	printf("Comissao a ser recebida pelo funcionario:\n%.2f\n", co);	
	system("pause");
	return 0;
}













