package com.company.books.backend;

import java.util.HashMap;
import java.util.Map;

public class ExampleHashMap {
    public static void main(String[] args) {
        Map<Integer,String> frutas=new HashMap<>();
        frutas.put(0,"Guanabana");
        frutas.put(1,"Pera");
        frutas.put(2,"Uva");
        frutas.put(3,"Fresa");
        frutas.put(4,"Manzana");
        frutas.put(5,"Pera");
        System.out.println("Frutas despues de agregar"+frutas);
        for (Map.Entry<Integer,String>fruta:frutas.entrySet()){
            System.out.println("La fruta es "+fruta);}
    String fruta1=frutas.get(1);
        System.out.println("la fruta especifica es: "+fruta1);
        //eliminar
        frutas.remove(0);
        System.out.println("Frutas despuyes de eliminar "+frutas);
}


}
