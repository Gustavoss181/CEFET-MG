saldo = float(input('Saldo medio: '))

print('-------------------------------')

if saldo > 600:
    credito = saldo*0.4
elif saldo > 400:
    credito = saldo*0.3
elif saldo > 200:
    credito = saldo*0.2
else:
    credito = 'nenhum credito'

print('Saldo medio: ' + str(saldo))
print('Credito: ' + str(credito))