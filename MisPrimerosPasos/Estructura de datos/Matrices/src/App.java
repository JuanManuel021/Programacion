import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        // Crea una matriz de 3x3 llamada matrizUno
        int[][] matrizUno = new int[3][3];

        // Llena la matrizUno con números aleatorios entre 1 y 10
        for (int i = 0; i < matrizUno.length; i++) { // Recorre las filas de la matriz
            for (int j = 0; j < matrizUno[i].length; j++) { // Recorre las columnas de la matriz
                Random random = new Random(); // Crea una instancia de Random para generar números aleatorios
                int x = random.nextInt(10) + 1; // Genera un número aleatorio entre 1 y 10
                matrizUno[i][j] = x; // Asigna el número generado a la posición correspondiente en la matriz
            }
        }

        // Imprime el contenido de matrizUno
        System.out.println("El arreglo uno es: ");
        for (int i = 0; i < matrizUno.length; i++) { // Recorre las filas de la matriz
            for (int j = 0; j < matrizUno[i].length; j++) { // Recorre las columnas de la matriz
                System.out.print(matrizUno[i][j] + " "); // Imprime cada valor de la matriz en la misma fila
            }
            System.out.println(" "); // Salto de línea al final de cada fila
        }

        // Crea una segunda matriz de 3x3 llamada matrizDos
        int[][] matrizDos = new int[3][3];

        // Llena la matrizDos con números aleatorios entre 1 y 10
        for (int i = 0; i < matrizDos.length; i++) { // Recorre las filas de la matriz
            for (int j = 0; j < matrizDos[i].length; j++) { // Recorre las columnas de la matriz
                Random random = new Random(); // Crea otra instancia de Random
                int x = random.nextInt(10) + 1; // Genera un número aleatorio entre 1 y 10
                matrizDos[i][j] = x; // Asigna el número generado a la posición correspondiente en la matriz
            }
        }

        // Imprime el contenido de matrizDos
        System.out.println("El arreglo dos es: ");
        for (int i = 0; i < matrizDos.length; i++) { // Recorre las filas de la matriz
            for (int j = 0; j < matrizDos[i].length; j++) { // Recorre las columnas de la matriz
                System.out.print(matrizDos[i][j] + " "); // Imprime cada valor de la matriz en la misma fila
            }
            System.out.println(" "); // Salto de línea al final de cada fila
        }

        // Crea una tercera matriz llamada matrizResultado para almacenar la suma de matrizUno y matrizDos
        int[][] matrizResultado = new int[3][3];

        // Llena matrizResultado con la suma de los elementos correspondientes de matrizUno y matrizDos
        for (int i = 0; i < matrizResultado.length; i++) { // Recorre las filas
            for (int j = 0; j < matrizResultado[i].length; j++) { // Recorre las columnas
                matrizResultado[i][j] = matrizUno[i][j] + matrizDos[i][j]; // Suma los elementos de la misma posición en matrizUno y matrizDos
            }
        }

        // Imprime el contenido de matrizResultado
        System.out.println("El arreglo de resultado es: ");
        for (int i = 0; i < matrizResultado.length; i++) { // Recorre las filas de la matriz
            for (int j = 0; j < matrizResultado[i].length; j++) { // Recorre las columnas de la matriz
                System.out.print(matrizResultado[i][j] + " "); // Imprime la suma de los valores en cada posición
            }
            System.out.println(" "); // Salto de línea al final de cada fila
        }

        // Inicializa la variable suma para almacenar la suma de los elementos de la diagonal principal de matrizUno
        int suma = 0;

        // Recorre la matrizUno para sumar solo los elementos de la diagonal principal
        for (int i = 0; i < matrizUno.length; i++) { // Recorre las filas
            for (int j = 0; j < matrizUno[i].length; j++) { // Recorre las columnas
                if (i == j) { // Condición para identificar los elementos de la diagonal principal (cuando el índice de fila y columna son iguales)
                    suma = suma + matrizUno[i][j]; // Suma los elementos de la diagonal principal
                }
            }
        }

        // Imprime la suma de los elementos de la diagonal principal de matrizUno
        System.out.println("La Suma de la diagonal del arreglo uno es: " + suma); // Imprime la suma de la diagonal principal
    }
}


