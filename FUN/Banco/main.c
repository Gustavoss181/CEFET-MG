#include <stdio.h>
#include <stdlib.h>
#include "banco.h"

void main(){
	Contas cnt[100];
	int a=1, cont=0;
	while(a!=0){
		printf("MENU\n\n");
		printf("\nO que gostaria de fazer?\n");
		printf("0- Fechar o Programa\n");
		printf("1- Criar nova conta\n");
		printf("2- Imprimir Contas\n");
		printf("3- Zerar Saldo da Conta\n");
		printf("4- Depositar\n");
		printf("5- Sacar\n");
		printf("6- Imprimir Saldo\n");
		scanf("%d",&a);
		system("cls");
		switch(a){
			case 0: system("pause"); break;
			case 1: CriarNovasContas(cnt, cont); cont++; break;
			case 2: ImprimirContas(cnt, cont); break;
			case 3: ZerarConta(cnt, cont); break;
			case 4: Depositar(cnt, cont); break;
			case 5: Sacar(cnt, cont); break;
			case 6: ImprimirSaldo(cnt, cont); break;
			default: printf("Opcao invalida\n"); 
		}
	}
}
