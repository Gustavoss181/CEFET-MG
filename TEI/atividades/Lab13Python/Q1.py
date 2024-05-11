org = ["Id:","Nome:","Telefone:","Dia do Aniversario:","Mes do Aniversario:"]

def mostrarContato(contato):
    for i in range(0,3):
        print(org[i], contato[i])
    print("Aniversario:", contato[3] + "/" + contato[4])
    print("----------------------------------------")

def inserirContato():
    try:
        agenda = open("agenda.txt")
        for linha in agenda:
            ultimaL = linha
        iden = int(ultimaL[:(ultimaL.find("#"))])+1
        agenda.close()
    except:
        iden = 0
    agenda = open("agenda.txt", "a+")
    agenda.write(str(iden)+"#")
    for i in range(1,5):
        agenda.write(str(input(org[i]))+"#")
    agenda.write("\n")
    print("Contato adicionado")
    agenda.close()

def removerContato():
    contatos = []
    agenda = open("agenda.txt")
    iden = input("Digite o id do contato: ")
    aux = True
    for contato in agenda:
        split = contato.split("#")
        if iden == split[0]:
           aux = False
           print("Contato apagado")
        else:
            contatos.append(contato)
    agenda.close()
    if aux:
        print("Id nao encontrado")
    else:
        agenda = open("agenda.txt", "w+")
        for contato in contatos:
            agenda.write(contato)
        agenda.close()

def pesquisarContatoNome():
    agenda = open("agenda.txt")
    nome = input("Nome a ser pesquisado: ")
    aux = True
    for contato in agenda:
        split = contato.split("#")
        if nome == split[1]:
           aux = False
           mostrarContato(split)
    if aux:
        print("Nenhum contato encontrado")
    agenda.close()

def listarContatos():
    agenda = open("agenda.txt")
    for contato in agenda:
        mostrarContato(contato.split("#"))
    agenda.close()

def listarContatosLetra():
    agenda = open("agenda.txt")
    letra = input("Primeira letra do nome: ")
    aux = True
    for contato in agenda:
        split = contato.split("#")
        if letra == split[1][0] or letra.upper() == split[1][0]:
           aux = False
           mostrarContato(split)
    if aux:
        print("Nenhum contato encontrado")
    agenda.close()

def listarNiverMes():
    agenda = open("agenda.txt")
    mes = input("Digite o mes: ")
    aux = True
    for contato in agenda:
        split = contato.split("#")
        if mes == split[4]:
           aux = False
           mostrarContato(split)
    if aux:
        print("Nenhum contato encontrado")
    agenda.close()

while True:
    print("1. Adicionar contato")
    print("2. Remover contato (por id)")
    print("3. Pesquisar contato por nome")
    print("4. Listar contatos")
    print("5. Listar contatos por letra")
    print("6. Listar aniversariantes do mês")
    print("0. Sair")
    print("")
    opcao = int(input("Escolha uma opção (por número): "))

    if opcao == 1:
        inserirContato()
    elif opcao == 2:
        removerContato()
    elif opcao == 3:
       pesquisarContatoNome()
    elif opcao == 4:
        listarContatos()
    elif opcao == 5:
       listarContatosLetra()
    elif opcao == 6:
       listarNiverMes()
    elif opcao == 0:
        break
    else:
        print("Opção inválida")
    input("Pressione ENTER para continuar")