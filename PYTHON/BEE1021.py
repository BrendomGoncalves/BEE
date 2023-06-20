N = (float)(input("N: "))
n_100 = n_50 = n_20 = n_10 = n_5 = n_2 = 0
m_1 = m_50 = m_25 = m_10 = m_05 = m_01 = 0

while(N > 0):
    if(N >= 100.00):
        n_100 = N // 100.00
        N = N % 100.00;
    elif(N < 100 and N >= 50.00):
        n_50 = N // 50.00
        N = N % 50.00
    elif(N < 50.00 and N >= 20):
        n_20 = N // 20.00
        N = N % 20.00
    elif(N < 20 and N >= 10):
        n_10 = N // 10
        N = N % 10.00
    elif(N < 10 and N >= 5):
        n_5 = N // 5
        N = N % 5.00
    elif(N < 5 and N >= 2):
        n_2 = N // 2
        N = N % 2.00
    elif(N < 2 and N >= 1):
        m_1 = N // 1
        N = N % 1.00
    elif(N < 1 and N >= 0.50):
        m_50 = N // 0.50
        N = N % 0.50
    elif(N < 0.50 and N >= 0.25):
        m_25 = N // 0.25
        N = round(N % 0.25, 1)
    elif(N < 0.25 and N >= 0.10):
        m_10 = N // 0.10
        N = N % 0.10
    elif(N < 0.10 and N >= 0.05):
        m_05 = N // 0.05
        N = N % 0.05
    elif(N < 0.05 and N >= 0.01):
        m_01 = N // 0.01
        N = N % 0.01
    else:
        N = 0;

print("NOTAS:")
print((int)(n_100), "nota(s) de R$ 100.00")
print((int)(n_50), "nota(s) de R$ 50.00")
print((int)(n_20), "nota(s) de R$ 20.00")
print((int)(n_10), "nota(s) de R$ 10.00")
print((int)(n_5), "nota(s) de R$ 5.00")
print((int)(n_2), "nota(s) de R$ 2.00")
print("MOEDAS:")
print((int)(m_1), "moeda(s) de R$ 1.00")
print((int)(m_50), "moeda(s) de R$ 0.50")
print((int)(m_25), "moeda(s) de R$ 0.25")
print((int)(m_10), "moeda(s) de R$ 0.10")
print((int)(m_05), "moeda(s) de R$ 0.05")
print((int)(m_01), "moeda(s) de R$ 0.01")