import re

arq = open("arquivo.txt")

exR = re.compile(input("Digite uma expressão regular: "))
nomeArq = input("Digite o nome de um arquivo (coloque a extensão): ")

arq = open(nomeArq)

for linha in arq:
    m = re.search(exR, linha)
    if m != None:
        print(linha)