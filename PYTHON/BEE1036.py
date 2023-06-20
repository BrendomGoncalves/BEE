import math

A = input()
B = input()
C = input()

A = float(A)
B = float(B)
C = float(C)

det = (B**2) - (4 * A * C)

if(det <= 0):
    print("Impossível calcular")
else:
    R1 = ((-B) + math.sqrt(det)) / (2 * A)
    R2 = ((-B) - math.sqrt(det)) / (2 * A)
    print("R1 =", format(R1, '.5f'))
    print("R2 =", format(R2, '.5f'))