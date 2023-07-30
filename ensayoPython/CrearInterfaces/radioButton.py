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

selec = tkinter.StringVar()
r1 = ttk.Radiobutton(window, text='sí', value='1', variable=selec)
r2 = ttk.Radiobutton(window, text='no', value='2', variable=selec)
r3 = ttk.Radiobutton(window, text='quizás', value='3', variable=selec)

r1.grid(column=0, row=1, padx=5, pady=5)
r2.grid(column=0, row=2, padx=5, pady=5)
r3.grid(column=0, row=3, padx=5, pady=5)

selec2 = tkinter.StringVar()
rb1 = ttk.Radiobutton(window, text='Deacuerdo', value='1', variable=selec)
rb2 = ttk.Radiobutton(window, text='Inconforme', value='2', variable=selec)
rb3 = ttk.Radiobutton(window, text='Neutro', value='3', variable=selec)

rb1.grid(column=2, row=1, padx=5, pady=5)
rb2.grid(column=2, row=2, padx=5, pady=5)
rb3.grid(column=2, row=3, padx=5, pady=5)

window.mainloop()