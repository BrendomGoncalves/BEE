def collatz(n, teto, inicio, fim):
    if inicio == fim:
        if n <= teto:
            return True
        else:
            return False
    meio = (inicio + fim) // 2
    if n % 2 == 0:
        n = int(n / 2)
    else:
        n = 3 * n + 1
        if n > teto:
            return False
    return collatz(n, teto, inicio, meio) and collatz(n, teto, meio+1, fim)

def n_senhas(inicio, fim, poss):
    global teto, digitos
    if inicio == fim:
        if collatz(inicio, teto, 1, digitos):
            poss += 1
        return poss
    else:
        meio = (inicio + fim) // 2
        poss = n_senhas(inicio, meio, poss)
        poss = n_senhas(meio + 1, fim, poss)
        return poss

teto, digitos = map(int, input().split())
possibilidades = 0
print(n_senhas(1, teto, possibilidades))
