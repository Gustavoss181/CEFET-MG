numV = int(input('Numero do vendedor: '))
salaFixo = float(input('Salario fixo: '))
totalVendas = float(input('Total de vendas: '))

print('-------------------------------')

print('Numero do vendedor: ' + str(numV))
print('Total de vendas: ' + str(totalVendas))
print('Salario fixo: ' + str(salaFixo))

if totalVendas < 10000:
    print('Salario total: ' + str(salaFixo*1.03))
else:
    print('Salario total: ' + str(salaFixo*1.05))