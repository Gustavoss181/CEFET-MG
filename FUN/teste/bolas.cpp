#include <stdlib.h>
#include <stdio.h>

main(){
	int num[8];
	char result = 'S';
	
	for(int i=0; i<8; i++){
		scanf("%d", &num[i]);
	}
	
	for(int j=0; j<10; j++){
		int cont = 0;
		for(int i=0; i<8; i++){
			if(num[i] == j){
				cont++;
			}
		}
		if(cont>4){
			result = 'N';
		}
	}
	
	printf("%c", result);
}
