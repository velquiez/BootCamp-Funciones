#Algoritmo para saber si el anio es bisiesto


anio = int(input('Digite un ano: '))

def bisiesto(anio):

  if (anio % 4 == 0) and (anio % 100 != 0 or anio % 400 == 0):
    print('el anio ', anio, ' es bisiesto')
  else:
    print('el anio', anio, ' no es bisiesto')

bisiesto(anio)