# Crear el array
mi_array = [10, 20, 30, 40, 50]

# Ver el array original
print("Array original:", mi_array)

# Acceder al primer valor
print("Primer valor:", mi_array[0])

# Modificar el segundo valor
mi_array[1] = 25

# Ver el array modificado
print("Array modificado:", mi_array)




import random

# Crear un array con 5 números enteros aleatorios entre 1 y 100
mi_array = [random.randint(1, 50) for _ in range(1)]




# Ver los valores generados
print("Array con enteros aleatorios:", mi_array)
