N1 = float(input("Nota 1: "))
N2 = float(input("Nota 2: "))
N3 = float(input("Nota 3: "))
N4 = float(input("Nota 4: "))

media = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / (2+3+4+1)

print(f"Media: {format(media, '.1f')}")

if(media >= 7.0):
    print("Aluno aprovado.")
elif(media > 5.0 and media <= 6.9):
    print("Aluno em exame")
    nota_exame = float(input("Nota do exame: "))
    media = (media + nota_exame) / 2
    if(media > 5.0):
        print("Aluno aprovado.")
    else:
        print("Aluno reprovado.")
    print("Media final:", format(media, '.1f'))
else:
    print("Aluno reprovado.")