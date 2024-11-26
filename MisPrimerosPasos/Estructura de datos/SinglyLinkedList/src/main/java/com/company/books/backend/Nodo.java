package com.company.books.backend;

public class Nodo {
    private Integer valor;
   private  Nodo siguiente;

    Nodo(Integer valor){
        this.valor=valor;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
