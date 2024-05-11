#include <stdio.h>
#include <stdlib.h>
#include "pessoa.h"

int main(void){
	Pessoa pessoa[5];
	preencherPessoa(pessoa);
	pessoaMaisVelha(pessoa);
	pessoaMaisNova(pessoa);
	ordenaPessoas(pessoa);
	listaPessoas(pessoa);
	system("pause");
}
