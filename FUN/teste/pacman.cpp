#include<stdlib.h>
#include<stdio.h>
#include<conio.h>
#include<time.h>
#include<windows.h>
#define mapaA 15
#define mapaL 45
//[(mapaA*mapaL)]
int p[2] = {23, 8};
int fruta[2];
char direcao = 'd';
char mapa[mapaA][mapaL];

void novaFruta(){
	srand(time(NULL));
	
	do{
		fruta[0] = (rand() % (mapaL-2))+1;
		fruta[1] = (rand() % (mapaA-2))+1;
	}
	while(fruta[0] == p[1] && fruta[1] == p[0]);
	
	mapa[fruta[1]][fruta[0]] = '+';
	
}

void mapear(){
	/*FILE *fp;
	char c;
	fp = fopen("mapa.txt","r");
	if(!fp){
	    printf( "Erro na abertura do arquivo");
	}
	int i = 0, j = 0;
	while((c = getc(fp) ) != EOF){
		if(c == 10){
			j++;
			i = 0;
		}
		else{
			mapa[i][j] = c;
			i++;
		}
	}
	fclose(fp);*/
	
	for(int i=0; i<mapaA; i++){
		for(int j=0; j<mapaL; j++){
			if(i == 0 || i == 14){
				mapa[i][j] = '=';
			}
			else if(j == 0 || j == 44){
				mapa[i][j] = '|';
			}
			else{
				mapa[i][j] = ' ';
			}
		}
	}
	mapa[p[1]][p[0]] = '@';
}

void showMapa(){
	system("cls");
	
	if(fruta[0] == p[0] && fruta[1] == p[1]){
		novaFruta();
	}
	
	Sleep(10);
	
	for(int i=0; i<mapaA; i++){
		for(int j=0; j<mapaL; j++){
			printf("%c", mapa[i][j]);
		}
		printf("\n");
	}
}

void teclado(){
	char tecla = getch();
	switch(tecla){
		case 'w': //cima
	      	direcao = 'c';
	        break;
	    case 's': //baixo
	       	direcao = 'b';
	        break;
	    case 'a':
	    	direcao = 'e';
	    	break;
	    case 'd':
	    	direcao = 'd';
	    	break;
	    case 27:
	    	direcao = 's';
	    	break;
	}
}

void movimento(){
	
	mapa[p[1]][p[0]] = ' ';
	
	if(direcao == 'c'){
		p[1]--;
	}
	if(direcao == 'b'){
		p[1]++;
	}
	if(direcao == 'e'){
		p[0]--;
	}
	if(direcao == 'd'){
		p[0]++;
	}
	
	mapa[p[1]][p[0]] = '@';
}

main(){
	int tIni = clock(), tFim;
	mapear();
	novaFruta();
	do{
		if(kbhit()){
		    teclado();
		}
		tFim = clock();
		if ((tFim - tIni) >= 250){
		 	movimento();
		 	showMapa();
		   	tIni = clock();
		}
	}while(direcao != 's');
}
