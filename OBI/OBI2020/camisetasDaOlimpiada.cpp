#include<stdlib.h>
#include<stdio.h>

main(){
	int n;
	scanf("%d", &n);
	int t[n], p, m;
	for(int i=0; i<n; i++){
		scanf("%d", &t[i]);
	}
	scanf("%d", &p);
	scanf("%d", &m);
	
	int np=0, nm=0;
	for(int i=0; i<n; i++){
		if(t[i] == 1){
			np++;
		}
		else if(t[i] == 2){
			nm++;
		}
	}
	if(np <= p && nm <= m){
		printf("S");
	}else{
		printf("N");
	}
}
