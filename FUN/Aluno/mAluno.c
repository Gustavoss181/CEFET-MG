#include <stdio.h>
#include <stdlib.h>
#include "aluno.h"
#define a 10

void main(){
	Aluno aluno[a];
	preencherAluno(aluno);
	mostrarNomes(aluno);
	acimaMedia(aluno);
	mediaIdade(aluno);
}
