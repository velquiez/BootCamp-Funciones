from misoperar import operaciones as o

n1 = float(input('Digete un número: '))
n2 = float(input('Escriba el segundo número: '))

print('sumar = 0 ; restar = 1 ; multiplicar = 2 ; dividir = 3')
t = int(input('Escoja el número de la operación aritmética: '))

def main():

  ob1 = o.aritmetica(n1,n2)
  print(f'El resultado de la operación escogida es: {ob1[t]}')

if __name__ == '__main__':
  main()