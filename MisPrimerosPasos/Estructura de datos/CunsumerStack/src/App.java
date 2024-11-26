import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
      /*
        Pila<String> pila=new Pila<>(3);
        pila.push("plato 1");
        pila.push("plato 2");
        pila.push("plato 3");

        System.out.println("Elemento de la pila "+pila.peek());

        System.out.println("Pila vacia "+pila.isEmpty());

        while (!pila.isEmpty()) {
            System.out.println("elemento eliminado "+pila.pop());
            
        }
        System.out.println("Pila vacia "+pila.isEmpty());


       String valor="hola mundo";
       
        String nuevaCadena="";

        for (int i = 0; i < valor.length(); i++) {
            nuevaCadena=nuevaCadena+valor.charAt(valor.length()-i-1);
            
        }
        System.out.println(nuevaCadena);*/

//ejemplo de uso de pilas
        String ecuacion="(a+b)(d+c";
        char variable;
         Stack<Character> pila2 = new Stack<>();

        for (int i = 0; i < ecuacion.length(); i++) {
            variable=ecuacion.charAt(i);
         if (variable=='('){
            pila2.push('9');

         }else if (variable==')') {
            pila2.pop();
         }

        
    }
    System.out.println();
    System.out.println("La ecuación no tiene todos sus ) de cierre "+!pila2.isEmpty());
}
}
