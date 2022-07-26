package com.example.buyer.Threads.initOneThread;

import com.example.buyer.Buyer.Buyer;
import org.springframework.stereotype.Component;

@Component
public interface iInitThread {
    void start(int i, Buyer buyer);
}
