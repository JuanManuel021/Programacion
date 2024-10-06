import java.lang.classfile.instruction.StoreInstruction;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // Declarando
        int[] arra1;

        // Inicializado
        int[] arr2 = new int[5];// se declara el arreglo
        arr2[0] = 1;// se le pone el valor en el indice 0
        arr2[1] = 2;// se le pone el valor en el indice 1
        arr2[2] = 3;// se le pone el valor en el indice 2
        arr2[3] = 4;// se le pone el valor en el indice 3
        arr2[4] = 5;// se le pone el valor en el indice 4
        // int [] arr3= [1,2,3,4,5];

        System.out.println(arr2);
        // fori
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        // fore
        // Tipo de dato
        // Variable de control i
        // que vas a recorrer
        for (int i : arr2) {
            System.out.print(i);

        }

        Random random = new Random();
        int x = random.nextInt(100) + 1;
        System.out.println(random);
        System.out.println(Arrays.toString(arr2));

        Persona[] persona = new Persona[3];// se crea el arreglo de la clase persona
        Persona p1 = new Persona("Juan", 21);// se le dan los valores a p1 de la clase persona
        Persona p2 = new Persona("Eliel", 50);// se le dan los valores a p2 de la clase persona
        Persona p3 = new Persona("Jose", 30);// se le dan los valores a p3 de la clase persona
        Persona p4 = new Persona("Maria", 32);// se le dan los valores a p4 de la clase persona
        Persona p5 = new Persona("Manuel", 33);// se le dan los valores a p5 de la clase persona

        persona[0] = p1;// se le pasan los valores al indice 0 al arreglo de la clase persona
        persona[1] = p2;// se le pasan los valores al indice 1 al arreglo de la clase persona
        persona[2] = p3;// se le pasan los valores al indice 2 al arreglo de la clase persona
        persona[3] = p4;// se le pasan los valores al indice 3 al arreglo de la clase persona
        persona[4] = p5;// se le pasan los valores al indice 4 al arreglo de la clase persona

        for (Persona per : persona) {// foreach
            System.out.print("SU NOMBRE ES: " + per.getName() + " ");// se obtiene el nombre del arreglo de la clase
                                                                     // persona en la posicion per
            System.out.print("SU EDAD ES: " + per.getEdad() + " ");// se obtiene el edad del arreglo de la clase persona
                                                                   // en la posicion per
            System.out.println("EL NUMERO ALEATORIO ES: " + per.numeroRamdom() + " ");// se obtiene el numero del metodo
                                                                                      // que genera un numero aleatorio
        }

        int suma = 0;// declaro una variable donde voy a guardar los datos sumados del arreglo
        for (int i : arr2) {// foreach de arr2
            suma = suma + i;// obtengo el dato del arreglo y lo sumo con la variable suma
        }
        System.out.println("La suma de los valore es: " + suma);// imprimo suma

        int valorAlto = 0;// declaro una variable para almacenar el valor maximo
        for (int i : arr2) {// declaro foreach
            if (i > valorAlto) {// creo una condicional para ir comparando el valor del arreglo
                valorAlto = i;// si es mayo se almacena en la variable
            }
        }
        System.out.println("El valor mas alto es: " + valorAlto);// imprimo el valor mas alto
    }

}
