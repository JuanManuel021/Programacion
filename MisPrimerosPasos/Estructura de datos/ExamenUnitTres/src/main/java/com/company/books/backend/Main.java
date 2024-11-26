package com.company.books.backend;

public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        lista.insertar(5);
        lista.insertar(10);
        lista.insertar(2);
        lista.insertar(7);



        System.out.println("Valor minimo en lista: " + lista.encontrarMinimo());
    }
}





class Nodo {
            int valor;
            Nodo siguiente;

            public Nodo(int valor) {
                this.valor = valor;
                this.siguiente = null;
            }
        }

        class ListaEnlazada {
            private Nodo cabeza;

            public void insertar(int valor) {
                Nodo nuevoNodo = new Nodo(valor);
                if (cabeza == null) {
                    cabeza = nuevoNodo;
                } else {
                    Nodo actual = cabeza;
                    while (actual.siguiente != null) {
                        actual = actual.siguiente;
                    }
                    actual.siguiente = nuevoNodo;
                }
            }




            public int encontrarMinimo() {
                if (cabeza == null) {
                    System.out.println("La lista está vacía.");
                }
                int minimo = cabeza.valor;
                Nodo actual = cabeza;
                while (actual != null) {
                    if (actual.valor < minimo) {
                        minimo = actual.valor;
                    }
                    actual = actual.siguiente;
                }
                return minimo;
             }
        }


