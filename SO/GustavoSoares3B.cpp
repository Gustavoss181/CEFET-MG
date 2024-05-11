#include<stdlib.h>
#include<stdio.h>
#include<string.h>

main(){
	char tarefa[10];
	gets(tarefa);
	int numPro;
	scanf("%d", &numPro);
	int uniTempo[numPro], aux[numPro], letra = 65;
	for(int i=0; i<numPro; i++){
		scanf("%d", &uniTempo[i]);
		aux[i] = uniTempo[i];
	}
	
	if(strcmp(tarefa, "Mono") == 0 || strcmp(tarefa, "mono") == 0){
		for(int i=0; i<numPro; i++){
			if(uniTempo[i] > 0){
				printf("%c%d ", letra, aux[i]-uniTempo[i]+1);
				uniTempo[i]--;
				i--;
			}
			else{
				letra++;
			}
		}
	}
	else if(strcmp(tarefa, "Multi") == 0 || strcmp(tarefa, "multi") == 0){
		int maior = uniTempo[0];
		for(int i=1; i<numPro; i++)
			if(uniTempo[i] > maior)
				maior = uniTempo[i];
		
		for(int j=0; j<maior; j++){
			for(int i=0; i<numPro; i++){
				if(uniTempo[i] > 0){
					printf("%c%d ", letra, aux[i]-uniTempo[i]+1);
					uniTempo[i]--;
				}
				letra++;
			}
			letra = 65;
		}
	}
	else{
		printf("Valor invalido");
	}
	printf("\n");
	system("pause");
}
