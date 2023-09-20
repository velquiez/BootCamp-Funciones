class Fraccion: 
  
  def __init__(self, num=0, den=1):
    if isinstance(num,int):
      self.num = num            
    else: 
      self.num=0
    if isinstance(den,int) and den!=0:
      self.den = den            
    else: 
      self.den=1    
    self.simplifica()
    #self.imprime()

  def __str__(self):
    if self.den == 1:
      return str(self.num)
    else:
     return "(" + str(self.num) + "/" + str(self.den) + ")"
    
  '''def imprime(self):
    num = 3
    den = 5
    print('num local: ', num, 'den local: ', den)
    print('num global: ', self.num, 'den global: ', self.den)'''
    
  def simplifica(self):
    def mcd(num, den): # genera un ciclo si 'd' genera un entero se rompe ...o si 'd' llega a 0 y no ha generado entero se rompe el ciclo y queda la misma fracción inicial.
      if den == 0:
        return num
      else:
        print('yo soy den--> ', den)
        return mcd(den, num % den)
        #return print('yo soy den--> ', den)
    d = mcd(self.num, self.den)
    print('yo soy d--> ', d)
    self.num = int(self.num / d)
    self.den = int(self.den / d)

def main():
  a = Fraccion(35,25)
  print(a)

  b = Fraccion(15,4)
  print(b)

  print(id(a))  #posicion en memoria de fraccion a
  print(id(b))  #p.... de b
  #s = a.simplifica()
  #print(s)
  
if __name__ == '__main__':
  main()
