package com.company.books.backend;

public class SinglyLinkedList {
    Nodo cabeza;

    SinglyLinkedList(){
        this.cabeza=null;
    }
    public void putNodo(Integer valor){
     Nodo nuevoNodo=new Nodo(valor);//Creación de un nuevo nodo
     if (cabeza==null) {
         cabeza=nuevoNodo;
     }else{
         Nodo temporal=cabeza;//comenzamos desde el inicio o sea la cabeza
         while (temporal.getSiguiente()!=null){//mientras el siguiente valor no sea null recorrer
             temporal=temporal.getSiguiente();
         }
         temporal.setSiguiente(nuevoNodo);
     }
    }
    public void show(){
        Nodo temporal=cabeza;
        while (temporal!=null){
            System.out.print(temporal.getValor()+"-->");
            temporal=temporal.getSiguiente();
        }
        System.out.println("null");
    }
    public void obtener(int valorBuscar){
        if (cabeza==null) {
            System.out.println("La lista esta vacia");
        }else if(cabeza!=null){
            Nodo temporal=cabeza;
            boolean encontrado=false;
            while (temporal!=null){
                if (temporal.getValor()==valorBuscar){
                    System.out.println(temporal.getValor());
                    encontrado=true;
                    break;
                }

                temporal=temporal.getSiguiente();

               }
            if(!encontrado){
                System.out.println("El valor no se encontro");
            }

        }



    }
}
