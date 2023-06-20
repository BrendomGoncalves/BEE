qnt, saldo = map(int, input().split())
menor = saldo
for i in range(0, qnt):
    saldo += int(input())
    if saldo <= menor:
        menor = saldo
print(menor)