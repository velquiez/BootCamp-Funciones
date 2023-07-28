lista = [1 == 3, 3 == 3, 5 == 5]

#any = or, or, or, or
res = any(lista) #con que una comparación sea verdadera da True
print(res)

print('-----------------------')


#all = and, and, and, and
res = all(lista) #todas las comparaciones deben ser verdaderas para True
print(res)