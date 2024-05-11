#include<stdlib.h>
#include<stdio.h>

double fatorial(double n){
	double fatorial = 1;
	for(double i=1; i<=n; i++)
		fatorial*=i;
	return fatorial;
}

double combinacao(double n, double p){
	//a ordem não é importante
	double C;
	C = fatorial(n)/(fatorial(p)*fatorial(n-p));
	return C;
}

double arranjo(double n, double p){
	//a ordem é importante
	double A;
	A = fatorial(n)/fatorial(p);
	return A;
}

void trianguloPascal(double n){
	for(double i=0; i<=n; i++){
		for(double j=0; j<=n; j++){
			double tri = combinacao(i, j);
			if(tri >= 1 && !(i == 0 && j == 1))
				printf("%7.0f", tri);
		}
		printf("\n\n");
	}
}

main(){
	int a, n, p;
	while(true){
		printf("Escolha uma das opcoes:\n");
		printf("1-Permutacao simples\n");
		printf("2-Arranjo simples\n");
		printf("3-Combinacao simples\n");
		scanf("%d", &a);
		switch(a){
			case 1:
				scanf("%d", &n);
				printf("%.0f\n", fatorial(n));
				system("pause");
				system("cls");
				break;
			case 2:
				scanf("%d%d", &n, &p);
				printf("%.0f\n", arranjo(n, p));
				system("pause");
				system("cls");
				break;
			case 3:
				scanf("%d%d", &n, &p);
				printf("%.0f\n", combinacao(n, p));
				system("pause");
				system("cls");
				break;
			default:
				system("cls");
				break;
		}
	}
}












