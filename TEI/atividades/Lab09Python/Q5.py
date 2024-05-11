frase = input("Escreva uma frase: ")

for i in range(0, len(frase)):
    print(frase[len(frase)-i-1], end='')