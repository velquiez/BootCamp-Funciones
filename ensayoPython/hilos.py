import _thread
import time

def horaActual(nombre_thread, tiempo_espera):
    time.sleep(tiempo_espera)
    print(f'Quiubo: {nombre_thread} - {time.ctime(time.time())}')
    print('Quiubo')

    count = 0

    while count < 5:
       time.sleep(tiempo_espera)
       count += 1
       print(f'Quiubo: {nombre_thread} - {time.ctime(time.time())}')

_thread.start_new_thread(horaActual, ('thread_uno', 1))
_thread.start_new_thread(horaActual, ('thread_dos',2))

while True:
  time.sleep(1)