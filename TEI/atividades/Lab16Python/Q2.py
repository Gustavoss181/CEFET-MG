texto = (input("Escreva um texto(sem acentos): ").lower())

vogais = ("a", "e", "i", "o", "u")

d = {}
for v in vogais:
    d[v] = texto.count(v)

print(d)