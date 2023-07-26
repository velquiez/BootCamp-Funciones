lista = [1,2,'cesar',5]

for valor in lista:
  print(valor)

r = 4
a = -1
p = 1
for i in range(a,r, p):
 b=a
 print(b)


#caso especial for con else

lista2 = ['tango', 2, 'desayuno', 'caraco']

for palabra in lista2:
  if palabra == 'caracol':
     print('Palabra encontrada')
     break
else:
  print('No he encontrada palabra caracol')
