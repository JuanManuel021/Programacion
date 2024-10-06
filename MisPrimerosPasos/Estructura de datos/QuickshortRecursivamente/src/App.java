import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
       
        int[] array={9,7,5,11,12,2,14,3,10,6};
        System.out.println("arreglo original");
        System.out.println(Arrays.toString(array));
        Operaciones op= new Operaciones();
       int []arrSorted=op.quickSort(array, 0, array.length-1);
        System.out.println(Arrays.toString(arrSorted));
    }
}
