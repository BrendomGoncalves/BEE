T = int(input())
for caso in range(1, T + 1):
    N = int(input())
    mapa = [list(input().strip()) for _ in range(N)]
    resultado = busca(mapa, N)
    print("Case " + str(caso) + ": " + str(resultado))