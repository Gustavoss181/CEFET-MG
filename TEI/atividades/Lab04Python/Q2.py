def pesoIdeal(altura, sexo):
    if sexo == 'M':
        return (72.7 * altura - 58)
    elif sexo == 'F':
        return (62.1 * altura - 44.7)
    else:
        return '*Sexo nao definido*'

altura = float(input('Altura (metros): '))
sexo = input('Sexo (M ou F): ')

print('-------------------------------')

print('Peso ideal: ' + str(pesoIdeal(altura, sexo)))