package com.company.books.backend;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
    Random rand = new Random();
    int x;
    SinglyLinkedList lista=new SinglyLinkedList();
    lista.putNodo(x=rand.nextInt(20));
    lista.putNodo(x=rand.nextInt(20));
    lista.putNodo(x=rand.nextInt(20));
    lista.putNodo(x=rand.nextInt(20));
    lista.putNodo(x=rand.nextInt(20));
    lista.show();
    lista.obtener(12);
    }
}