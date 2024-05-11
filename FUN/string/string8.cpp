#include<stdlib.h>
#include<stdio.h>
#include<string.h>
#define a 5
main(){
	char nome[a][50];
	int emb[a], des[a];
	int i, j=0;
	
	strcpy(nome[0],"Campinas");
	strcpy(nome[1],"Sao Paulo");
	strcpy(nome[2],"Sao Jose dos Campos");
	strcpy(nome[3],"Resende");
	strcpy(nome[4],"Rio de Janeiro");
	
	for(i=0;i<a;i++){
		printf("\nEstacao %d: %s", i, nome[i]);
		printf("\n- Quantos passageiros embarcaram: ");
		scanf("%d", &emb[i]);
		printf("- Quantos passageiros desembarcaram: ");
		scanf("%d", &des[i]);
	}
	printf("\nTotal de passageiros embarcados: %d\n", emb[0]+emb[1]+emb[2]+emb[3]+emb[4]);
	
		printf("\nCirculacao de passageiros por estacao: (entra+sai)");
	for(i=0;i<a;i++){
		printf("\nEstacao %d: %d", i, emb[i]+des[i]);
	}
	printf("\nPassageiros transportados por estacao: (dentro do trem ao sair da estacao)");
	for(i=0;i<a;i++){
		j+=emb[i]-des[i];
		printf("\nEstacao %d: %d",i,j);
	}
	j=0;
	for(i=0;i<a;i++)
		j+=emb[i]-des[i];
	printf("\nDiferenca entre Embarque-Desembarque (problema no controle de passageiros): %d", j);
}














