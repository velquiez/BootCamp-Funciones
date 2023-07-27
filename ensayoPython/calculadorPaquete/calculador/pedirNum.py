import aritmetica as a
import math

def pedirDatos():

    a = float(input('Digite primer número: '))
    b = float(input('Escriba segundo número: '))

    op = int(input('Escoja -->> 0=suma; 1=resta; multiplicación=2; división=3: '))
    print('^^^^^^--------^^----------^^^^^')

    respuesta = math.pi * (a + b)* op
    return print('\nRespuesta: ', respuesta)
    #resultado = aritmetica(a,b)
    #return print('El resultado es: ', resultado[op])