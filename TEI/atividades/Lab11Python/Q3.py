teste = open("teste.txt", "w")
teste.write("Esta é uma frase de teste.")
teste.close()

def a():
    arq = open("teste.txt", "a+")
    arq.write(" Esta frase foi adicionada depois!")    #Escreve no arquivo a partir do final
    arq.close()

def r():
    arq = open("teste.txt", "r+")
    arq.write("Isto")    #Altera apenas uma parte do arquivo a partir do início
    arq.close()

def w():
    arq = open("teste.txt", "w+")
    arq.write("Uma nova frase foi escrita")    #apagou o conteúdo que existia no arquivo
    arq.close()


modo = input("Escreva 'a+', 'r+' ou 'w+' para o modo de abertura de arquivo: ")

arq = open("teste.txt", "r+")
print("Antes:", arq.read())
arq.close()

if modo == "a+":
    a()
elif modo == "r+":
    r()
elif modo == "w+":
    w()
else:
    print("Comando inválido")

arq = open("teste.txt", "r+")
print("Depois:", arq.read())
arq.close()