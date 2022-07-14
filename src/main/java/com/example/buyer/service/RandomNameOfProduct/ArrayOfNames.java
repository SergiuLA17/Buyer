package com.example.buyer.service.RandomNameOfProduct;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class ArrayOfNames {
    ArrayList<String> arrayOfNames  = new ArrayList<>();

    public void add(String name){
        arrayOfNames.add(name);
    }

    public ArrayOfNames() {
        arrayOfNames.add("Potato");
        arrayOfNames.add("Salt");
        arrayOfNames.add("Sugar");
        arrayOfNames.add("Apple");
        arrayOfNames.add("Banana");
        arrayOfNames.add("Kiwi");
        arrayOfNames.add("Mango");
        arrayOfNames.add("Orange");
        arrayOfNames.add("Pear");
        arrayOfNames.add("Peach");
    }

    public String get(){
        System.out.println(arrayOfNames);
        return arrayOfNames.get((int) (Math.random() * arrayOfNames.size()));
    }
}
