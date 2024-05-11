grupo = {}

while True:
    cpf = input("CPF: ")
    if grupo.get(cpf) != None:
        print("CPF já registrado")
    else:
        grupo[cpf] = {
            "nome": input("Nome: "),
            "idade": int(input("Idade: ")),
            "cpf": cpf
        }
    if input("Adicionar mais um contato?(S/N): ").upper() != "S":
        break

menores18 = {}
for pessoa in list(grupo):
    if grupo[pessoa]["idade"] < 18:
        menores18[pessoa] = grupo.pop(pessoa)

print(grupo)
print(menores18)