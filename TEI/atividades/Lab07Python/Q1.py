maior = float(input("Numero: "))
while True:
    if input("Adicionar novo numero(s/n)? ") == 'n':
        break
    num = float(input("Numero: "))
    if num > maior:
        maior = num
print("Maior numero:", maior)