import java.util.Random; // Importa la clase Random para generar números aleatorios

public class App {
    public static void main(String[] args) throws Exception {

         // Crea un arreglo de 5 elementos llamado arrregoUno
        int[] arrregoUno = new int[5];
        // Llena el arreglo con números aleatorios entre 1 y 10
        for (int i = 0; i < arrregoUno.length; i++) {
            Random random = new Random(); // Crea una instancia de Random
            int x = random.nextInt(10) + 1; // Genera un número aleatorio entre 1 y 10
            arrregoUno[i] = x; // Asigna el número aleatorio al arreglo
        }
        
        // Imprime el mensaje del tipo de arreglo
        System.out.print("El arreglo uno es: ");
        for (int i = 0; i < arrregoUno.length; i++) {
            System.out.print(arrregoUno[i] + " "); // Imprime cada elemento del arreglo
        }
        System.out.println(" "); // Salto de línea

        // Crea otro arreglo de 5 elementos llamado arregloDos
        int[] arregloDos = new int[5];
        // Llena el segundo arreglo con números aleatorios entre 1 y 10
        for (int j = 0; j < arregloDos.length; j++) {
            Random random = new Random(); // Crea una nueva instancia de Random
            int x = random.nextInt(10) + 1; // Genera un número aleatorio entre 1 y 10
            arregloDos[j] = x; // Asigna el número aleatorio al arreglo
        }

        // Imprime el contenido del segundo arreglo
        System.out.print("El arreglo dos es: ");
        for (int i = 0; i < arregloDos.length; i++) {//For para recorrer los elementos 
            System.out.print(arregloDos[i] + " "); // Imprime cada elemento del arreglo
        }
        System.out.println(""); // Salto de línea

        // Imprime un arreglo con elementos repetidos
        System.out.print("El con repetido: ");
        int[] arregloConRepetidos = { 1, 2, 2, 5, 6, 1, 3, 3 }; // Arreglo con valores duplicados
        for (int i = 0; i < arregloConRepetidos.length; i++) {//For para recorrer los elementos 
            System.out.print(arregloConRepetidos[i] + " "); // Imprime cada elemento del arreglo
        }
        System.out.println(""); // Salto de línea

        // Crea una instancia de la clase Operaciones
        Operaciones op = new Operaciones();

        // Calcula y muestra la suma de los dos arreglos
        System.out.print("La suma es: ");
        int suma[] = op.suma(arrregoUno, arregloDos); // Llama al método suma
        for (int i = 0; i < suma.length; i++) {//For para recorrer los elementos 
            System.out.print(+suma[i] + " "); // Imprime cada elemento del arreglo de suma
        }

        System.out.println(" "); // Salto de línea
        
        // Calcula y muestra la multiplicación de los dos arreglos
        System.out.print("La Multiplicación es: ");
        int multiplicacion[] = op.multiplicacion(arrregoUno, arregloDos); // Llama al método multiplicacion
        for (int k = 0; k < multiplicacion.length; k++) {//For para recorrer los elementos 
            System.out.print(+multiplicacion[k] + " "); // Imprime cada elemento del arreglo de multiplicación
        }

        System.out.println(" "); // Salto de línea
        
        // Calcula y muestra la concatenación de los dos arreglos
        System.out.print("La concatenacion es: ");
        int concadenacion[] = op.concadenacion(arrregoUno, arregloDos); // Llama al método concatenacion
        for (int k = 0; k < concadenacion.length; k++) {//For para recorrer los elementos 
            System.out.print(+concadenacion[k] + " "); // Imprime cada elemento del arreglo concatenado
        }

        // Elimina los valores repetidos del arreglo y muestra el resultado
        int[] arregloSinRepetidos = op.eliminarRepetidos(arregloConRepetidos); // Llama al método eliminarRepetidos

        System.out.println(""); // Salto de línea
        System.out.print("Arreglo sin repetidos: ");
        for (int i = 0; i < arregloSinRepetidos.length; i++) {//For para recorrer los elementos 
            if (i > 0) {//condicional para evaluar en la posicion i 
                System.out.print(", "); // Imprime una coma entre elementos
            }
            System.out.print(arregloSinRepetidos[i]); // Imprime cada elemento del arreglo sin repetidos
        }
        System.out.println(); // Salto de línea
    }
}

