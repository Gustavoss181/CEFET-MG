grupo = []
indices = ["nome", "sexo", "idade"]

while True:
    grupo.append({
        indices[0]: input("Nome: "),
        indices[1]: input("Sexo(M/F): "),
        indices[2]: int(input("Idade: "))
    })
    if input("Adicionar mais um contato?(S/N): ").upper() != "S":
        break

def opcaoA():
    return len(grupo)

def opcaoB():
    media = 0
    for pessoa in grupo:
        media += pessoa[indices[2]]
    return media/opcaoA()

def opcaoC():
    mulheres = []
    for pessoa in grupo:
        if pessoa[indices[1]].upper() == "F":
            mulheres.append(pessoa)
    return mulheres

def opcaoD():
    velhos = []
    for pessoa in grupo:
        if pessoa[indices[2]] > opcaoB():
            velhos.append(pessoa)
    return velhos

print(opcaoA())
print(opcaoB())
print(opcaoC())
print(opcaoD())