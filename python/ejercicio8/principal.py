#Ejecutar con python version 3.10 en adelante

import operaciones as o

def main():

  x = float(input('Digite el primer numero: '))
  y = float(input('Escriba el segundo numero: '))
  print('-->> 1 = sumar ; 2 = restar ; 3 = multiplicar ; 4 = dividir') 
  tipOperar = int(input('Escoja el tipo de operacion aritmetica: '))

  match tipOperar:
    case 1:
       operar = o.sumar(x,y)
    case 2:
       operar = o.restar(x,y)
    case 3:
       operar = o.multiplicar(x,y)
    case 4:
       operar = o.dividir(x,y)
 
if __name__ == '__main__' :
  main()
  
 