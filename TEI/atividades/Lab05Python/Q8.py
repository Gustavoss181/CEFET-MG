def peso():
    pesoTerra = float(input("Peso do objeto na Terra: "))
    numPlaneta = int(input("Numero do planeta: "))
    if numPlaneta == 1:
        print("Peso do objeto em Mercurio: " + str(pesoTerra*0.37))
    elif numPlaneta == 2:
        print("Peso do objeto em Venus: " + str(pesoTerra*0.88))
    elif numPlaneta == 3:
        print("Peso do objeto em Marte: " + str(pesoTerra*0.38))
    elif numPlaneta == 4:
        print("Peso do objeto em Jupiter: " + str(pesoTerra*2.64))
    elif numPlaneta == 5:
        print("Peso do objeto em Saturno: " + str(pesoTerra*1.15))
    elif numPlaneta == 6:
        print("Peso do objeto em Urano: " + str(pesoTerra*1.17))
    else:
        print("Digite um numero valido")
        peso()

peso()