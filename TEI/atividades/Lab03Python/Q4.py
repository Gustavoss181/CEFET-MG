num1 = float(input('Digite um numero: '))
num2 = float(input('Digite um numero: '))
num3 = float(input('Digite um numero: '))

print('-------------------------------')

maior = num1

if num2 > maior:
    maior = num2

if num3 > maior:
    maior = num3

print(maior)