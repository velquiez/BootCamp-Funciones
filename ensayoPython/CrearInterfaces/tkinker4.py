import tkinter
from tkinter import ttk
import random

window = tkinter.Tk()
#print(type(window))
#import pprint
#pprint.pprint(dir(window)) #Para ver todas las funciones, metodos, clases que tiene tkinter

#Lo siguiente es geometria absoluta
window.title('Mi Ventana - Agustin')

colors = ['red', 'orange', 'blue', 'yellow', 'white', 'black', 'green']

for x in range(0, 10):
    color = random.randint(0, len(colors)-1)
    color2 = random.randint(0, len(colors)-1)
    alto = random.randint(40,150)
    ancho = random.randint(30,70)

    label = tkinter.Label(window, text='Etiqueta!', bg=colors[color], fg=colors[color2])
    label.place(x=random.randint(0,100), y=random.randint(0,100), width=ancho, height=alto)

window.mainloop()