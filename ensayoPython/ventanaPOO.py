import tkinter as tk
from tkinter import Button

class Aplicacion(tk.Frame):

    def __init__(self, master = None):
        super().__init__(master)
        self.master = master
        self.pack()
        self.create_widgets()

    def create_widgets(self):
        window.title('Saludo usuario')
        window.geometry('250x150')

        self.btn_hola = Button(self, text='Quiubo', command=self.say_hi)
        self.btn_hola.pack(side='top')

        self.quit = Button(self, text='QUIT', fg='red', command=self.master.destroy)
        self.quit.pack(side='bottom')

    def say_hi(self):
        print('hi there, everyone!')

window = tk.Tk()
app = Aplicacion(master=window)
app.mainloop()