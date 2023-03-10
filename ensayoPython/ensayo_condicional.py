a=2
b = 4
c = 7

condicion = (a > b) or (c > a)

if condicion:
 print('estoy dentro del if')
 k = c + b  #se cumple esta primera condicion entonces no ejecuta las demas
elif k > 4:
 print('segundo if')
elif k < 9:
 print('k no es menor a 9')
elif k == 9:
 print('k es igual al 9')
elif k == 9:
 print('k es igual a 9 - ya se ejecuto')
else:
 print('sali del if')


lista = ['a', 2, 'c', 3, 67, 'k']

if 'c' in lista:
 print('He encontrado la letra >> C <<')

if 'm' not in lista:
 print('La letra >> m << no existe en la lista')
