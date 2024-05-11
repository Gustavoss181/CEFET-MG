numDias = int(input('Numero de diarias: '))

print('-------------------------------')

if numDias < 15:
    total = 95 + numDias*2.5
elif numDias == 15:
    total = 95 + numDias*1.5
else:
    total = 95 + numDias*0.5

print('Total: ' + str(total))