public class Queue<T> {
    private int capacidad;
    private int tail;
    private int head;
    private T[] items;
    private int itemsNumber;

    @SuppressWarnings("unchecked")
    public Queue(int capacidad) {
        this.capacidad = capacidad;
        this.tail = -1;
        this.head = 0;
        this.items = (T[]) new Object[capacidad];
        this.itemsNumber = 0;
    }


    public void offer(T item) {
        if (isFull()) {
            System.out.println("La cola está llena.");
            return;
        }
        tail = (tail + 1) % capacidad;
        items[tail] = item;
        itemsNumber++;
    }


    public T poll() {
        if (isEmpty()) {
            System.out.println(" Está vacía la cola ");
            return null;
        }
        T item = items[head];
        head = (head + 1) % capacidad;
        itemsNumber--;
        return item;
    }

    private boolean isFull() {
        return itemsNumber == capacidad;
    }

    boolean isEmpty() {
        return itemsNumber == 0;
    }

    public void mostrar() {
        if (isEmpty()) {
            System.out.println("La cola está vacía.");
            return;
        }
        System.out.print("Cola: ");
        for (int i = 0; i < itemsNumber; i++) {
            int index = (head + i) % capacidad;
            System.out.print(items[index] + " ");
        }
        System.out.println();
    }

    public int size() {
        return itemsNumber;
    }
}
