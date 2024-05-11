#include<stdlib.h>
#include<stdio.h>
#include<conio.h>
#include<time.h>
#include<windows.h>
#include "snake.hpp"
#define mapaA 21
#define mapaL 51
#define tamanhoI 5
//[(mapaA*mapaL)]
int p[(mapaA*mapaL)][2];
int cont = tamanhoI;
int fruta[2];
char mapa[mapaA][mapaL];
char direcao = 'd';

void logo(){
	FILE *fp;
	char c;
	fp = fopen("snakeLogo.txt","r");
	
	if(!fp)
	    printf( "Erro na abertura do arquivo");
	
	while((c = getc(fp) ) != EOF)
	    printf("%c", c);
	
	fclose(fp);
	
	Beep(330, 1000);
	Beep(500, 1000);
}

void inicializar(){
	for(int i=0; i<cont; i++){
		p[i][0] = mapaL/2+1;
		p[i][1] = mapaA/2+1;
	}
	logo();
	system("pause");
}

char direcaoP(){
	return direcao;
}

void mapear(){
	
	inicializar();
	
	for(int i=0; i<mapaA; i++){
		for(int j=0; j<mapaL; j++){
			if(i == 0 || i == mapaA-1){
				mapa[i][j] = '°';
			}
			else if(j == 0 || j == mapaL-1){
				mapa[i][j] = '°';
			}
			else{
				mapa[i][j] = ' ';
			}
		}
	}
	
	mapa[p[0][1]][p[0][0]] = '@';
}

void showMapa(){
	
	system("cls");
	
	if(fruta[0] == p[0][0] && fruta[1] == p[0][1]){
		novaFruta();
		Beep(523, 100);
		p[cont][0] = p[cont-1][0];
		p[cont][1] = p[cont-1][1];
		cont++;
	}
	
	Sleep(10);
	
	for(int i=0; i<mapaA; i++){
		for(int j=0; j<mapaL; j++){
			printf("%c", mapa[i][j]);
		}
		printf("\n");
	}
	printf("\nPontuacao: %d\n\n", cont-tamanhoI);
}

void novaFruta(){
	srand(time(NULL));
	
	fruta[0] = (rand() % (mapaL-2))+1;
	fruta[1] = (rand() % (mapaA-2))+1;
	
	for(int i=0; i<cont; i++){
		if(fruta[0] == p[i][1] && fruta[1] == p[i][0]){
			novaFruta();
		}
	}
	
	mapa[fruta[1]][fruta[0]] = '+';
	
}

void teclado(){
	char tecla = getch();
	switch(tecla){
		case 'w':
			if(direcao != 'b')
	      		direcao = 'c';
	        break;
	    case 's':
	       	if(direcao != 'c')	
				direcao = 'b';
	        break;
	    case 'a':
	    	if(direcao != 'd')
				direcao = 'e';
	    	break;
	    case 'd':
	    	if(direcao != 'e')
	    		direcao = 'd';
	    	break;
	    case 27:
	    	direcao = 's';
	    	break;
	}
}

bool colisao(int x, int y){
	if(x == 0 || x == mapaA-1){
		direcao = 's';
		return true;
	}
	if(y == 0 || y == mapaL-1){
		direcao = 's';
		return true;
	}
	for(int i=2; i<cont; i++){
		if(x == p[i][1] && y == p[i][0]){
			direcao = 's';
			return true;
		}
	}
	return false;
}

void movimento(){
	
	mapa[p[cont-1][1]][p[cont-1][0]] = ' ';
	
	for(int i=cont-1; i>0; i--){
		p[i][0] = p[i-1][0];
		p[i][1] = p[i-1][1];
		mapa[p[i][1]][p[i][0]] = 'O';
	}
	
	if(direcao == 'c'){
		if(!colisao(p[0][1]-1, p[0][0]))
			p[0][1]--;
	}
	if(direcao == 'b'){
		if(!colisao(p[0][1]+1, p[0][0]))
			p[0][1]++;
	}
	if(direcao == 'e'){
		if(!colisao(p[0][1], p[0][0]-1))
			p[0][0]--;
	}
	if(direcao == 'd'){
		if(!colisao(p[0][1]-1, p[0][0]+1))
			p[0][0]++;
	}
	
	mapa[p[0][1]][p[0][0]] = '@';
}

void morte(){
	for(int i=0; i<3; i++){
		mapa[p[0][1]][p[0][0]] = 197;
		showMapa();
		Sleep(100);
		mapa[p[0][1]][p[0][0]] = 88;
		showMapa();
		Sleep(100);
	}
}
