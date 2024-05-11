#include <stdio.h>
#include <stdlib.h>
#include "pessoa.h"
#define a 5

int main(void){
	Pessoa pessoa[a];
	Preencher(pessoa);
	MaisVelho(pessoa);
	MaisNovo(pessoa);
	Nomes(pessoa);
	Maiores(pessoa);
	CpfImpar(pessoa);
	OrdenarIdade(pessoa);
	return 0;
}
