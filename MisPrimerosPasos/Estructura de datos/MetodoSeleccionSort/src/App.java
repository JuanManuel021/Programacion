import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        int[] array = new int[10];

        // Llena el arreglo con números aleatorios entre 1 y 10
        for (int i = 0; i < array.length; i++) {
            Random random = new Random(); // Crea una nueva instancia de Random en cada iteración
            int x = random.nextInt(10) + 1; // Genera un número aleatorio entre 1 y 10 (inclusive)
            array[i] = x; // Asigna el número aleatorio generado al índice i del arreglo

        }
        System.out.println(Arrays.toString(array));

        int n = array.length;
        // Repetir n - 1 veces
        for (int i = 0; i < n - 1; i++) {
            // Establecer el primer elemento no ordenado como el mínimo
            int indice = i;

            // Comparar con los elementos no ordenados restantes
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[indice]) {
                    // Si el elemento es menor que el mínimo actual, establecerlo como el nuevo
                    // mínimo
                    indice = j;
                }
            }

            // Intercambiar el mínimo con la primera posición no ordenada
            if (indice != i) {
                int temp = array[i];
                array[i] = array[indice];
                array[indice] = temp;
            }System.out.println(Arrays.toString(array));
        }
        
    }
}
