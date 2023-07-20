import time  #Se importa el modulo import

h = time.strftime('%H') 
m = time.strftime('%M') 

#print('hora :', h, ',minutos :', m)

if int(h) >= 19:
  print('Ha finalizado la jornada laboral.') 
else:
  h = 18 - int(h)
  m = 59 - int(m)
  print('<><><><><><><><><><><><><><><><><><><><><><><><><><><><>>> ')
  print('Falntan ', h, ' horas y ', m, ' minutos para salir del trabajo.')
  print('<><><><><><><><><><><><><><><><><><><><><><><><><><><><>>> ')


