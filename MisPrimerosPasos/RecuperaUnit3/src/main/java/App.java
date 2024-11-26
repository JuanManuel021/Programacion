public class App {
        public static void main(String[] args) {
            ListasEnlazadas lista=new ListasEnlazadas();
            lista.ponerNodo(10);
            lista.ponerNodo(20);
            lista.ponerNodo(30);
            lista.buscar(20);
        }
    }