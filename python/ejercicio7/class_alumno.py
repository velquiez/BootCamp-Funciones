class Alumno:

  def __init__(self, nombre, nota):
   self.nombre = nombre
   self.nota = nota

  def aprueba(self):
   if self.nota < 3:
     print('El estudiante ', self.nombre,  ' no aprueba')
   else:
     print('el estudiante ', self.nombre, ' ha aprobado con una nota de: ', self.nota)

nombre = input('Digite el nombre del estudiante: ')
nota = float(input('Digite la nota: '))

alum = Alumno(nombre, nota)

alum.aprueba()

