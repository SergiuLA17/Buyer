package com.example.buyer.service.RandomNumber;

import org.springframework.stereotype.Component;

@Component
public class RandomNumber implements iRandomNumber {

    public int get(){
        return 10 + (int) (Math.random() * 30);
    }
}
