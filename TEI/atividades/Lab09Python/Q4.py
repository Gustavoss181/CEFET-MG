frase = input("Escreva uma frase: ")
frase = frase.lower()

palavra = "teclado"

i = 0
while i < (len(frase)):
    aux = False
    if frase[i:i+len(palavra)] == palavra:
        aux = True
    if aux:
        print(palavra + " ou mouse ", end='')
        i += len(palavra)
    else:
        print(frase[i], end='')
    i+=1