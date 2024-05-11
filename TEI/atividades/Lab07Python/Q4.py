n = int(input("N: "))
h = 1
for i in range(2, n+1):
    h += 1/i

print("H:", h)