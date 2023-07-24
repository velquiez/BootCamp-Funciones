lista = ['\n','Augustos\n', 'Cesars', 'Manuels\n', 'Jhons\n']

def escribe(fichero, datos):
    f = open('mifichero4.txt', 'a') #Agrega contenido cuantas veces lo ejecute

    for linea in datos:

        if not linea.endswith('\n'):
            print('linea sin \\n :', linea)
            linea = linea + '\n'
        f.write(linea)
    
    f.close()

escribe('mifichero4.txt',lista)