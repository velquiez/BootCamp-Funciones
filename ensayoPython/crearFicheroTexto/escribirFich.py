#Crear y Escribir un fichero
#El archivo de texto se crea dentro de la carpeta 
#con dirección de donde este la terminal

#f = open('mifichero.txt', 'w') #NO cambia el contenido cuantas veces lo ejecute
f = open('mifichero.txt', 'a') #Agrega contenido cuantas veces lo ejecute
f.write('datos\n')
f.write('datos2')
f.close()