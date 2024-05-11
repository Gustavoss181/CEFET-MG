class Atleta:
    def __init__(self, nome, sexo, idade, peso, altura):
        self.nome = nome
        self.sexo = sexo
        self.idade = idade
        self.peso = peso
        self.altura = altura

atletas = []
while True:
    nome = input("Nome: ")
    if nome == '@':
        break
    atletas.append(Atleta(nome, input("Sexo(m/f): "), int(input("Idade: ")), float(input("Peso: ")), float(input("Altura: "))))

pesoM = 0
alturaF = 0 
media = 0
for atleta in atletas:
    if atleta.sexo == 'm':
        if atleta.peso > pesoM:
            nomeM = atleta.nome
            pesoM = atleta.peso
    if atleta.sexo == 'f':
        if atleta.altura > alturaF:
            nomeF = atleta.nome
            alturaF = atleta.altura
    media += atleta.idade

print("Atleta masculino mais pesado:", nomeM)
print("Atleta feminina mais alta:", nomeF)
print("Media de idades:", media/len(atletas))