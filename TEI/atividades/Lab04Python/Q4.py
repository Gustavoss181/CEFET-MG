def media(tipo, n1, n2, n3):
    if tipo == 'A':
        return (n1+n2+n3)/3
    elif tipo == 'P':
        return (3*n1 + 3*n2 + 4*n3)/(3+3+4)
    elif tipo == 'H':
        return 3/(1/n1 + 1/n2 + 1/n3)
    else:
        return 'Tipo invalido'

tipo = input('Escolha a media(A, P ou H): ')
n1 = float(input('Numero: '))
n2 = float(input('Numero: '))
n3 = float(input('Numero: '))

print('-------------------------------')

print('Media: ' + str(media(tipo, n1, n2, n3)))