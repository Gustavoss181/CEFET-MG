n1 = float(input("N1: "))
n2 = float(input("N2: "))
n = int(input("N: "))
print(n1)
print(n2)
soma = n1 + n2
for i in range(0, n-2):
    aux = n2
    n2 += n1
    n1 = aux
    soma += n2
    print(n2)

print("Soma:", soma)