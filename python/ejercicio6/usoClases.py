class Vehiculo:
  color = None
  ruedas = None
  puertas = None

  def __init__(self, rueda):
   self.color = 'verde'
   self.ruedas = rueda
   self.puertas = 5

class Coche(Vehiculo):
  velocidad = 220
  cilindrada = 7200

  def Acelerar(self):
    self.velocidad += 8

a = Coche(4)
#a.ruedas = 3
a.Acelerar()
print('El coche es : ',a.color, ' y tiene ', a.puertas, ' puertas')
print('Con una cantidad de ', a.ruedas, ' ruedas')
print('Y alcanza una velocidad de ', a.velocidad, 'km/h, gracias a una cilindrada de: ', a.cilindrada, ' ccc')