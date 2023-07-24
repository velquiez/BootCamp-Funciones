import numpy as np
n = 10
A = np.random.rand(n, n)
b = np.random.rand(n)

alpha = 3 * n
ADD = np.dot(A, A.T) + alpha * np.identity(n)

matriz = ADD
print(matriz) 