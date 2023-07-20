import time as t #Se importa el modulo import

h = t.strftime('%H') #Se guarda la hora actual en formato 24hrs
m = t.strftime('%M') #Se guardan los minutos

#print('hora :', h, ',minutos :', m)

if int(h) >= 19:
  print('Ha finalizado la jornada laboral.') 
else:
  h = 18 - int(h)
  m = 59 - int(m)
  print('<><><><><><><><><><><><><><><><><><><><><><><><><><><><>>> ')
  print('Falntan ', h, ' horas y ', m, ' minutos para salir del trabajo.')
  print('<><><><><><><><><><><><><><><><><><><><><><><><><><><><>>> ')


