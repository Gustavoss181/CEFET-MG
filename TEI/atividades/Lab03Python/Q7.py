cod = float(input('Codigo: '))
sexo = input('Sexo (M) ou (F): ')
tempo = float(input('Tempo de trabalho (em anos): '))
salario = float(input('Salario: '))

print('-------------------------------')

if sexo == 'M' and tempo > 15:
    bonus = salario*0.2
elif sexo == 'F' and tempo > 10:
    bonus = salario*0.25
else:
    bonus = 100

print('Bonus: ' + str(bonus))