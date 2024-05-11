#include<stdio.h>

#include<stdlib.h>

main(){

	int a,b,c,x,y,m1,m2,soma;

	printf("Informe 5 valores diferentes\n");

		scanf("%d%d%d%d%d",&a,&b,&c,&x,&y);

		if(a>m1){
			m1=a;
		}
		if (b>m1){
			m1=b;
		}
		if (c>m1){
			m1=c;
		}
		if (x>m1){
			m1=x;
		}
		if(y>m1){
			m1=y;
		}
		if((a>m2) && (a<m1)){
			m2=a;
		}
		if((b>m2) && (b<m1)){
			m2=b;
		}
		if((c>m2) && (c<m1)){
			m2=c;
		}
		if((x>m2) && (x<m1)){
			m2=x;
		}
		if((y>m2) && (y<m1)){
			m2=y;
		}
		soma=m1+m2;
		
		printf("A soma dos dois maiores eh:%d",soma);

}
