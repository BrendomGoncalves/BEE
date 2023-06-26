def buscaP(vertice, espaco):
    """
    Realiza uma busca em profundidade dos vizinhos dos vertices.
    
    Args:
        vertice (int): vertice atual.
        espaco (str): espacos para o vertice atual.
    """
    global eh_grafo
    visitados[vertice] = True # Marcando o vertice atual como visitado
    espaco = espaco.join("  ") # Concatenando espacos

    for i in range(0, q_Vertices):
        if matriz_Grafo[vertice][i]: # Verificando se a coordenada eh uma aresta
            eh_grafo = True # Sinalizando que iniciou um grafo
            if not visitados[i]: # Verificando se jah visitou o vertice atual
                print(espaco + str(vertice) + '-' + str(i) + ' pathR(G,' + str(i) + ')')
                buscaP(i, espaco) # Fazendo a busca dos vizinhos do vertice "i"
            else: # Se jah foi visitado, printando somente a aresta
                print(espaco + str(vertice) + '-' + str(i))

# INICIO DO CODIGO
caso_Atual = 0
num_Casos = int(input())

while(caso_Atual < num_Casos):
    caso_Atual += 1

    q_Vertices, q_Arestas = map(int, input().split())

    visitados = [False for _ in range(q_Vertices)]
    matriz_Grafo = [[False] * q_Vertices for _ in range(q_Vertices)]

    for i in range(0, q_Arestas): # Inicializando os vertices na matriz do grafo
        u, v = map(int, input().split()) # Entrada da coordenada
        matriz_Grafo[u][v] = True

    print('Caso ' + str(caso_Atual) + ':')

    for i in range(0, q_Vertices):
        espaco = "" # Inicializando os espaços
        eh_grafo = False # Controle de grafo separado
        if not visitados[i]:
            buscaP(i, espaco)

        if eh_grafo: # Verificando se iniciou e finalizou um grafo
            print("\n", end='') # Criando espacos entre linhas para separar os grafos