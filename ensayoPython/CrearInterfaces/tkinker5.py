import tkinter
from tkinter import ttk

window = tkinter.Tk()
#print(type(window))
#import pprint
#pprint.pprint(dir(window)) #Para ver todas las funciones, metodos, clases que tiene tkinter

#Lo siguiente es geometria grid
window.title('Mi Ventana - Agustin')

frame = ttk.Frame(window, border=1, borderwidth=2)
frame.grid(column=0, row=0, sticky=tkinter.W)

label = ttk.Label(frame, text='Quiubo')
label.grid(column=0, row=0, sticky=tkinter.W)

window.mainloop()
sys.exit(0)