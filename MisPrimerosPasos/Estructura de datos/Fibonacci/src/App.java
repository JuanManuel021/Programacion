public class App {
    public static void main(String[] args) throws Exception {
        
 /*Escribe dos funciones recursivas, una que imprima los números de n a 1 en orden decreciente,
 y otra que los imprima de 1 a n en orden creciente, ejecuta el funcionamiento de ambas funciones desde el main.
Puntos clave:
Caso base: Si n == 0, no hay más números que imprimir.
Caso recursivo: Imprime n y llama recursivamente con n-1 (para decreciente) o con n+1 (para creciente).
Ej 1,2,3,4,5 y 5,4,3,2,1
Los metodos deben de ir dentro de la clase principal la cual se debe de llamar App*/
 

        int n=10;}

        public int asendiente(int n) {//delcaramos la funcion con los datos necesarios
            if (n != 0) {//condicional para que sea diferente de 0
                return asendiente(n - 1);//regresamos la multilicación y restandole sucesivamente n-1 
            } else {//en caso de que n sea 0 
                return 1;//regresa uno y volvemos al if inicial y empezamos a calcular el exponencial
            }
        }


    }







    

