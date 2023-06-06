class Dino:
  encendido = True
  
  def apaga(self):
    pass

d = Dino()
d.encendido = False
print(d.encendido)

#En Python no existe el concepto de public, private, protectec
#En Python todo es publico

#################################

class Dino:
  _encendido = True
  
  def enciende(self):
    self._encendido = True

  def apaga(self):
    self._encendido = False

  def isEncendido(self):
    return self._encendido

d = Dino()
d.apaga()
print(d.isEncendido())

d2 = Dino()
d2.enciende()


print(d.isEncendido())

##################################
#La clases estatica no crean nuevos 
#espacios de memoria

class Estatica:

  numero = 1

  def incrementa():
    Estatica.numero += 1

Estatica.incrementa()
print(Estatica.numero)

#####################################
##HERENCIA

class Juguete:
  _encendido = True
  
  def __init__(self, x):
    print('contructor clase juguete ',x)

  def enciende(self):
    self._encendido = True

  def apaga(self):
    self._encendido = False

  def isEncendido(self):
    return self._encendido

#Clase Dino que hereda de clase juguete

class Dino(Juguete):
  salta = 'salta alto'

  def quieto(self):
    self.salta = 'quieto'
    print('////////////')

  def estado(self):
   return self.salta

p = Dino('aqui estoy')
p.enciende()
print(p.isEncendido())
print(dir()) #Muestra todo lo que se hereda

print('$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$')
#Herencia multiple
#La clase base 'Juguete' se deja de ultima

class nino(Dino, Juguete):
  def salta(self):
    pass

h = nino('aqui estoy2')
h.quieto()
print(h.estado())

print('##################################')

#/////////////////////////////////////////////
#Contructor y destructor
#En python no es necesario usar el destrutor 
#se puede forzar su uso.

class Dino(Juguete):
  color = None
  nombre = None

  def __init__(self, nombre): #Constructor
    self.color = "Verde"
    self.nombre = nombre

  def __del__(self):
    print('Este es el desctructor de la clase',self.__class__)

  def verEscamas(self):
    pass

p = Dino('miDino')
print(p.color)
print(p.nombre)


print('ensayo2')
del(p) #Desaloja memoria eliminando 'p'
print('ya se tuvo que invocar el destructor')

print('##################################')

class Dino(Juguete):
  color = None
  nombre = None

  def __init__(self, nombre):
    #Juguete.__init__(self,nombre) #1ra opcion instanciar construtor de la clase padre
    super().__init__(nombre)	#2da opcion / mas utilizada
    self.color = "Verde"
    self.nombre = 'Cesar'

#Las clases en python son diccionarios.
print('$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$')

def enciende(nombre):
  print ('Se llama a enciende: ', nombre)

diccionario = {
  'enciende': enciende
}

diccionario['enciende']('bueno...listo')


#Clases abstractas
print('$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$')

from abc import ABC, abstractmethod

class animal(ABC):
  @abstractmethod
  def sonido(self):
    pass

  #@abstractmethod
  def saluda(self):
    print('Buenas')

class perro(animal):
  def sonido(self):
    print('Guau')

class gato(animal):
  def sonido(self):
    print('Miau')


p = perro()
p.sonido()
#p.saluda()

g = gato()
g.sonido()


#Clase HAS-A
print('$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$')

class Motor():
  tipo = 'Diesel'

class Llantas():
  cantidad = 5
  
  def cambiarCantidad(self, valor):
    self.cantidad = valor

class Ventanas():
  cantidad = 6

class Carroceria():
  ventanas = Ventanas()
  llantas = Llantas()

class Automo():
  motor = Motor()
  carroceria = Carroceria()

a = Automo()
print('Motor es ', a.motor.tipo)
print('Ventanas ', a.carroceria.ventanas.cantidad)

a.carroceria.llantas.cambiarCantidad(3)

print('Llantas ', a.carroceria.llantas.cantidad)

print('$$$$$$$$$$$$$$#$$$$$$$$$$$$$$$$$$$$$$$$')

class Categorias:
 idCategoria = 44
 nombre = 'pajarito'

class Provedores:
 idProvedor = 0
 nombre = 'Arturo Calle'

class Productos:
 idproducto = 0
 categoriaProduc = Categorias()
 precio = 0
 tamano = 0
 tipoProduc = 0
 CIFproduc = Provedores()

p = Productos()
print(p.CIFproduc.nombre)
print(p.categoriaProduc.idCategoria)




