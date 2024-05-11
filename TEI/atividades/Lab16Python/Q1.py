def ordenar(agenda, decrescente):
    for i in range(0, len(agenda)-1):
        for j in range(1,len(agenda)-i):
            if decrescente:
                if agenda[j][0] < agenda[j-1][0]:
                    aux = agenda[j]
                    agenda[j] = agenda[j-1]
                    agenda[j-1] = aux
            else:
                if agenda[j][0] > agenda[j-1][0]:
                    aux = agenda[j]
                    agenda[j] = agenda[j-1]
                    agenda[j-1] = aux
    for contato in agenda:
        print(contato)
    
agenda = []

while True:
    agenda.append((
        int(input("CPF(apenas numeros): ")),
        input("Nome: "),
        input("Telefone: ")
    ))
    if input("Novo contato?(S/N): ").upper() != "S":
        break

if input("Ordenar pela chave?(S/N): ").upper() != "S":
    ordenar(agenda, False)
else:
    ordenar(agenda, True)