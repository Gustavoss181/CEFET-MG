from unicodedata import normalize

frase = input("Escreva uma frase: ")
frase = frase.lower()
frase = normalize('NFKD', frase).encode('ASCII','ignore').decode('ASCII')
novaFrase = ''
for i in range(0, len(frase)):
    for j in range(97, 123):
        if frase[i] == chr(j):
            novaFrase += frase[i]

if novaFrase == novaFrase[::-1]:
    print("É Palíndromo")
else:
    print("Não é Palíndromo")