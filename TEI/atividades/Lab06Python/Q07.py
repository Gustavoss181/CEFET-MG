n = int(input("Informe o valor N: "))
soma = 0

def fatorial(n):
    if n <= 1:
        return 1
    else:
        fatorial = 1
        for i in range(2, n+1):
            fatorial *= i
        return fatorial

for i in range(0, n):
    soma += (100-i)/fatorial(i)

print("Soma:", soma)