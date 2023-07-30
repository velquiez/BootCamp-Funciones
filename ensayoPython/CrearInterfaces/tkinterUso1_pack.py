import tkinter

window = tkinter.Tk()
#print(type(window))
#import pprint
#pprint.pprint(dir(window)) #Para ver todas las funciones, metodos, clases que tiene tkinter

#Lo siguiente es geometria mediante pack
label_saludo = tkinter.Label(window, text='quiubo!', bg='red', fg='white')
label_saludo.pack(ipadx=50, ipady=60, fill='both')

label_saludo = tkinter.Label(window, text='chao', bg='black', fg='white')
label_saludo.pack(ipadx=40, ipady=50, fill='both')

window.title('Mi Ventana - Agustin')

window.mainloop()