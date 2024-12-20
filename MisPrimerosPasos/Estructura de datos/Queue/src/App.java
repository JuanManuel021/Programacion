import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {
        Queue<String> cola=new LinkedList<>();

        cola.offer("Persona 1");
        cola.offer("Persona 2");
        cola.offer("Persona 3");

        System.out.println("Elemento enfrente de queue "+cola.peek());

        while (!cola.isEmpty()){
            System.out.println("Elemento eliminado "+cola.poll());

        }
        System.out.println("La cola esta vacia "+cola.isEmpty());

    }
}
