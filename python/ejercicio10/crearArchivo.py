#crear un archivo py donde creéis un archivo txt, lo abráis y escribáis dentro del archivo. 
#Para ello, tendréis que acceder dos veces al archivo creado.

miLista = []
op = 'si'

def guardarUsuario():
  
  global op
  
  while op == 'si':

    miLista.append(input('Escriba - nombre: '))
    miLista.append(input('Digite - apellido: '))

    print('Desea agregar un nuevo Usuario -->> si // no')
    op = input('Escriba -->> si // no *Enter: ')


def escribe(archivotxt, datos):
    
    f = open('archivo.txt', 'a') #Agrega contenido cuantas veces lo ejecute

    c = 0

    for linea in datos:
        
      if c == 0:

        linea = linea + ' '
        print(linea)
        f.write(linea)
        c = c + 1
        continue
	        
      else:
   
          if not linea.endswith('\n'):
            linea = linea + '\n'
            print(linea)
            f.write(linea)
            c = 0
            continue 
    
    f.close()

def main():
  guardarUsuario()
  escribe('archivo.txt',miLista)

if __name__ == '__main__':
    main()