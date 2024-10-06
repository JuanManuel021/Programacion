import java.util.Arrays;

public class Operaciones {
    public int[] quickSort(int[] array, int inicio, int fin) {
        if (inicio < fin) {
            int indicePivote = particion(array, inicio, fin);

            quickSort(array, inicio, indicePivote - 1);
            quickSort(array, indicePivote + 1, fin);

        }

        return array;
    }

    public int particion(int[] array, int inicio, int fin) {
        int pivote = array[fin];
        int i = inicio - 1;
        for (int j = inicio; j < fin; j++) {
            if (array[j] < pivote) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;

            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[fin];
        array[fin] = temp;

        return i + 1;
    }
}
