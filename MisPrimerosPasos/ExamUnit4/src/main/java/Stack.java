public class Stack<T> {
    int index;
    int capacidad;
    T[] items;

    @SuppressWarnings("unchecked")
    Stack(int capacidad){
        this.index=-1;
        this.capacidad=capacidad;
        this.items=(T[]) new Object[capacidad];

    }
    public void push(T item){
        if(isFull()) {
            System.out.println("El stack ya esta lleno");
        }
        items[++index] = item;
        return;
    }
    public T pop(){
        if(isEmpty()){
            System.out.println("El Stack esta vacio");
            return null;
        }

        return items[index--];
    }
    private boolean isFull() {
        if(capacidad==capacidad){
        }
        return true;
    }
    boolean isEmpty() {
        if(capacidad==0){

        }
        return true;
    }
}






