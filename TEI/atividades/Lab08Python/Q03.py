a = int(input("Valor de A: "))
b = int(input("Valor de B: "))
quo = 0
while a >= b:
    resto = a - b
    a -= b
    quo += 1

print("Quociente:", quo)
print("Resto:", resto)