#include<stdlib.h>
#include<stdio.h>

main(){
	int A, L, N;
	scanf("%d%d%d", &A, &L, &N);
	int molduras[2][N];
	for(int i=0; i<N; i++){
		int x, y;
		scanf("%d%d", &x, &y);
		if(A > L){
			if(x > y){
				molduras[0][i] = x;
				molduras[1][i] = y;
			}else{
				molduras[0][i] = y;
				molduras[1][i] = x;
			}
		}else{
			if(x < y){
				molduras[0][i] = x;
				molduras[1][i] = y;
			}else{
				molduras[0][i] = y;
				molduras[1][i] = x;
			}
		}
	}
	int melhor[2] = {999999999, -1};
	for(int i=0; i<N; i++){
		if(A > molduras[0][i] || L > molduras[1][i]){
			
		}
		else{
			if(melhor[0] > ((molduras[0][i]*molduras[1][i]) - (A*L))){
				melhor[0] = (molduras[0][i]*molduras[1][i]) - (A*L);
				melhor[1] = i+1;
			}
		}
	}
	printf("%d", melhor[1]);
}
