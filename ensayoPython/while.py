a = 3
b = 55
c = 2
contador = 0

while (c < 32 and b > 4):
  if(contador % 2 == 0):
    print(f'{b}, es un numero par')
    c += c + 1
    b += b - 2
    continue
  elif b == 5:
    a = c + b
    print(a)
    print(f'{c}, --> falta para llegar a 32')
    break
  c += a + 1
  b += b - 1