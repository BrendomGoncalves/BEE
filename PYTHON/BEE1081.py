def dfs(v, qnt_espacos=0):
    global V, adj, lbl
    lbl[v] = 1
    espacos = "  " * qnt_espacos

    for w in range(0, V + 1):
        if adj[v][w] == 1:
            if lbl[w] == -1:
                #print(f"{espacos}{v}-{w} pathR(G,{w})")
                print(espacos + '' + str(v) + "-" + str(w) + " pathR(G," + str(w) + ")")
                dfs(w, qnt_espacos + 1)
                if adj[w][v] == 1:
                    print(f"    {w}-{v}")

N = int(input())

for k in range(0, N):
    lbl = []  # vertices visitados
    adj = []  # matriz do grafo
    V, E = map(int, input().split())
    vertices = []

    for i in range(0, E): # entrada das arestas
        x, y = map(int, input().split())
        vertices.append([x, y])

    for i in range(0, V + 1):  # preenchimento da matriz "adj"
        linha = []
        for j in range(0, V + 1):
            linha.append(-1)
        adj.append(linha)

    for i, j in vertices:  # preenchimento das arestas na matriz
        adj[i][j] = 1

    for i in range(0, V + 1):  # preenchimento dos vertices visitados
        lbl.append(-1)

    print(f"Caso {k+1}:")

    for i in range(0, V + 1):  # chamando função "dfs" de 0 a V
        if any(i in edge for edge in vertices) and lbl[i] == -1 and i > 0:
            print("\n", end='')
        dfs(i, qnt_espacos=1)
    del lbl, adj, vertices
