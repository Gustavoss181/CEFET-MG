typedef struct{
	float saldo;
	int nconta;
}Contas;

int VerificarConta(cnt, cont);
void CriarNovasContas(cnt, cont);
void ImprimirContas(cnt, cont);
void ZerarConta(cnt, cont);
void Depositar(cnt, cont);
void Sacar(cnt, cont);
void ImprimirSaldo(cnt, cont);
