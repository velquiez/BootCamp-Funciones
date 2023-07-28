from functools import reduce

def suma(a, b): #reduce necesita dos parametros
    print(f'a={a}, b={b}')
    return a + b

res = reduce(suma, [3,4,5]) 
print(res)