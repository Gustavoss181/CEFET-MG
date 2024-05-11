import math

def velocidade(massa, andar):
    h = andar*3
    return math.sqrt(2 * 9.8 * h)

massa = float(input("Massa: "))
andar = int(input("Andar: "))
print("------------------------")
print("Velocidade ao atingir o solo: " + str(velocidade(massa, andar)) + " m/s")