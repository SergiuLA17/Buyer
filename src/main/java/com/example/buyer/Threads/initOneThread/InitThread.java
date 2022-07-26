package com.example.buyer.Threads.initOneThread;

import com.example.buyer.Buyer.Buyer;
import org.springframework.stereotype.Component;

@Component
public class InitThread implements iInitThread{

    @Override
    public void start(int i, Buyer buyer) {
        Thread buyerThread = new Thread(buyer);
        buyerThread.setName("Buyer " + i);
        buyerThread.start();
    }
}
