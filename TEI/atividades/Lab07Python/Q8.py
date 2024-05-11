n = int(input("Numero de linhas: "))
count = 1
for i in range(0, n):
    for j in range(0, i+1):
        print(count, end=" ")
        count += 1
    print()