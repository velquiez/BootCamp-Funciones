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

def miFuncion():
    #pass
    print('\nse realizó en 1\n')

selec1 = tkinter.StringVar()
selec2= tkinter.StringVar()
selec3 = tkinter.StringVar()

checkbox1 = ttk.Checkbutton(window, text='Acepto', variable=selec1, command=miFuncion)
checkbox2 = ttk.Checkbutton(window, text='No acepto', variable=selec2)
checkbox3 = ttk.Checkbutton(window, text='No sabe', variable=selec3)

checkbox1.grid(column=0, row=1, padx=5, pady=5)
checkbox2.grid(column=0, row=2, padx=5, pady=5)
checkbox3.grid(column=0, row=3, padx=5, pady=5)



window.mainloop()