# Faça uma função que leia o número da conta bancária e o saldo de um
# cliente. Caso a conta tenha saldo negativo, o algoritmo deve enviar a
# seguinte mensagem: CONTA ESTOURADA, caso contrário CONTA
# NORMAL.

def conta():
    num = float(input('Numero da conta: '))
    saldo = float(input('Saldo da conta: '))

    if saldo < 0:
        return 'CONTA ESTOURADA'
    else:
        return 'CONTA NORMAL'

print('-------------------------------')

print(conta())