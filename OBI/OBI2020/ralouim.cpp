#include<stdlib.h>
#include<stdio.h>
#include<math.h>

void calculaTenda(int tendas[][], ){
	float maiorDis=0;
	int indice;
	for(int i=0; i<n; i++){
		float dis;
		dis = sqrt(pow(tendas[i][0], 2) + pow(tendas[i][1], 2));
		if(dis > maiorDis){
			maiorDis = dis;
			indice = i;
		}
	}
}

main(){
	int n;
	scanf("%d", &n);
	int tendas[n][2];
	for(int i=0; i<n; i++){
		scanf("%d", &tendas[i][0]);
		scanf("%d", &tendas[i][1]);
	}
	
	printf("\n%f", maiorDis);
	printf("\n%d", indice);
}
