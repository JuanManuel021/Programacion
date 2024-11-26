package com.company.books.backend;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExampleTreeMap {//no se puede poner id null
    public static void main(String[] args){
        Map<Integer,String>frutas= new TreeMap<>();
        frutas.put(1,"Frambueza");
        frutas.put(2,"Durazno");
        frutas.put(3,"Sandia");
        frutas.put(4,"Melon");
        System.out.println("Las frutas: "+frutas);//ordena por Id




}

}
