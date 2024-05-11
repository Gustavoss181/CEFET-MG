mFinal = mInicial = float(input("Massa inicial (em gramas): "))
seg = 0

while mFinal > 0.5:
    mFinal /= 2
    seg += 50

minu = int(seg/60)
seg -= minu*60
hora = int(minu/60)
minu -= hora*60
print("Massa inicial: ", mInicial)
print("Tempo calculado:", str(hora)+'h:'+str(minu)+'min:'+str(seg)+'seg')