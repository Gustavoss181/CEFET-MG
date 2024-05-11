class Contato:
    def __init__(self, nome, tel, niverDia, niverMes):
        self.nome = nome
        self.tel = tel
        self.niverDia = niverDia
        self.niverMes = niverMes

contatos = []

def mostrarContato(iden, contato):
    print("Id:", iden)
    print("Nome:", contato.nome)
    print("Telefone:", contato.tel)
    print("Aniversario:", str(contato.niverDia) + "/" + str(contato.niverMes))
    print("----------------------------------------")

def inserirContato():
    contatos.append(Contato( input("Nome: "), input("Telefone: "), int(input("Dia do aniversário: ")), int(input("Mês do aniversário: "))))
    print("Contato adicionado")

def removerContato():
    iden = int(input("Digite o id do contato: "))
    try:
        del(contatos[iden])
        print("Contato removido")
    except:
        print("Id não encontrado")

def pesquisarContatoNome():
    nome = input("Nome a ser pesquisado: ")
    aux = True
    for i in range(0, len(contatos)):
       if nome == contatos[i].nome:
           aux = False
           mostrarContato(i, contatos[i])
    if aux:
        print("Nenhum contato encontrado")

def listarContatos():
    cont=0
    for contato in contatos:
        mostrarContato(cont, contato)
        cont+=1

def listarContatosLetra():
    letra = input("Primeira letra do nome: ")
    aux = True
    for i in range(0, len(contatos)):
       if letra == contatos[i].nome[0] or letra.upper() == contatos[i].nome[0]:
           aux = False
           mostrarContato(i, contatos[i])
    if aux:
        print("Nenhum contato encontrado")

def listarNiverMes():
    mes = int(input("Digite o mes: "))
    aux = True
    for i in range(0, len(contatos)):
       if mes == contatos[i].niverMes:
           aux = False
           mostrarContato(i, contatos[i])
    if aux:
        print("Nenhum contato encontrado")

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