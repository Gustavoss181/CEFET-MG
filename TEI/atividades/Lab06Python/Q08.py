n1 = 1
n0 = 0
print(n0)
print(n1)
for n in range(3, 16):
    print(n0+n1)
    aux = n1
    n1 += n0
    n0 = aux