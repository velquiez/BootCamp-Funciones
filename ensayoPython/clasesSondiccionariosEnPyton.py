#Las clases en python son diccionarios.
print('$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$')

def enciende(nombre):
  print ('Se llama a enciende: ', nombre)

diccionario = {
  'enciende': enciende
}

diccionario['enciende']('bueno...listo')