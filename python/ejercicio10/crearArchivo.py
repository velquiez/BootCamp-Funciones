#Crear y Escribir un fichero
#El archivo de texto se crea dentro de la carpeta 
#con dirección de donde este la terminal

miLista = []
op = 'si'

def agregaUsuario():
  
  global op
  
  while op == 'si':

    miLista.append(input('Escriba - nombre: '))
    miLista.append(input('Digite - apellido: '))

    print('Desea agregar un nuevo Usuario -->> si // no')
    op = input('Escriba -->> si // Enter: ')


def escribe(archivotxt, datos):
    
    f = open('archivo.txt', 'a') #Agrega contenido cuantas veces lo ejecute

    for linea in datos:
           
        if not linea.endswith('\n'):
            #print('linea sin \\n :', linea)
            print(linea)
            linea = linea + '\n'
        f.write(linea)
    
    f.close()

def main():
  agregaUsuario()
  escribe('archivo.txt',miLista)

if __name__ == '__main__':
    main()