def aumento(salAtual, porc):
    porc/= 100
    print("Novo salário: " + str(salAtual*(porc+1)))
    print("Aumento: " + str(salAtual*porc))

salAtual = float(input("Salario atual: "))
porc = float(input("Porcentagem do aumento: "))
print("------------------------")
aumento(salAtual, porc)