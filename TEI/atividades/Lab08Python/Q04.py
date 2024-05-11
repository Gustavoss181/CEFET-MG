alcool = 0
gas = 0
vin = 0

while True:
    tipo = int(input("Informe o tipo de combustível(1.Álcool/2.Gasolina/3.Diesel/4.Fim): "))
    if tipo == 1:
        alcool += 1
        print("Alcool")
    elif tipo == 2:
        gas += 1
        print("Gasolina")
    elif tipo == 3:
        vin += 1
        print("Diesel")
    elif tipo == 4:
        print("MUITO OBRIGADO")
        break
    else:
        print("Código invalido")

print("Clientes que escolheram Alcool:", alcool)
print("Clientes que escolheram Gasolina:", gas)
print("Clientes que escolheram Diesel:", vin)