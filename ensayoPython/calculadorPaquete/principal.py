from calculador.pedirNum import pedirDatos as p
from calculador.aritmetica import aritmeticas as ar

def main():
  elecc = p.pedirN(p)
  print(elecc)
  a = elecc[0]
  b = elecc[1]
  op = elecc[2]

  resul = ar.aritmetic(ar,a,b)
  print(resul[op])

if __name__ == '__main__':
    main()