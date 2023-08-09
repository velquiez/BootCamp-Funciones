from tkinter import ttk
from tkinter import *
from tkinter import messagebox
import sqlite3
#from turtle import title

#Se crea interfaz principal
window = Tk()
window.title('Registro de Usuarios')
window.geometry('600x350')

id = StringVar()
nombre = StringVar()
cargo = StringVar()
salario = StringVar()

def crearBD():
    conn = sqlite3.connect('miaplica')
    cursor = conn.cursor()

    try:            #CREATE TABLE IF NOT EXISTS empleado --> con except no hay necesidad
        cursor.execute('''
          CREATE TABLE empleado( 
          id INTEGER PRIMARY KEY AUTOINCREMENT,
          nombre VARCHAR(50) NOT NULL,
          cargo VARCHAR(50) NOT NULL,
          salario INT NOT NULL);                             
          ''')
        
        messagebox.showinfo('CONEXION', 'Se ha creado la BD.')
        conn.close()
    except:
        messagebox.showinfo('CONEXION', 'Ya existe la BD; se realizó la conexión')

def eliminarBD():
    conn = sqlite3.connect('miaplica')
    cursor = conn.cursor()

    if messagebox.askyesno(message = 'Los datos se perderan definitivamente, desea continuar?', title = 'ADVERTENCIA'):
        cursor.execute('DROP TABLE empleado')
    else:
        pass
    limpiar()
    mostrar()

def salirAplicacion():
    valor = messagebox.askquestion('Salir', '¿Está seguro que desea salir?')
    if valor == 'yes':
        window.destroy()

def limpiar():
    id.set('')
    nombre.set('')
    cargo.set('')
    salario.set('')

def mensaje():
    acerca = '''Aplicación CRUD
                Versión 1.0
                Tecnología Python Tkinter
                  '''
    messagebox.showinfo(title='INFORMACIÓN', message=acerca)

################# Métodos CRUD #####################

def crear():
    conn = sqlite3.connect('miaplica')
    cursor = conn.cursor()

    try:
        datos = nombre.get(), cargo.get(), salario.get()
        cursor.execute("INSERT INTO empleado VALUES(NULL, ?, ?, ?)", (datos))
        conn.commit()
    except:
        messagebox.showwarning('ADVERTENCIA', 'Algo falló, compruebe conexión con la BD')
        pass
    limpiar()
    mostrar()

def mostrar():
    conn = sqlite3.connect('miaplica')
    cursor = conn.cursor()

    registros = tree.get_children()

    for elemento in registros:
        tree.delete(elemento)
    
    try:
        cursor.execute('SELECT * FROM empleado')

        for row in cursor:
            tree.insert("",0,text = row[0], values = (row[1], row[2], row[3]))

    except:
        pass


#######################  crear Tabla #####################

tree = ttk.Treeview(height=10, columns=('#0', '#1', '#2'))
tree.place(x=0, y=130)
tree.column('#0', width=100)
tree.heading('#0', text='ID', anchor=CENTER)
tree.heading('#1', text='Nombre - Empleado', anchor=CENTER)
tree.heading('#2', text='Cargo', anchor=CENTER)
tree.column('#3', width=100)
tree.heading('#3', text='Salario', anchor=CENTER)

def seleccionarConClick(event):
    item = tree.identify('item', event.x, event.y)
    id.set(tree.item(item,'text'))
    nombre.set(tree.item(item,'values')[0])
    cargo.set(tree.item(item,'values')[1])
    salario.set(tree.item(item,'values')[2])

tree.bind("<Double-1>", seleccionarConClick)


def actualizar():
    conn = sqlite3.connect('miaplica')
    cursor = conn.cursor()

    try:
        datos = nombre.get(), cargo.get(), salario.get()
        cursor.execute("UPDATE empleado SET nombre = ?, cargo = ?, salario = ? WHERE id = "+id.get(), (datos))
        conn.commit()
    except:
        messagebox.showwarning('ADVERTENCIA', 'No se pudo actualizar el registro.')
        pass
    limpiar()
    mostrar()

def eliminarRegistro():
    conn = sqlite3.connect('miaplica')
    cursor = conn.cursor()

    try:
        if messagebox.askyesno(message='Confirma que desea borrar el registro', title='ADVERTENCIA'):
            cursor.execute('DELETE FROM empleado WHERE id = ' + id.get())
            conn.commit()
    except:
        messagebox.showwarning('ADVERTENCIA', 'No se pudo eliminar el registro.')
        pass
    limpiar()
    mostrar()


############ Widgets #######################

menubar = Menu(window)
menubasedat = Menu(menubar, tearoff=0)
menubasedat.add_command(label = 'Crear/Conectar con BD', command = crearBD)
menubasedat.add_command(label = 'Eliminar BD', command = eliminarBD)
menubasedat.add_command(label = 'Salir', command = salirAplicacion)
menubar.add_cascade(label = 'Inicio', menu = menubasedat )

ayudamenu = Menu(menubar, tearoff=0)
ayudamenu.add_command(label = 'Reseterar campos', command = limpiar)
ayudamenu.add_command(label = 'Acerca', command = mensaje)
menubar.add_cascade(label = 'Ayuda', menu = ayudamenu)

################### Etiquetas - Cajas de texto ###########
e1 = Entry(window, textvariable = id)

l2 = Label(window, text = 'Nombre')
l2.place(x=50, y=10)
e2 = Entry(window, textvariable=nombre, width=50)
e2.place(x=100, y=10)

l3 = Label(window, text = 'Cargo')
l3.place(x=50, y=40)
e3 = Entry(window, textvariable=cargo)
e3.place(x=100, y=40)

l4 = Label(window, text = 'Salario')
l4.place(x=280, y=40)
e4 = Entry(window, textvariable=salario, width=10)
e4.place(x=320, y=40)

l5 = Label(window, text='USD')
l5.place(x=380, y=40)

###################### Botones #####################

b1 = Button(window, text='Crear Registro', command = crear)
b1.place(x=50, y=90)
b2 = Button(window, text='Modificar Registro', command = actualizar)
b2.place(x=180, y=90)
b3 = Button(window, text='Mostrar Lista', command = mostrar)
b3.place(x=320, y=90)
b4 = Button(window, text='Eliminar Registro', bg='red', command = eliminarRegistro)
b4.place(x=450, y=90)

window.config(menu = menubar)

window.mainloop()