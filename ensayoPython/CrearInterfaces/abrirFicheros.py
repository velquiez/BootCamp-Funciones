import tkinter
from tkinter import filedialog
from tkinter import colorchooser

window = tkinter.Tk()
filename = filedialog.askopenfilename()
window.mainloop()

window = tkinter.Tk()
colorchooser.askcolor(initialcolor='#ffffff')