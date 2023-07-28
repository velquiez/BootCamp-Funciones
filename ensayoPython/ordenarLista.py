lista = ['k', 'j', 'a', 'f', 'm']

ordenada = sorted(lista)
print(ordenada)

ordenada = sorted(lista, reverse=True)
print(ordenada)

ordenada = sorted(lista, reverse=True, key= lambda x: str(x).startswith('a'))
print(ordenada)