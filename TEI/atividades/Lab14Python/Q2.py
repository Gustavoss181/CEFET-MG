agenda = {}

while True:
    cpf = input("CPF: ")
    if agenda.get(cpf) != None:
        print("CPF já registrado")
    else:
        agenda[cpf] = {
            "nome": input("Nome: "),
            "idade": input("Idade: "),
            "tel": input("Telefone: ")
        }
    if input("Adicionar mais um contato?(S/N): ").upper() != "S":
        break

for contato in agenda:
    aux = agenda[contato]
    print(contato + ": " + aux["nome"], aux["idade"], aux["tel"], sep="-")