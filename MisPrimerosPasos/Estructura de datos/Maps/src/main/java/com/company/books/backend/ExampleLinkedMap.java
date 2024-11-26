package com.company.books.backend;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExampleLinkedMap {//solo se puede in null en uno
    public static void main(String[] args) {
        Map<Integer, String> animales = new LinkedHashMap<>();
        animales.put(1,"Perro");
        animales.put(2,"Gato");//Omite este debido a que toma el ultimo con la misma Key
        animales.put(3,"Ajolote");
        animales.put(2,"Guajolote");
        animales.put(4,"Perico");
        animales.put(null,"Hormiga");
        animales.put(null,"León");//solo para las llaves puede haber un null y en caso de dos toma el ultimo
        System.out.println("Animales son: "+animales);

        animales.remove(1);
        System.out.println("Animales son: "+animales);


    }
}
