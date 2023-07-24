class piscina():
  
  _profundidad = 0
  _calidadAgua = ''
  mallaVoleibol = 0
  piscinaN = 0
  
  def salvavidas(self, activar):
    if activar == True:
      print('Aplicar primeros auxilios\n')
    else:
      print('Llamar una ambulancia.\n')

class cancha():
  
  piscinas = piscina()
  estadoCancha = 'Disponible\n'
  limpiarCancha = 'Sí\n'

  def horarioCancha(self, hora):
    if hora == 9:
      print('Reservada a las 9\n')
    elif hora == 11:
      print('Reserva para las 11\n')
    else:
      print('Horas disponible: 9 y 11\n')

class parqueInfantil():
  
  canchas = cancha()
  culumpios = 3
  subebaja = 2
  rueda = 'gira y gira\n'