alunos = {}

while True:
    nome = input("Digite o nome do aluno: ")
    if nome == "":
        break
    n1 = int(input("Nota 1: "))
    n2 = int(input("Nota 2: "))
    n3 = int(input("Nota 3: "))
    n4 = int(input("Nota 4: "))
    alunos[nome] = (n1, n2, n3, n4)

for aluno in alunos:
    media = 0
    for nota in alunos[aluno]:
        media += nota
    print("O aluno", aluno,"teve media", media/4)