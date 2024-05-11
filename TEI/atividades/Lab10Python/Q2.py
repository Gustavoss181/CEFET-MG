frase = input("Escreva uma frase: ")
consoante = "bcdfghjklmnpqrstvwxyz"
consoante += consoante.upper()

for c in consoante:
    frase = frase.replace(c, '#')
frase = frase[::-1]

print(frase)