#include<stdlib.h>
#include<stdio.h>
#include<string.h>
main(){
	char code[80];
	int z, size;
	
	printf("Digite o texto: ");
	gets(code);
	size=strlen(code);
	for(z=0;z<size;z++){
		if(code[z]>=97 && code[z]<=122)
		code[z]=code[z]-32;
	}
	printf("\n\n\n\n%s\n\n\n\n",code);
}
