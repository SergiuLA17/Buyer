package com.example.buyer.Threads.StartAllThreads;

import com.example.buyer.Buyer.Buyer;
import com.example.buyer.Threads.initOneThread.CreateOneThread;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StartAllthreads implements iStartAllThreads {
    @Autowired
    Buyer buyer;
    @Autowired
    CreateOneThread initOneThread;

    @Override
    public void initThreads() {
        for (int i = 0; i < 99; i++) {
            initOneThread.start(i,buyer);
        }
    }
}
