import tkinter
from tkinter import ttk

window = tkinter.Tk()
#print(type(window))
#import pprint
#pprint.pprint(dir(window)) #Para ver todas las funciones, metodos, clases que tiene tkinter

#Lo siguiente es geometria mediante grid
window.title('Mi Ventana - Agustin')
#window.columnconfigure(0, weight=1)
#window.columnconfigure(0, weight=3)

frame = ttk.Frame(window)
frame.grid(column=0, row=2, sticky=tkinter.W)

#Etiqueta
username_label = ttk.Label(frame, text='Username: ')
username_label.grid(column=0, row=0, sticky=tkinter.W, padx=5, pady=5)

#Etiqueta Contraseña
passwd_label = ttk.Label(frame, text='Passwd: ')
passwd_label.grid(column=0, row=1, sticky=tkinter.W, padx=5, pady=5)

window.mainloop()