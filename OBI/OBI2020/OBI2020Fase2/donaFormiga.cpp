#include<stdlib.h>
#include<stdio.h>

main(){
	int S, T, P;
	scanf("%d%d%d", &S, &T, &P);
	int altura[2][S];
	for(int i=0; i<S; i++){
		scanf("%d", &altura[1][i]);
		altura[0][i] = i+1;
	}
	int conexao[2][T];
	for(int i=0; i<T; i++){
		scanf("%d%d", &conexao[0][i], &conexao[1][i]);
	}
	
	for(int i=0; i<S-1; i++){
		for(int j=i+1; j<S; j++){
			if(altura[1][i] < altura[1][j]){
				int aux = altura[1][i];
				altura[1][i] = altura[1][j];
				altura[1][j] = aux;
				aux = altura[0][i];
				altura[0][i] = altura[0][j];
				altura[0][j] = aux;
			}
		}
	}
	int cont=0;
	for(int i=0; i<S-1; i++){
		for(int j=0; j<T; j++){
			if(conexao[0][j] == altura[0][i] && conexao[1][j] == altura[0][i+1] || conexao[1][j] == altura[0][i] && conexao[0][j] == altura[0][i+1]){
				cont++;
				break;
			}
		}
	}
	
}
