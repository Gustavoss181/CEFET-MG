x = float(input("Digite um valor real: "))
n = int(input("Digite o tamanho da serie: "))
s = x

def fatorial(aux):
    if aux <= 1:
        return 1
    else:
        fatorial = 1
        for i in range(2, aux+1):
            fatorial *= i
        return fatorial

for i in range(1, n):
    if i%2 == 0:
        s += x/fatorial(i)    
    else:
        s -= x/fatorial(i)

print("Resultado final:", s)