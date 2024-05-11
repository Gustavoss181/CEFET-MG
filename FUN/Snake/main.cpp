#include<stdlib.h>
#include<stdio.h>
#include<time.h>
#include<conio.h>
#include "snake.hpp"

int main(){
	int tIni = clock(), tFim;
	mapear();
	novaFruta();
	do{
		if(kbhit()){
		    teclado();
		}
		tFim = clock();
		if ((tFim - tIni) >= 150){
		 	movimento();
		 	showMapa();
		   	tIni = clock();
		}
	}while(direcaoP() != 's');
	morte();
	system("pause");
}
