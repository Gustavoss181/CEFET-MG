#include <stdio.h>
#include <stdlib.h>
#include <math.h>

void Peso(int n, char palavra[], int k){
	int peso = 0;
	
	for(int i=0; i<n; i++){
		if(palavra[i] == 'b'){
			peso+=pow(2, n-i-1);
		}
	}
	
	printf("Palavra %d\n", k);
	printf("%d\n", peso);
	printf("\n");
}

main(){
	char palavra[60], c;
	FILE *fp;
	int k = 0, n = 0;
	
	fp = fopen("arquivo.txt","r");   /* Arquivo ASCII, para leitura */
	if(!fp){
	    printf( "Erro na abertura do arquivo");
	    printf("\a");
	}
	
	while((c = getc(fp)) != EOF){   /* Enquanto n?o chegar ao final do arquivo */
		if(c == 10){
			palavra[n] = '\0';
			Peso(n, palavra, k+1);
	    	n=0;
	    	k++;
		}else{
			palavra[n] = c;
			n++;
		}
	}
	fclose(fp);
	
	return 0;
}
