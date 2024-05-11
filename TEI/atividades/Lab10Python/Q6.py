dna = input("Escreva uma cadeia de DNA: \n")
novoDna = ''
aux = True

dna = dna.upper()
for c in dna:
    if c == 'A':
        novoDna += 'T'
    elif c == 'T':
        novoDna += 'A'
    elif c == 'C':
        novoDna += 'G'
    elif c == 'G':
        novoDna += 'C'
    else:
        print("Valor inválido")
        aux = False

if aux:
    print(novoDna)