def salario():
    num = int(input("Numero do vendedor: "))
    numCarros = int(input("Numero de carros vendidos: "))
    valorVendas = float(input("Valor total de vendas: ")) #???????????
    salarioFixo = float(input("Salario fixo: "))
    valorCarroVendido = float(input("Valor recebido por carro vendido: "))
    print("Vendedor " + str(num) + ": " + str(salarioFixo + (numCarros*valorCarroVendido)))

salario()