import math
num = []
media = 0
while True:
    n = float(input("Numero: "))
    if n == 0:
        break
    num.append(n)
    media += n

d = 0
media /= len(num)
for n in num:
    d += math.pow(n - media, 2)

d /= len(num)
d = math.sqrt(d)

print("Media:", media)
print("Desvio padrao:", d)