from collections import deque

def busca(mapa, N):
    robos = []
    alvos = []
    for linha in range(N): # encontrando as posicoes de A, B, C e X
        for coluna in range(N):
            if mapa[linha][coluna] in ['A', 'B', 'C']:
                robos.append((linha, coluna))
            elif mapa[linha][coluna] == 'X':
                alvos.append((linha, coluna))

    def valida_posicao(x, y):
        return 0 <= x < N and 0 <= y < N and mapa[x][y] != '#'

    def eh_alvo(pos_atual):
        for i in pos_atual:
            if i not in alvos:
                return False
        return True

    movimentos = [(-1, 0), (1, 0), (0, -1), (0, 1)] # cima, baixo, esquerda, direita)

    lista = deque([(robos, 0)])
    visitados = []
    
    while lista:
        posicao_atual, passos = lista.popleft()
        if eh_alvo(posicao_atual):
            return passos
        visitados.append(posicao_atual)
        for m in movimentos:
            nova_posicao = []
            for x, y in posicao_atual:
                novo_x, novo_y = x + m[0], y + m[1]
                if valida_posicao(novo_x, novo_y):
                    nova_posicao.append((novo_x, novo_y))
                else:
                    nova_posicao.append((x, y))
            nova_posicao = tuple(sorted(nova_posicao))
            if nova_posicao not in visitados:
                lista.append((nova_posicao, passos + 1))
    return "trapped"


T = int(input())
for caso in range(1, T + 1):
    N = int(input())
    mapa = [list(input().strip()) for _ in range(N)]
    resultado = busca(mapa, N)
    print("Case " + str(caso) + ": " + str(resultado))