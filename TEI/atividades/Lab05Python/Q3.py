def cargo(cod):
    if cod == 101:
        print("Cargo: Vendedor")
    elif cod == 102:
        print("Cargo: Atendente")
    elif cod == 103:
        print("Cargo: Auxiliar Tecnico")
    elif cod == 104:
        print("Cargo: Assistente")
    elif cod == 105:
        print("Cargo: Coordenador de Grupo")
    elif cod == 106:
        print("Cargo: Gerente")
    else:
        print("Codigo invalido, digite o código novamente")
        pegarValor()

def pegarValor():
    cargo(int(input("Codigo: ")))

pegarValor()