def preco():
    numDias = int(input('Numero de diarias: '))
    if numDias < 15:
        return 95 + numDias*2.5
    elif numDias == 15:
        return 95 + numDias*1.5
    else:
        return 95 + numDias*0.5

print('-------------------------------')

print('Total: ' + str(preco()))