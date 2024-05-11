frase = input("Escreva uma frase: ")
palavra = input("Escreva uma palavra: ")

frase = frase.lower()
palavra = palavra.lower()

count = 0
for i in range(0, len(frase)-len(palavra)+1):
    aux = False
    if frase[i:i+len(palavra)] == palavra:
        aux = True
    if aux:
        count = count+1

print("A palavra '" + palavra + "' apareceu", count,"vezes na frase")