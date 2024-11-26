import java.util.ArrayList;
import java.util.List;


public class Utils {
            public static void main(String[] args) {

            Stack<Integer> pila= new Stack<>(10);
            Queue<Integer> cola= new Queue<>( 10);


            pila.push(3);
            pila.push(2);
            pila.push(1);

            cola.offer(10);
            cola.offer(20);
            cola.offer(30);


            List<Integer> resultado = intercalaPilaCola(pila, cola);
            System.out.println("Resultado: " + resultado);
        }
    public static List<Integer> intercalaPilaCola(Stack<Integer> pila, Queue<Integer> cola) {
        List<Integer> resultado = new ArrayList<>();


        while (!pila.isEmpty() || !cola.isEmpty()) {

            if (!pila.isEmpty()) {
                resultado.add(pila.pop());
            }else if(pila==null){
                resultado.add(0);
            }

            if (!cola.isEmpty()) {
                resultado.add(cola.poll());
            }else if(cola==null){
            resultado.add(0);
        }
        }

        return resultado;
    }
    }





