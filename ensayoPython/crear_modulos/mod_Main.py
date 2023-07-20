import operaciones as o

def main():

  print(o.pi)  


  sum = o.suma(3,5)
  print('Hola en main(): ', sum)

  print(o.como_me_llamo())

  op = o.Operador()
  print(op.multipli(4,3))

if __name__ == '__main__': #Tiene que ser en main es minuscula
  main()