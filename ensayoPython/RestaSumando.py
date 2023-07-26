#Algoritmo para restar realizando suma

#def pedirDatos():

 # return n1, n2

def obtenerResta(n1, n2):
    rango = 0
    n = 0

    if (n1 < n2):
       rango = n2
       n = n1
    else:
       rango = n1
       n = n2
    
    respuesta = 0

    while n < rango:
        respuesta += 1
        n += 1
        #print(respuesta)
    
    if (n1 < n2):
       return print(f'\nLa resta entre {n1} y {n2} es: -{respuesta}')
    else:
       return print(f'\nLa resta entre {n1} y {n2} es: {respuesta}')
    
def main():
       n1 = int(input('Digite el primer número: '))
       n2 = int(input('Ingrese el segundo número: '))
       obtenerResta(n1, n2)
    
if __name__ == '__main__':
       main()