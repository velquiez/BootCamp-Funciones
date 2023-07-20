from Restar import Resta
from Sumar import Suma
from Multiplicar import Multipli

def main():

  ob1 = Resta.resta()
  print(ob1)

  ob2 = Resta.me_llamo()
  print('Aplico la resta desde: ', ob2)

  print('')
  print('-----------------------')

  ob3 = Multipli.multipli()
  print(ob3)

  ob4 = Multipli.me_llamo()
  print('Aplico la multiplicación desde: ', ob4)

  print('')
  print('-----------------------')
  

if __name__ == '__main__':
 main()