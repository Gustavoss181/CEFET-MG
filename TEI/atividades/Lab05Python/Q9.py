def gotasDose(idade, peso):
    if idade >= 12:
        if peso >= 60:
            return "Gotas por dose: " + str(1000/500*20)
        else:
            return "Gotas por dose: " + str(875/500*20)
    else:
        if peso < 5:
            return "Peso abaixo do esperado"
        elif peso <= 9:
            return "Gotas por dose: " + str(125/500*20)
        elif peso <= 16:
            return "Gotas por dose: " + str(250/500*20)
        elif peso <= 24:
            return "Gotas por dose: " + str(375/500*20)
        elif peso <= 30:
            return "Gotas por dose: " + str(500/500*20)
        else:
            return "Gotas por dose: " + str(750/500*20)

idade = int(input("Idade: "))
peso = int(input("Peso: "))

print(gotasDose(idade, peso))