n = int(input("Digite o valor de N: ")) + 1
s = 0
for i in range(1, n):
    s += i/(n-i)
print("\nSoma final:", s)