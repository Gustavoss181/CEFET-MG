def diaSemana(dia, mes, ano):
    if mes < 3:
        ano -= 1
        mes += 12

    if (ano > 1582) or (mes > 10 and ano == 1582) or (dia >= 15 and mes == 10 and ano == 1582):
        a = int(ano/100)
        b = int(a/4)
        c = 2-a+b
    else:
        c=0

    d = int(365.25*(ano+4716))
    e = int(30.6001*(mes+1))

    diaSemana =  d+e+dia+c-1524
    if diaSemana%7 == 0: return "Segunda-feira"
    elif diaSemana%7 == 1: return "Terca-feira"
    elif diaSemana%7 == 2: return "Quarta-feira"
    elif diaSemana%7 == 3: return "Quinta-feira"
    elif diaSemana%7 == 4: return "Sexta-feira"
    elif diaSemana%7 == 5: return "Sabado"
    elif diaSemana%7 == 6: return "Domingo"

while True:
    dia = int(input("Dia: "))
    mes = int(input("Mes: "))
    ano = int(input("Ano: "))
    print("{0}/{1}/{2}: {3}".format(dia, mes, ano, diaSemana(dia, mes, ano)))
    for i in range(2021, 2031):
        print("{0}/{1}/{2}: {3}".format(dia, mes, i, diaSemana(dia, mes, i)))
    if input("NOVA DATA (`S' - Sim; `N' - Não)? ") == 'N':
        break