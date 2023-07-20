def sum(**kwargs):
 
  print(kwargs)

sum(valor='esquivel', valor2=2, valor3='cesar')

def operaciones(x,y):
  return x + y, x - y, x * y, x / y

operar = operaciones(3,6)
print('La multiplicacion es: ', operar[2])