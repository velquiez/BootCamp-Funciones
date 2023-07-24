print('Calcular el Indice de Masa Muscuar - IMC')
peso = input('Digite su peso en Kg, por favor: ')
estatura = input('Ahora su estatura en mt, por ejemplo: <<1.67>>, digitela: ')
#import math
#imc = math.ceil(float(peso)/float(estatura)**2)
imc = float(peso)/float(estatura)**2
print(f'Tu indice de masa corporal es {imc:.2f}')
#input('Precione una tecla para salir')
