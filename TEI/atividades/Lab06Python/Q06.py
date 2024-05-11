bru = 90000000
mila = 200000000
anos = 0
while bru < mila:
    bru *= 1.03
    mila *= 1.015
    anos += 1

print("Anos:", anos)