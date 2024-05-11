# def funcao(s1, s2, arq1, arq2):
#     try:
#         arquivo1 = open(arq1)
#         arquivo2 = open(arq2, "w")
#         for line in arquivo1:
#             print("teste")
#             if s1 in line:
#                 print("Achei")
#                 line = line.replace(s1, s2)
#             arquivo2.write(line)
#         arquivo1.close()
#         arquivo2.close()
#     except ValueError:
#         print("Ocorreu um erro na execução do programa")
#         exit()
    

# s1 = input("Palavra que será substituida: ")
# s2 = input("Nova palavra: ")
# arq1 = input("Arquivo a ser lido (coloque a extensão): ")
# arq2 = input("Novo arquivo (coloque a extensão): ")
# funcao(s1, s2, arq1, arq2)

def preencherVetor(valores, tipo):
    vetor = []
    valores = valores.split(',')
    for i in range(len(valores)):
        if tipo == 'int':
            valor = int(valores[i].strip())
        elif tipo == 'float':
            valor = float(valores[i].strip())
        else:
            valor = valores[i].strip()
        vetor.append(valor)
    return vetor

def imprimeVetor(notasV, nomesV):
    print('[', end='')
    if nomesV == []:
        if len(notasV) > 0:
            print(f' {notasV[0]}', end='')
            for i in range(1, len(notasV)):
                print(f', {notasV[i]}', end='')
    else:
        if len(notasV) > 0:
            print(f' {notasV[0]}', end='')
            if nomesV != []:
                print(f' ({nomesV[0]})', end='')
            for i in range(1, len(notasV)):
                print(f', {notasV[i]}', end='')
                if nomesV != []:
                    print(f' ({nomesV[i]})', end='')
    print(' ]')

def estatNotas(vetor):
    maior = vetor[0]
    menor = vetor[0]
    media = 0
    for item in vetor:
        if maior < item:
            maior = item
        if menor > item:
            menor = item
        media += item
    # arrumar
    print(f'{maior:.1f}')
    print(f'{menor:.1f}')
    media /= len(vetor)
    print(f'{media:.1f}')
    return media

def acimaMedia(notas, corte):
    indices = []
    for i in range(len(notas)):
        if notas[i] > corte:
            indices.append(i)
    return indices

def exameEspecial(notasV):
    indicesV = []
    for i in range(len(notasV)):
        if notasV[i] >= 3 and notasV[i] < 6:
            indicesV.append(i)
    return indicesV

# inputs
notasStr = input('Notas: ')
nomesStr = input('Nomes: ')
# retorna os vetores dos inputs
notasV = preencherVetor(notasStr, 'float')
nomesV = preencherVetor(nomesStr, 'string')
# printa maior, menor e media das notas e retorna a media
corte = estatNotas(notasV)
# retorna um vetor com os indices do vetor de notas (que estão acima da media)
indicesVetor = acimaMedia(notasV, corte)
# imprime vetor de indices
print('')
imprimeVetor(indicesVetor, [])
# cria vetores das notas e nomes que estão acima da media a partir do vetor de indices acima
notasAcMed = []
nomesAcMed = []
for ind in indicesVetor:
    notasAcMed.append(notasV[ind])
    nomesAcMed.append(nomesV[ind])
# imprime os vetores de notas acima da media e nomes respectivos
print('')
imprimeVetor(notasAcMed, nomesAcMed)
# retorna um vetor com os indices do vetor de notas (que precisam do exame especial)
indicesVetor = exameEspecial(notasV)
# imprime vetor de indices
print('')
imprimeVetor(indicesVetor, [])
# cria vetores das notas e nomes que precisam do exame especial a partir do vetor de indices acima
notasExEsp = []
nomesExEsp = []
for ind in indicesVetor:
    notasExEsp.append(notasV[ind])
    nomesExEsp.append(nomesV[ind])
# imprime os vetores de notas para o exame especial e nomes respectivos
print('')
imprimeVetor(notasExEsp, nomesExEsp)