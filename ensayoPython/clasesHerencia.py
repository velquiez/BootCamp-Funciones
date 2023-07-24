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
  
  print(dir()) #Muestra todo lo que se hereda

def main():
  p = Dino('\naqui estoy')
  p.enciende()
  print(p.isEncendido())
  print(dir()) #Muestra todo lo que se hereda

if __name__ == '__main__':
  main()