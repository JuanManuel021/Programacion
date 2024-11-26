import java.util.LinkedList;
import java.util.Queue;

public class Clinica {
    //public static void main(String args[]){
     Queue<Persona> cola=new LinkedList<>();

     Persona p1=new Persona("Juan",123,23);

     cola.offer(p1);

  //   System.out.println("Persona es "+cola.peek().toString());

while(!cola.isEmpty()){
     System.out.println("Se Atendio a "+cola.poll().toString());
}
     System.out.println("la cola esta vacia "+cola.isEmpty());
   
}
}