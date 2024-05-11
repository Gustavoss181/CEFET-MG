def funcao(x):
    if x <= 1:
        print("1")
    elif x <= 2:
        print("2")
    elif x <= 3:
        print(x*x)
    else:
        print(x*x*x)

x = float(input("Digite o valor de x: "))
print("------------------------")
funcao(x)