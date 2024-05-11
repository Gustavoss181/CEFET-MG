s = input("Escreva uma frase (sem acentos): ")
s = s.lower()
vogais = ['a', 'e', 'i', 'o', 'u']
count = 0
for i in s:
    for j in vogais:
        if i == j:
            count = count+1
print("Numero de vogais:", count)