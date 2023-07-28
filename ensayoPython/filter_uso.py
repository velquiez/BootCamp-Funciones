numeros = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

def numPares(x):
    if x % 2 == 0:  #Quitar == 0 para obtener impares
        return True
    
    return False

#respuesta = filter(numPares, numeros)
respuesta = filter(lambda x: x % 2 == 0, numeros)  #Lo mismo que el anterior reglon
print(list(respuesta))

print('-------------------------------------')

seudonimos = ['loco', 'loquito', 'locazo', 'lito']

def empiezanEnLo(x):
    if str(x).startswith('lo'):
        return True
    
    return False

#respuesta = filter(empiezanEnLo, seudonimos)
respuesta = filter(lambda x: str(x).startswith('lo'), seudonimos)  #Lo mismo que el anterior reglon
print(list(respuesta))