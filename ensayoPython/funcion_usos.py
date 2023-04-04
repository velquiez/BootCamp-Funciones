def matematica(a,b):
  def suma(a,b):
    print(a+b)
  def resta(a,b):
    print(a-b)

  suma(a,b)
  resta(a,b)

matematica(3,6)

#------------------#

temperatura = 12.0

def temperatur(nombre):
  calor = 6.0
  print('Temperatura con variable globlal: ',temperatura)
  print('Hola, ', nombre,'la temperatura es de ', calor)

temperatur('Cesar')

#----------------------#

calor = 12.0

def temperatur(nombre):

  global calor #Cambia el valor de la variable global /calor
  calor = 6.0
  print('Temperatura con variable globlal: ',calor)
  print('Hola, ', nombre,'la temperatura es de ', calor)

temperatur('Cesar')
print(calor)

#-----------------#

def minombre(nombre='Amigo'): #funcion con parametros opcionales
  print('hola, ',nombre)

minombre()
minombre('Cesar')

#-------------------------#

def suma(a=1, b=4, c=2):   # parametro opcionnal o todos o el ultimo
  print(a+b+c)

suma()
suma(5)
suma(2,3,6)
suma(b=3,a=1,c=1)
suma(b=1)

#------------------------#

def sum(*args):
  resultado = 0

  for arg in args:
    resultado += arg
 
  print(resultado)

sum(2,1,1,1,1,2,1)  #Se obtine una tupla de valores / inmodificable

#---------------------------#

def sum(**kwargs):
 
  print(kwargs)

sum(valor='esquivel', valor2=2, valor3='cesar')  #Se obtine un diccionario modificable

#---------------------------#

def sum(**kwargs):

  for key, value in kwargs.items():
    print(key, '=', value)

sum(valor='esquivel', valor2=2, valor3='cesar')  #Se obtine un diccionario modificable


#---------------------------#

def sum(**kwargs):

  #if 'esquivel' not in kwargs:
   #return

  if('esquivel' in kwargs or kwargs['valor']=='esquivel'):
    print('hola, Cesar ')

sum(valor='esquivel', valor2=2, valor3='cesar')  #Se obtine un diccionario modificable

#-------------------------------------#

def operaciones(a,b):

  return a+b, a-b, a*b, a/b

resultado = operaciones(3,5)
print(resultado)

#--------------------#

def operaciones(a,b):

  return a+b, a-b, a*b, a/b

resultado = operaciones(3,5)
print('la resta es: ', resultado[2])

#------------------------------#


def operaciones(a,b):

  return a+b, a-b, a*b, a/b

suma, resta, multi, divi = operaciones(3,5)
print(suma)
print(resta)
print(multi)
print(divi)

#------------------------------#

def sumador(**kwargs):
  inicial = kwargs['inicial'] if 'inicial' in kwargs else 0
  final = kwargs['final'] if 'final' in kwargs else 89
  #final = kwargs['final'] ? kwargs ['final'] = 0  en otros lenguajes de progrmacion

  resultado = 0
  for x in range(inicial, final+1):
    resultado += x

  return resultado

print('usando variables terniarias: ')
print(sumador(final=53))  #puedo dejarlo sin parametros

#-----------------------------#

anonima = lambda: print('quiubo')
anonima()

anonima = lambda nombre, apellido: print('quiubo', nombre, 'chao', apellido)
anonima('Cesar','Esquivel')

#--------------------------#

def sumatoria(x):
  return x + x

sumatoria = lambda x: x+x
print(sumatoria(2))

#---------------------#











