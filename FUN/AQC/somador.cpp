#include <stdlib.h>
#include <stdio.h>
#include <math.h>
#define max 10

int* conversorBi(int dec){
	int *bi;
	bi = (int *) malloc(sizeof(int) * max);
	
	for(int i=0;i<max;i++){
		bi[i]=dec%2;
		dec /= 2;
	}
	return bi;
}

int* fullAdder(int*bi1, int*bi2){
	int *s, t=0, a,b;
	s = (int *) malloc(sizeof(int) * max);
	
	for(int i=0;i<max;i++){
		a=bi1[i];
		b=bi2[i];
		
		s[i] = ( ( a && (!b) && (!t) ) || ( (!a) && (!b) && t) || ( a && b && t ) );
		
		t = ( ( a && t ) || ( a && b ) || ( t && b ) );
	}
	
	return s;
}

int conversorDec(int*bi){
	int dec=0;
	for(int i=0;i<max;i++){
		dec += bi[i]*( pow(2,i) );
	}
	return dec;
}

main(){
	int dec1, dec2, *bi1, *bi2, *total, decTotal;
	
	system("color 0a");
	printf("\t\t\bSomador Binario\n\n\n");
	while(true){
	printf("Primeiro numero: ");
	scanf("%d", &dec1);
	printf("Segundo numero: ");
	scanf("%d", &dec2);
	
	bi1=conversorBi(dec1);
	bi2=conversorBi(dec2);
	
	total=fullAdder(bi1,bi2);
	
	printf("\n\n%d == ", dec1);
	for(int i=(max-1);i>=0;i--){
		printf("%d",bi1[i]);
	}
	printf("\n%d == ", dec2);
	for(int i=(max-1);i>=0;i--){
		printf("%d",bi2[i]);
	}
	
	decTotal = conversorDec(total);
	printf("\n%d == ", decTotal);
	for(int i=(max-1);i>=0;i--){
		printf("%d",total[i]);
	}
	printf("\n\n");
	system("pause");
	system("cls");
	}
}
