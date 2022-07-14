package com.example.buyer.service.RandomNameOfProduct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ArrayController implements iElementGetter {
    @Autowired
    private ArrayOfNames arrayOfNames;

    public String get() {
        return arrayOfNames.get();
    }

}
