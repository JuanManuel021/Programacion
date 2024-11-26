import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        Stack<String> pila= new Stack<>();
        //agrega los elementos
        pila.push("Plato1");
        pila.push("Plato2");
        pila.push("Plato3");
        //toma el elemento pero no lo elimina
        System.out.println("Primer elemtno en salir es "+pila.peek());
        //evalua si esta vacia
        System.out.println("Pila Vacia? "+pila.isEmpty());

        while (!pila.isEmpty()) {
            //toma el elemento pero lo va eliminando 
            System.out.println("Elemento eliminado "+pila.pop());           
        }
        System.out.println("Pila es vacia "+pila.isEmpty());

    }
}
