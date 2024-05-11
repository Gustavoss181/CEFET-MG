numI = int(input("Valor inicial: "))
numF = int(input("Valor final: "))
soma = 0
if numI >= numF:
    print("Intervalo de valores invalido")
else:
    for n in range(numI, numF+1):
        if n%2 != 0:
            soma += n
    print("Soma dos numeros impares:", soma)