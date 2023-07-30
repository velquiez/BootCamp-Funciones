import tkinter
from tkinter import ttk

window = tkinter.Tk()

#Lo siguiente es geometria mediante grid
window.title('Mi Ventana - Agustin')
#window.columnconfigure(0, weight=1)
#window.columnconfigure(0, weight=3)

def miFuncion(event):
    #pass
    print('\nse realizó en 1\n')

def miFuncion2(event):
    #pass
    print('\nse realizó click en dos\n')

def salir(event):
    #pass
    print('\nChao bambino\n')
    window.quit()

boton = tkinter.Button(window, text='Acepto')
boton.place(x=20, y=30)
boton.bind('<Button-1>', miFuncion)
boton.bind('<Double-1>', miFuncion2)

boton = tkinter.Button(window, text='Salir')
boton.place(x=60, y=30)
boton.bind('<Button-1>', salir)

window.mainloop()