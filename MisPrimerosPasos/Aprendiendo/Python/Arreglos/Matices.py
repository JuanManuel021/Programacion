# Crear un arreglo bidimensional de 3 filas y 3 columnas
matriz = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]








# Acceder al elemento en la fila 1, columna 2 (número 3)
print(matriz[0][2])  # Salida: 3










# Cambiar el valor del elemento en la fila 2, columna 1 (número 5) a 99
matriz[1][1] = 99
print(matriz)  # Salida: [[1, 2, 3], [4, 99, 6], [7, 8, 9]]











# Recorrer el arreglo usando bucles for
for fila in matriz:
    for elemento in fila:
        print(elemento, end=" ")
    print()  # Salto de línea al final de cada fila





# Crear una matriz 3x3 llena de ceros
matriz = [[0 for _ in range(3)] for _ in range(3)]
print(matriz)  # Salida: [[0, 0, 0], [0, 0, 0], [0, 0, 0]]







# Matrices de ejemplo
matriz1 = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]
matriz2 = [
    [9, 8, 7],
    [6, 5, 4],
    [3, 2, 1]
]

# Crear una matriz para almacenar la suma
resultado = [[0 for _ in range(3)] for _ in range(3)]

# Sumar las matrices
for i in range(len(matriz1)):  # Recorre las filas
    for j in range(len(matriz1[0])):  # Recorre las columnas
        resultado[i][j] = matriz1[i][j] + matriz2[i][j]

print(resultado)  # Salida: [[10, 10, 10], [10, 10, 10], [10, 10, 10]]
