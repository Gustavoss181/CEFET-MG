def custoConsumidor():
    custoFabrica = float(input("Custo de fabrica: "))
    distribuidor = custoFabrica*0.28
    impostos = custoFabrica*0.45
    print("Custo do consumidor: " + str(custoFabrica + distribuidor + impostos))

custoConsumidor()