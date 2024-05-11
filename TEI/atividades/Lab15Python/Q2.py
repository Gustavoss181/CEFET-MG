principal = {}
backup = {}

for i in range(0, 200):
    backup[i] = principal[i] = i
    if (i+1)%5 == 0:
        print(principal)
        principal.clear()

print(backup)