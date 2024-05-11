import math
soma = 0
for i in range (0, 15):
    soma += math.pow(2, i)/math.pow(15-i, 2)

print("Soma:", soma)