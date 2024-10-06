public class Operaciones {

    // Método para sumar dos arreglos
    public int[] suma(int arrregoUno[], int arregloDos[]) {
        // Crea un arreglo para almacenar el resultado de la suma
        int resultadoSuma[] = new int[5];
        // Recorre cada elemento de los arreglos
        for (int i = 0; i < resultadoSuma.length; i++) {
            resultadoSuma[i] = arrregoUno[i] + arregloDos[i]; // Suma los elementos correspondientes
        }
        return resultadoSuma; // Retorna el arreglo con el resultado de la suma
    }

    // Método para multiplicar dos arreglos
    public int[] multiplicacion(int arrregoUno[], int arregloDos[]) {
        // Crea un arreglo para almacenar el resultado de la multiplicación
        int resultadoMultiplicacion[] = new int[5];
        // Recorre cada elemento de los arreglos
        for (int i = 0; i < resultadoMultiplicacion.length; i++) {
            resultadoMultiplicacion[i] = arrregoUno[i] * arregloDos[i]; // Multiplica los elementos correspondientes
        }
        return resultadoMultiplicacion; // Retorna el arreglo con el resultado de la multiplicación
    }

    // Método para concatenar dos arreglos
    public int[] concadenacion(int arregloUno[], int arregloDos[]) {
        // Crea un arreglo para almacenar el resultado de la concatenación
        int resultadoConcadenacion[] = new int[arregloDos.length + arregloUno.length];
        // Copia los elementos del primer arreglo
        for (int i = 0; i < arregloUno.length; i++) {//For para recorrer elementos
            resultadoConcadenacion[i] = arregloUno[i]; // Asigna el elemento del primer arreglo
        }
        // Copia los elementos del segundo arreglo
        for (int j = 0; j < arregloDos.length; j++) {//For para recorrer elementos
            resultadoConcadenacion[j + arregloUno.length] = arregloDos[j]; // Asigna el elemento del segundo arreglo
        }
        return resultadoConcadenacion; // Retorna el arreglo con la concatenación de ambos
    }

    // Método para eliminar elementos repetidos de un arreglo
    public int[] eliminarRepetidos(int[] arr) {
        // Crea un arreglo temporal del mismo tamaño que el original
        int[] temporal = new int[arr.length];

        // Variable contador para llevar el número de elementos únicos encontrados
        int contador = 0;

       
        for (int i = 0; i < arr.length; i++) {//For para recorrer elementos
            // Variable para verificar si el valor actual ya fue encontrado
            boolean repetido = false;//declaro repetido

            // Bucle interno para comparar el elemento actual de `arr` con los elementos ya añadidos al arreglo temporal
            for (int j = 0; j < contador; j++) {//For para recorrer elementos
                // Si el valor actual de `arr[i]` ya está en `temporal`, lo marcamos como repetido
                if (arr[i] == temporal[j]) {//evalua que en la posicion sean iguales 
                    repetido = true;// se cambia le valor de boleano a true 
                    break; // Salimos del bucle si encontramos un repetido
                }
            }

            // Si no se encontró repetido, lo añadimos al arreglo temporal
            if (!repetido) {//condicional para verificar que resultado es diferente 
                temporal[contador] = arr[i]; // Agrega el valor actual de `arr[i]` al arreglo temporal
                contador++; // Incrementa el contador de elementos únicos
            }
        }

        // Crea un nuevo arreglo con el tamaño exacto del número de elementos únicos
        int[] resultado = new int[contador];

        // Copia los valores únicos del arreglo temporal al nuevo arreglo resultado
        for (int i = 0; i < contador; i++) {//For para recorrer los elementos 
            resultado[i] = temporal[i];//Tepral en la posicion i lo guarda en resultado
        }

        // Retorna el nuevo arreglo que contiene solo los valores únicos
        return resultado;
    }
}

