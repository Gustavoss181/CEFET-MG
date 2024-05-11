import math
num1 = float(input('Digite um numero: '))
num2 = float(input('Digite um numero: '))
num3 = float(input('Digite um numero: '))

print('-------------------------------')

if num1 >= 0:
    print(math.sqrt(num1))
else:
    print(num1**2)

if num2 > 10 and num2 < 100:
    print('Número entre 10 e 100. Intervalo permitido')

if num3 < num2:
    print(num2-num3)
else:
    print(num2+num3)