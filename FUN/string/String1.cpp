#include<stdlib.h>
#include<stdio.h>
#include<string.h>
main(){
char re[50];	
int i=0;
	
	printf("digite seu nome: ");
	gets(re);
	for(i=0;i<4;i++){
		printf("%c",re[i]);
	}
	printf("\n\n");
	system("pause");
}
