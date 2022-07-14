package com.example.buyer.service.RandomNameOfProduct;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class ArrayOfNames implements iArrayOfNames {
    private final ArrayList<String> arrayOfNames  = new ArrayList<>();

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
        return arrayOfNames.get((int) (Math.random() * arrayOfNames.size()));
    }
}
