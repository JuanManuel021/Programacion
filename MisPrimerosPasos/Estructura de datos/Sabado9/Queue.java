public class Queue<T> {
    int head; //index de la cabeza
    int tail; //index cola
    int intemsNumber; //numero de elementos actuales en la queue
    int arrLength; //capacidad de la queue
    T[] items; //items

    @SuppressWarnings("unchecked")
    Queue(int arrLength){
        this.head = 0;
        this.tail = -1;
        this.arrLength = arrLength;
        this.intemsNumber = 0;
        this.items = (T[]) new Object[arrLength];
    }

    public void offer(T item){
        if(isFull()){
            System.out.println("La Queue esta llena, no puedes agregar mas elementos");
            return;
        }
        tail=(tail+1)%arrLength; //indicador de tail en forma circular
        items[tail] = item;
        intemsNumber++;
    }

    public T poll(){
        if(isEmpty()){
            System.out.println("La Queue esta vacia");
            return null;
        }
        T item = items[head]; // seleccionar el item en la cabeza de la queue
        head = (head+1)%arrLength; // actualizar el indicador head de forma circulr
        intemsNumber--; // actualizar el numero de items actuales en la queue
        return item; // retorna el primer elemento en la queue
    }

    public T peek(){
        if (isEmpty()) {
            System.out.println("La Queue esta vacia");
            return null;
        }
        return items[head]; //selecciona y returna el elemento head
    }

    public boolean isEmpty(){
        return (intemsNumber == 0);
    }

    public boolean isFull(){
        return (intemsNumber == arrLength);
    }
}