def divisivel(n1, n2, n3, n4):
    if n1%2 == 0 and n1%3 == 0:
        print(n1)
    if n2%2 == 0 and n2%3 == 0:
        print(n2)
    if n3%2 == 0 and n3%3 == 0:
        print(n3)
    if n4%2 == 0 and n4%3 == 0:
        print(n4)

n1 = float(input('Numero: '))
n2 = float(input('Numero: '))
n3 = float(input('Numero: '))
n4 = float(input('Numero: '))

print('-------------------------------')

divisivel(n1, n2, n3, n4)