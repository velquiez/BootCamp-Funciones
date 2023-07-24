def main():

  listar = listarContenido()
  #print(listar)
  for usuario in listar:
    print(f'Usuario: {usuario}')
  

def listarContenido():

  f = open('C:/Users/USUARIO/Documents/bootcamp/ejercicios_python/listaFichero/Usuarios.txt' , 'r')
  datos = f.readlines()
  f.close()

  listaUsers = []

  for linea in datos:

    if linea[0]  == '#':
      continue

    if linea[0]  == '_':
      continue
    
    #print(linea)
    partes = linea.split(':')
    listaUsers.append(partes[0])
    #print(partes[0])
  return listaUsers

if __name__ == '__main__' :
 main()