#from aritmetica import aritmeticas as arit
#from aritmetica import aritmeticas
import math

class pedirDatos():

    a = 0
    b = 0
    op = 0

    def __init__(self):
       #super().__init__(master)
       #self.master = master
       self.pedirN()
       self.llamarAritmetica()
       print('soy contructor pedirNum.py')

    def pedirN(self):
      
      global a,b,op

      a = float(input('Digite primer número: '))
      b = float(input('Escriba segundo número: '))

      op = int(input('Escoja -->> 0=suma; 1=resta; multiplicación=2; división=3: '))
      print('^^^^^^--------^^----------^^^^^')
      
      return a,b,op
      #return op
    
    '''def llamarAritmetica(self):
       resultado = aritmetica.aritmeticas.aritmetic(aritmetica,a,b)
       return print('El resultado es: ', resultado[op])'''

