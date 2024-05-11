vitC = 0
vitA = 0
empates = 0

while True:
    golsC = int(input("Gols do Cruzeiro: "))
    golsA = int(input("Gols do Atletico: "))
    if golsC > golsA:
        vitC += 1
    elif golsA > golsC:
        vitA += 1
    else:
        empates += 1
    if int(input("Novo DUELO 1.Sim 2.Não? ")) != 1:
        break

print("Numero de partidas:", vitA+vitC+empates)
print("Numero de vitórias do Atletico:", vitA)
print("Numero de vitórias do Cruzeiro:", vitC)
print("Numero de empates:", empates)
if vitA > vitC:
    print("Atletico teve o maior numero de vitorias")
elif vitC > vitA:
    print("Cruzeiro teve o maior numero de vitorias")
else:
    print("Nao houve vencedor")