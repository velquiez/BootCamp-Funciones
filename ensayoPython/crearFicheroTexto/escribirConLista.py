#Crear y Escribir un fichero
#El archivo de texto se crea dentro de la carpeta 
#con dirección de donde este la terminal

#f = open('mifichero.txt', 'w') #NO cambia el contenido cuantas veces lo ejecute
f = open('mifichero2.txt', 'a') #Agrega contenido cuantas veces lo ejecute

lista = ['Augusto\n', 'Cesar\n', 'Manuel\n', 'Jhon\n']

f.writelines(lista)
f.close()