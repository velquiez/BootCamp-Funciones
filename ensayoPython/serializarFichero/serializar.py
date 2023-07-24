#convertir un objeto - programa y escribir sus datos en un fichero de texto.

import pickle

class Juguete():
    nombre = ''
    precio = 0.0

    def __init__(self, nombre, precio):
      self.nombre = nombre
      self.precio = precio

    def getNombre(self):
      return self.nombre

ob1 = Juguete('Hotwheels', 3.4)
print(type(ob1))
print(ob1.getNombre())
                                                                                                                                                                                   
f = open('datos.bin', 'wb')
pickle.dump(ob1,f)
f.close()
#f = open('datos.bin', 'rb')
#juguetes = pickle.load(f)
#f.close()

#print(type(juguetes))
#print(juguetes.getNombre(), 'precio: ', juguetes.precio)

class Estado():
   jugadores = Players()
   status = Status()
   life_remaining = 12
   armor = False

f = open('gamestatus.dat', 'rb')
e = Estado()
pickle.dumps(f)
f.close()

