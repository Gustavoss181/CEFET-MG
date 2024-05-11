frase = input("Escreva uma frase: ")
pAntiga = input("Palavra antiga: ")
pNova = input("Palavra nova: ")

frase = frase[::-1]
pAntiga = pAntiga[::-1]
pNova = pNova[::-1]

frase = frase.replace(pAntiga, pNova, 1)
print(frase[::-1])