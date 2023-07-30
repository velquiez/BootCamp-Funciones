import tkinter
#from tkinter import ttk

window = tkinter.Tk()
#print(type(window))
#import pprint
#pprint.pprint(dir(window)) #Para ver todas las funciones, metodos, clases que tiene tkinter

#Lo siguiente es geometria absoluta
window.title('Mi Ventana - Agustin')



#Etiqueta Usuario
username_label = tkinter.Label(window, text='Username: ')
username_label.place(x=15, y=20)
#Campo  texto Usuario
username_entry = tkinter.Entry(window)
username_entry.place(x=80, y=20)

#Etiqueta Contraseña
contrasena_label = tkinter.Label(window, text='Passwd: ')
contrasena_label.place(x=15, y=60)
#Campo  texto contraseña
contrasena_entry = tkinter.Entry(window)
contrasena_entry.place(x=80, y=60)

#Boton
login_button = tkinter.Button(window, text='Loguin')
login_button.place(x=40, y=100, width=180, height=30)

window.mainloop()