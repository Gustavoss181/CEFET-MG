def novoArquivo():
    print("Editor de texto (Máx 50 linhas)\nEscreva 'FIM' para finalizar escrita")
    cont = 0

    nome = input("Dê um nome ao seu arquivo: ")
    arquivo = open(nome + ".txt", "w")

    while cont < 50:
        linha = input("Linha " + str(cont+1) + ": ")
        if linha == "FIM":
            break
        arquivo.write(linha + "\n")
        cont += 1
    arquivo.close()

def ler():
    nome = input("Escreva o nome do arquivo a ser aberto (não coloque '.txt'): ")
    arquivo = open(nome + ".txt")
    for linha in arquivo:
        print(linha, end="")
    arquivo.close()

controle = input("Digite LER para ler um arquivo ou NOVO para criar novo arquivo: ")
if controle == "LER":
    ler()
elif controle == "NOVO":
    novoArquivo()
else:
    print("Comando inválido")