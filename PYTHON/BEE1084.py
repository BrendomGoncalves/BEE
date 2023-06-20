while True:
    qnt_digitos, apagar = map(int, input().split())
    if qnt_digitos == 0 and apagar == 0:
        break
    else:
        numeros = str(input())
        lista = []
        for i in numeros:
            while apagar > 0 and lista and lista[-1] < i:
                lista.pop()
                apagar -= 1
            lista.append(i)
        while apagar > 0:
            lista.pop()
            apagar -= 1
        print(''.join(lista))