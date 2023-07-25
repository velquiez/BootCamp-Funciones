#Crear y Escribir un fichero
#El archivo de texto se crea dentro de la carpeta 
#con dirección de donde este la terminal

nombre = input('Escriba su nombre: ')
apellido = input('Escriba su apellido: ')

#f = open('mifichero.txt', 'w') #NO cambia el contenido cuantas veces lo ejecute
f = open('miArchivo.txt', 'a') #Agrega contenido cuantas veces lo ejecute
f.write('Nombre: ', nombre)
f.write('\nApellido: ', apellido)
f.close()