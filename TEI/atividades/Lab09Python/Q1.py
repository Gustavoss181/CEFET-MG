s = input("Digite um texto e um número separados apenas por ':' : ")

print(float(s[s.rfind(':')+1:]))