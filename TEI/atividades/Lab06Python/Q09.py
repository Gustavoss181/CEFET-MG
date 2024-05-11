n = int(input("Digite um numero inteiro positivo: "))
parte1 = 0
for i in range(1, n+1):
    parte1 += i**2

parte2 = (n*(n+1)*(2*n+1))/6
if parte1 == parte2:
    print("Igualdade verdadeira")
else:
    print("Igualdade falsa")