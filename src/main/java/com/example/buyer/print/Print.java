package com.example.buyer.print;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class Print {
    @Autowired
    PrintInfoAboutRequest printInfoAboutRequest;

    @Autowired
    PrintInfoAboutResponse printInfoAboutResponse;

    public void print(String name){
        printInfoAboutRequest.print(name);
    }

   public void print(ResponseEntity<String> response){
        printInfoAboutResponse.print(response);
    }

}
