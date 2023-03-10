lista = [1,2,'cesar',5]

for valor in lista:
  print(valor)

r = 4
a = -1
for i in range(a,r):
 b=a+i
 print(b)


#caso especial for con else

lista2 = ['tango', 2, 'desayuno', 'caracol']

for palabra in lista2:
  if palabra == 'caracol':
     print('Palabra encontrada')
     break
else:
  print('No he encontrada palabra caracol')
