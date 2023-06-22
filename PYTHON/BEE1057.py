T = 1
for _ in range(0, T):
    N, A, B, C, Sala = 3, [], [], [], []
    for i in range(0, N):
        linha = input()
        list_linha = []
        for j, carac in enumerate(linha):
            list_linha.append(carac)
            if carac == 'A':
                A.append(i)
                A.append(j)
            elif carac == 'B':
                B.append(i)
                B.append(j)
            elif carac == 'C':
                C.append(i)
                C.append(j)
        Sala.append(list_linha)    