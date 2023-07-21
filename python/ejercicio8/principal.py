import operaciones as o

def main():

  x = float(input('Digite el primer numero: '))
  y = float(input('Escriba el segundo numero: '))
  print('-->> 0 = sumar ; 1 = restar ; 2 = multiplicar ; 3 = dividir') 
  tipOperar = int(input('Escoja el tipo de operacion aritmetica: '))

  operar = o.aritmetica(x,y)
  print('La operacion seleccionada da: ', operar[tipOperar])
  
if __name__ == '__main__' :
  main()
 