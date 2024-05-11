def maior(n1, n2, n3):
    maior = n1
    if maior < n2:
        maior = n2
    if maior < n3:
        maior = n3
    return maior

num1 = float(input('Primeiro numero: '))
num2 = float(input('Segundo numero: '))
num3 = float(input('Terceiro numero: '))

print('-------------------------------')

print('Maior numero: ' + str(maior(num1, num2, num3)))