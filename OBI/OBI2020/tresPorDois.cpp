#include<stdlib.h>
#include<stdio.h>

main(){
	int n;
	scanf("%d", &n);
	int p[n];
	for(int i=0; i<n; i++){
		scanf("%d", &p[i]);
	}
	
	for(int i=0; i<n; i++){
		int maior = -999;
		int indice;
		for(int j=i; j<n; j++){
			if(p[j] > maior){
				maior = p[j];
				indice = j;
			}
		}
		int aux = p[i];
		p[i] = p[indice];
		p[indice] = aux;
	}
	int cont=0;
	int soma=0;
	for(int i=0; i<n; i++){
		cont++;
		if(cont == 3){
			cont=0;
		}
		else{
			soma += p[i];
		}
	}
	printf("%d", soma);
}
