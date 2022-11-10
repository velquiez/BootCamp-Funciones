print('Calcular el Indice de Masa Muscular - IMC')
peso = float(input('Digite su peso en Kg, por favor: '))
estatura = float(input('Ahora su estatura en mt, por ejemplo: <<1.67>>, digitela: '))

import math
imc = math.ceil(float(peso//estatura**2))
print(f'su indice de masa corporal es {imc:.2f}')

input('Precione una tecla para salir')
