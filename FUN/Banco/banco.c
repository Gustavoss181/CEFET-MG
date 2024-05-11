#include <stdio.h>
#include <stdlib.h>
#include "banco.h"

int VerificarConta(Contas cnt[], int cont){
	int i, j, num=0;
	for(i=0;i<cont;i++)
		if(cnt[i].nconta==cnt[cont].nconta){
			printf("Esse numero de conta ja existe\n");
			num=1;
		}
	return num;
}

void CriarNovasContas(Contas cnt[], int cont){
	int num=0;
	while(num==0){
		printf("Digite o numero da conta: ");
		scanf("%d",&cnt[cont].nconta);
		if(cont>0)
			num=VerificarConta(cnt, cont);
		if(num==1){
			num=0;
			return;
		}
		printf("Digite o saldo: ");
		scanf("%f",&cnt[cont].saldo);
		num=1;
	}
	system("pause");
	system("cls");
}

void ImprimirContas(Contas cnt[], int cont){
	int i;
	for(i=0;i<cont;i++){
		printf("numero da conta: %d\n",cnt[i].nconta);
	}
	system("pause");
	system("cls");
}

void ZerarConta(Contas cnt[], int cont){
	int num, i, boo=0;
	printf("Digite o numero da conta: ");
	scanf("%d", &num);
	for(i=0;i<cont;i++)
		if(num==cnt[i].nconta){
			printf("Saldo antigo: %.2f\n", cnt[i].saldo);
			cnt[i].saldo=0;
			printf("Conta zerada");
			boo=1;
		}
		if(boo==0)
			printf("Esse numero de conta nao existe\n\n");
	system("pause");
	system("cls");
}

void Depositar(Contas cnt[], int cont){
	int num, i, boo=0;
	float dep;
	printf("Digite o numero da conta: ");
	scanf("%d", &num);
	for(i=0;i<cont;i++)
		if(num==cnt[i].nconta){
			printf("Digite o valor do deposito: ");
			scanf("%f", &dep);
			cnt[i].saldo+=dep;
			boo=1;
		}
		if(boo==0)
			printf("Esse numero de conta nao existe\n\n");
	system("pause");
	system("cls");
}

void Sacar(Contas cnt[], int cont){
	int num, i, boo=0;
	float sac;
	printf("Digite o numero da conta: ");
	scanf("%d", &num);
	for(i=0;i<cont;i++)
		if(num==cnt[i].nconta){
			printf("Digite o valor do saque: ");
			scanf("%f", &sac);
			cnt[i].saldo-=sac;
			boo=1;
		}
		if(boo==0)
			printf("Esse numero de conta nao existe\n\n");
	system("pause");
	system("cls");
}

void ImprimirSaldo(Contas cnt[], int cont){
	int num, i, boo=0;
	printf("Digite o numero da conta: ");
	scanf("%d", &num);
	for(i=0;i<cont;i++)
		if(num==cnt[i].nconta){
			printf("\nSaldo atual\n\n");
			printf("conta: %d\n", cnt[i].nconta);
			printf("Saldo: %.2f", cnt[i].saldo);
			boo=1;
		}
		if(boo==0)
			printf("Esse numero de conta nao existe\n\n");
	system("pause");
	system("cls");
}















