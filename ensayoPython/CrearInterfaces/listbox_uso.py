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

lista = ['BullTerrier', 'Doberman', 'Pastor_Aleman', 'Pitbull']
lista_items = tkinter.StringVar(value=lista)

listbox = tkinter.Listbox(window, height=10, listvariable=lista_items)
listbox.grid(column=0, row=0, sticky=tkinter.W)

window.mainloop()