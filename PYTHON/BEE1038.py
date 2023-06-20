cod = input()
qnt = input()

cod = int(cod)
qnt = int(qnt)
total = 0.00

if(cod == 1):
    total = qnt * 4.00
elif(cod == 2):
    total = qnt * 4.50
elif(cod == 3):
    total = qnt * 5.00
elif(cod == 4):
    total = qnt * 2.00
else:
    total = qnt * 1.50 

print("Total: R$", format(total, '.2f'))