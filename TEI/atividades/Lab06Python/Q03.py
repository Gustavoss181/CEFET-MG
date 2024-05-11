nAlunos = int(input("Numero de alunos: "))
notas = 0
for n in range(0, nAlunos):
    aux = 'Nota do aluno ' + str(n+1) + ': '
    notas += float(input(aux))

print('Media: ', notas/nAlunos)