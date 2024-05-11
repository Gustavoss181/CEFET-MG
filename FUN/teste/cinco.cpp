#include <stdlib.h>
#include <stdio.h>
#include <math.h>

main(){
	int qtdN;
	double aux, intR = -1;
	
	scanf("%d", &qtdN);
	
	int principal[qtdN], resultado[qtdN], teste[qtdN];
	
	for(int i=0; i<qtdN; i++){
		scanf("%d", &principal[i]);
		resultado[i] = -1;
	}
	
	for(int i=qtdN-2; i>=0; i--){
	//for(int i=0; i<qtdN; i++){
		// procuro no vetor principal um valor divisivel por 5
		if(principal[i] == 5 || principal[i] == 0){
			// coloco os valores no resultado
			for(int j=0; j<qtdN; j++){
				teste[j] = principal[j];
				if(j == i){
					teste[j] = principal[qtdN-1];
				}
				if(j == qtdN-1){
					teste[j] = principal[i];
				}
			}
			aux = 0;
			for(int j=0; j<qtdN; j++){
				aux+= teste[j]*pow(10, (qtdN - 1 - j));
			}
			if(aux > intR){
				intR = aux;
				for(int j=0; j<qtdN; j++){
					resultado[j] = teste[j];
				}
			}
		}
	}
	if(intR == -1){
		printf("-1");
	}else{
		for(int i=0; i<qtdN; i++){
			printf("%d ", resultado[i]);
		}
	}
}


















