def categoria(idade):
    if idade >= 18:
        return 'Senior'
    elif idade >= 14:
        return 'Juvenil B'
    elif idade >= 11:
        return 'Juvenil A'
    elif idade >= 8:
        return 'Infantil B'
    elif idade >= 5:
        return 'Infantil A'
    else:
        return 'Idade abaixo do permitido'

idade = int(input('Idade: '))

print('-------------------------------')

print('Categoria: ' + str(categoria(idade)))