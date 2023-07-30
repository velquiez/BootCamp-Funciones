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

#Etiqueta Usuario
username_label = ttk.Label(window, text='Username: ')
username_label.grid(column=0, row=0, sticky=tkinter.W, padx=5, pady=5)
#Campo  texto Usuario
username_entry = ttk.Entry(window)
username_entry.grid(column=1, row=0, sticky=tkinter.E, padx=5, pady=5)

#Etiqueta Contraseña
passwd_label = ttk.Label(window, text='Passwd: ')
passwd_label.grid(column=0, row=1, sticky=tkinter.W, padx=5, pady=5)
#Campo texto contraseña
passwd_entry = ttk.Entry(window, show='*')
passwd_entry.grid(column=1, row=1, sticky=tkinter.E, padx=5, pady=5)

#Boton
login_button = ttk.Button(window, text='Loguin')
login_button.grid(column=3, row=3, sticky=tkinter.E, padx=5, pady=5)
window.mainloop()