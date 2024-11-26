
import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        int[] array = new int[10];

        // Llena el arrayeglo con números aleatorios entre 1 y 10
        for (int i = 0; i < array.length; i++) {
            Random random = new Random(); // Crea una nueva instancia de Random en cada iteración
            int x = random.nextInt(10) + 1; // Genera un número aleatorio entre 1 y 10 (inclusive)
            array[i] = x; // Asigna el número aleatorio generado al índice i del arrayeglo

        }
        System.out.println(Arrays.toString(array));

        int contador = 0; // Contador de intercambios
        int indexOfLastUnsortedElement = array.length;
        boolean swapped;
        
        do {
            swapped = false; // Variable para verificar si hubo intercambios
            for (int i = 1; i < indexOfLastUnsortedElement; i++) {
                if (array[i - 1] > array[i]) {
                    // Intercambiar elementos
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true; // Hubo un intercambio
                    contador++; // Incrementar contador de intercambios
                }
            }
            indexOfLastUnsortedElement--; // Reducir el rango de elementos a ordenar
        } while (swapped); // Repetir mientras haya intercambios
        
        // Imprimir resultados
        System.out.println("arrayay ordenado: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        
    }
    
}
