n1 = float(input("N1: "))
n2 = float(input("N2: "))
n = int(input("N: "))
print(n1)
print(n2)
for i in range(3, n+1):
    if i%2 == 0:
        aux = n2 - n1
    else:
        aux = n2 + n1
    n1 = n2
    n2 = aux
    print(n2)