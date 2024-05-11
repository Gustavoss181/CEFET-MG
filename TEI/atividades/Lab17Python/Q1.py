import re

arq = open("arquivo.txt")

for linha in arq:
    result = re.search("Nova Revisao:", linha) #Não funcionou com acento "Nova Revisão"
    if result != None:
        aux = result.end()
        media = 0
        qtd = 0
        for i in range(aux+1, len(linha)):
            try:
                aux = int(linha[i])
                qtd += 1
            except:
                aux = 0
            media += aux
        if qtd != 0:
            print(media/qtd)

arq.close()