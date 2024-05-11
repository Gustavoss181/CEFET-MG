salario = float(input('Salario: '))

print('-------------------------------')

if salario >= 4500:
    salario*=1.5
elif salario >= 3500:
    salario*=1.6
elif salario >= 3000:
    salario*=1.7
elif salario >= 2500:
    salario*=1.8
elif salario >= 1500:
    salario*=1.9
elif salario >= 1000:
    salario*=2.0

print('Novo salario: ' + str(salario))