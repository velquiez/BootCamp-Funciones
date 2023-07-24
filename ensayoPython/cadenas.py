t = 'Agustin'
n = 34
f = 0.5

def suma(x,y):
    return x + y

#print('Hola %s el numero es %d con %g decimas' % (t, n, f))
#print('El nombre es: %s' % t) #Va solo y sin paréntesis
#print('Hola {} el número es {} con {} décimas' .format(t, n, f))
#print('Hola {2} el número es {0} con {1} décimas' .format(t, n, f))
#print('Hola {n1} el número es {n2} con {n3} décimas' .format(n1=t, n2=n, n3=f))
text = f'Hola {t.upper()} el número es {suma(n,n)} con {f} décimasss'
print(text)

num = 551
print(type(num))

numtxt = str(num)
print(type(numtxt))

print(repr(num)) #Se utiliza para depurar y el desarrollo
print(numtxt) #Para mostar al público

print('-----------------------')

class Juguete():
    nombre = ''
    precio = 0.0

    def __init__(self, nombre, precio):
        self.nombre = nombre
        self.precio = precio

    def __str__(self):
      return f'Mi nombre es {self.nombre} y el precio {self.precio}'

j1 = Juguete('Hotwheels', 23.5)
print(j1)
print(type(j1))
demo = str(j1)
print(type(demo))
print(demo)








