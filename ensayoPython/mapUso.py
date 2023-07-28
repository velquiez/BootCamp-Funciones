def cuadrado(x):
    return x * x

numN = [1, 2, 3, 4, 5]

resultado = map(cuadrado, numN)  #Aplica la funcion a todos elementos de la lista
#resultado = map(lambda x: x * x, [1,2,3,4,5])
print(list(resultado))